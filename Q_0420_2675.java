//https://www.acmicpc.net/problem/2675
import java.util.Scanner;

public class Q_0420_2675 {

	public static void main(String[] args) {
		
		//테스트 케이스 개수 입력
		Scanner stdin = new Scanner(System.in);
		int cases = stdin.nextInt();
		
		String result[] = new String[2];
		
		//for문 돌면서 케이스에 (반복횟수, string) 입력
		for(int i=0; i<cases; i++){
			
			//" "을 기준으로 각 배열에 담기 arr[0] arr[1]
			Scanner stdin2 = new Scanner(System.in);
			String each_case = stdin2.nextLine();
			
			String arr[] = each_case.split(" ");
			int count = arr[0].charAt(0)-'0'; //[반복횟수 부분] string을 char로 바꿔서 또 int형으로 변환
			String str = arr[1]; //[문자열 부분]
			
			result[i] = replay(count, str);
			
		}
		
		System.out.println("\n" + result[0] + "\n" + result[1]);
		
	}
	
	private static String replay(int cnt, String str){
		
		String new_str =""; //반복 완료후 최종으로 담길 String
		
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<cnt; j++){
				//str.charAt(i)이 두번째 배열방에 담긴 문자열중 i번째 문자
				//이 char형이었던 i번째 문자를 String형으로 변환
				//그리고 concat()으로 반복횟수만큼 문자열을 붙임
				new_str = new_str.concat( String.valueOf(str.charAt(i)) );
				
			}
		}
		
		return new_str;
		
	}

}

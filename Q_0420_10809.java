//https://www.acmicpc.net/problem/10809

/*
 * 예제 입력 String 배열방을 돌면서
 * 소문자 a~z까지 아스키코드 97~122를 이용
 */
import java.util.Scanner;

public class Q_0420_10809 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int result[] = new int[26]; //검사 결과가 담길 int배열방
		
		int ascii=97; //a~z  -->  97~122 아스키코드값
		int alpha[] = new int[26]; //알파벳 26개 방에 각자의 아스키코드값을 넣음
		
		for(int i=0;i<alpha.length;i++){
			alpha[i]=ascii;
			ascii++;
			result[i] = -1; //초기화
		}
		
		// baekjoon 문자열 입력
		String input_str = stdin.nextLine();
		
		//문자열을 문자배열방에 넣음 b a e k j o o n
		char input_chr[] = input_str.toCharArray();
		
		//문자배열방과 알파벳 아스키코드 배열방을 비교
		for(int i=0; i<input_str.length(); i++){
			for(int j=0; j<alpha.length; j++){
				
				//문자배열의 아스키코드값이 알바벳 아스코드 값과 같다면
				if((int)input_chr[i]==alpha[j]){
					if(result[j]==-1)	result[j]=i; //처음 등장하는 위치일때만 갱신					
					break;
				}
			}
		}
		
		//결과 출력
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+ " ");
		}
			
	}
}

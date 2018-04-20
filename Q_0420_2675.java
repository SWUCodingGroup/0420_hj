//https://www.acmicpc.net/problem/2675
import java.util.Scanner;

public class Q_0420_2675 {

	public static void main(String[] args) {
		
		//�׽�Ʈ ���̽� ���� �Է�
		Scanner stdin = new Scanner(System.in);
		int cases = stdin.nextInt();
		
		String result[] = new String[2];
		
		//for�� ���鼭 ���̽��� (�ݺ�Ƚ��, string) �Է�
		for(int i=0; i<cases; i++){
			
			//" "�� �������� �� �迭�� ��� arr[0] arr[1]
			Scanner stdin2 = new Scanner(System.in);
			String each_case = stdin2.nextLine();
			
			String arr[] = each_case.split(" ");
			int count = arr[0].charAt(0)-'0'; //[�ݺ�Ƚ�� �κ�] string�� char�� �ٲ㼭 �� int������ ��ȯ
			String str = arr[1]; //[���ڿ� �κ�]
			
			result[i] = replay(count, str);
			
		}
		
		System.out.println("\n" + result[0] + "\n" + result[1]);
		
	}
	
	private static String replay(int cnt, String str){
		
		String new_str =""; //�ݺ� �Ϸ��� �������� ��� String
		
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<cnt; j++){
				//str.charAt(i)�� �ι�° �迭�濡 ��� ���ڿ��� i��° ����
				//�� char���̾��� i��° ���ڸ� String������ ��ȯ
				//�׸��� concat()���� �ݺ�Ƚ����ŭ ���ڿ��� ����
				new_str = new_str.concat( String.valueOf(str.charAt(i)) );
				
			}
		}
		
		return new_str;
		
	}

}

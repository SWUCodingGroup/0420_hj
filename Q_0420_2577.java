//https://www.acmicpc.net/problem/2577
import java.util.Scanner;

public class Q_0420_2577 {

	public static void main(String[] args) {

		// ���� �Է� �ޱ�
		Scanner stdin = new Scanner(System.in);
		int num1 = stdin.nextInt();
		int num2 = stdin.nextInt();
		int num3 = stdin.nextInt();
		
		// 3�� �Է� �� ���� ����
		if((valid(num1)==0) || (valid(num2)==0) || (valid(num3)==0)){
			System.out.println("���� ������ ��ȿ���� �ʽ��ϴ�.");
		}
		else{
			
			//��� ��� �迭�濡 ��� 
			int num = num1*num2*num3;
			String str = Integer.toString(num);
			char result[];			
			result = str.toCharArray();
			System.out.println(result);
			
			int count[] = new int[10]; //0~9 �ѹ� �󵵼��� üũ
			for(int i:count){ //�ʱ�ȭ
				count[i]=0;
			}
				
			for(int i=0; i<10; i++){ //0~9�� ����ִ��� üũ
				for(int j=0; j<result.length; j++){ //�˻��� �迭
					
					//char�� - '0' �� �ϸ� char��-> int������ ���� ��ȯ ����
					if((result[j] -'0') == i){
						count[i]++;
					}
				}
				System.out.println(count[i]);
			}
			
		}
	}

	//���� ��ȿ���� üũ
	private static int valid(int num){
		if(num>=100&&num<1000) return 1;
		else return 0;
	}
}

//https://www.acmicpc.net/problem/1065
import java.util.Scanner;

public class Q_0420_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner stdin = new Scanner(System.in);
		int input = stdin.nextInt();
		int count = 0; // �Ѽ� ����
		
		//�Ѽ� 1~99������ ���ڸ����ۿ� ������ �Ѽ�.
		if(input<100){
			//System.out.println(input);
			count = input;
		}
		
		//100~1000
		else{
			
			count = 99;
			for(int i=100; i<=input; i++){

				//�����ڸ� �����ڸ� ���� �ڸ�
				int hundred = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hundred-ten) == (ten-one)){
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}
}

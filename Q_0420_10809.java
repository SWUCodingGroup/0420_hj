//https://www.acmicpc.net/problem/10809

/*
 * ���� �Է� String �迭���� ���鼭
 * �ҹ��� a~z���� �ƽ�Ű�ڵ� 97~122�� �̿�
 */
import java.util.Scanner;

public class Q_0420_10809 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int result[] = new int[26]; //�˻� ����� ��� int�迭��
		
		int ascii=97; //a~z  -->  97~122 �ƽ�Ű�ڵ尪
		int alpha[] = new int[26]; //���ĺ� 26�� �濡 ������ �ƽ�Ű�ڵ尪�� ����
		
		for(int i=0;i<alpha.length;i++){
			alpha[i]=ascii;
			ascii++;
			result[i] = -1; //�ʱ�ȭ
		}
		
		// baekjoon ���ڿ� �Է�
		String input_str = stdin.nextLine();
		
		//���ڿ��� ���ڹ迭�濡 ���� b a e k j o o n
		char input_chr[] = input_str.toCharArray();
		
		//���ڹ迭��� ���ĺ� �ƽ�Ű�ڵ� �迭���� ��
		for(int i=0; i<input_str.length(); i++){
			for(int j=0; j<alpha.length; j++){
				
				//���ڹ迭�� �ƽ�Ű�ڵ尪�� �˹ٺ� �ƽ��ڵ� ���� ���ٸ�
				if((int)input_chr[i]==alpha[j]){
					if(result[j]==-1)	result[j]=i; //ó�� �����ϴ� ��ġ�϶��� ����					
					break;
				}
			}
		}
		
		//��� ���
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+ " ");
		}
			
	}
}

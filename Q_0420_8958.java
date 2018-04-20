//���� https://www.acmicpc.net/problem/8958

import java.util.Scanner;

public class Q_0420_8958 {

	static private int qTotalCount;
	public static void main(String args[]){
		
		System.out.print("�������� �Է����ּ���: ");
		Scanner stdin = new Scanner(System.in);
		qTotalCount = stdin.nextInt();
		int eachQuestionScore[] = new int[qTotalCount]; //�� ���̽��� ����
		String questionStr[] = new String[qTotalCount]; //O�� X�� �̷��� �� ���̽��� ���ڿ�
		
		//���̽� ������ŭ
		for(int i=0; i<qTotalCount; i++){
			questionStr[i] = stdin.next(); //OOXXOXXOOO �̷� ���̽��� �Է�
			
			//�� String ���� ��ȿ�� �˻�
			if(checkValid(questionStr[i].length())==false){
				System.out.println("<���> 1~80 ������ �׽�Ʈ ���̽� ������ �Է����ּž��մϴ�.");
				return;
			}
			
			//�� String ���̰� ��ȿ�ϴٸ�
			else{
				//�� ���̽�String�� Char �迭�� �ϳ��ϳ� �ɰ��ִ� �۾�
				char questionCharArr[] = questionStr[i].toCharArray();				
				eachQuestionScore[i] = setScore(questionCharArr);
			}
		}
		
		//�� �׽�Ʈ ���̽��� ���� ������ ���پ� ���
		for(int i=0; i<qTotalCount; i++){
			System.out.print(eachQuestionScore[i] + "\n");
		}
	}
	
	/**
	 * @param charArray
	 * @return
	 */
	
	//�� ���̽��� ���� �ű�� �޼ҵ�
	static int setScore(char charArray[]){
		int sum = 0;
		int score[] = new int[charArray.length];
		int totalSum = 0;
		//���� �� ���̽��� ������ 0������ �ʱ�ȭ
		for(int i : score){
			score[i]=0;
		}
		
		//�� ���̽� �� ���� �ϳ��� ����(O,X)�� üũ
		for(int i=0; i<charArray.length; i++){     // 1 + 2 + 0 + .....
		
			if(charArray[i] == 'O'){
				score[i] = ++sum; //�� ���� ���� +1
			}
			else {
				sum=0;
				score[i] = sum;
			}
			totalSum += score[i]; // OOXXOXXOOO �̷� ���̽� ������ ������ totalSum�� ����
		}
		
		return totalSum;
	}
	
	
	
	//�� String ���� ��ȿ�� �˻�
	static boolean checkValid(int count){
		if( (count>=1)&&(count<80) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	//static�� ���� �޼ҵ忡�� �Ϲ� �ν��Ͻ� ����(int qEachCount)�� ����� �� ����.
	//�ݴ�� �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ忡���� static ���� ������� ����� �� �ִ�.

	
	
	
}

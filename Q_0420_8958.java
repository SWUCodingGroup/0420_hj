//백준 https://www.acmicpc.net/problem/8958

import java.util.Scanner;

public class Q_0420_8958 {

	static private int qTotalCount;
	public static void main(String args[]){
		
		System.out.print("문제수를 입력해주세요: ");
		Scanner stdin = new Scanner(System.in);
		qTotalCount = stdin.nextInt();
		int eachQuestionScore[] = new int[qTotalCount]; //각 케이스의 총점
		String questionStr[] = new String[qTotalCount]; //O와 X로 이뤄진 각 케이스의 문자열
		
		//케이스 개수만큼
		for(int i=0; i<qTotalCount; i++){
			questionStr[i] = stdin.next(); //OOXXOXXOOO 이런 케이스를 입력
			
			//각 String 길이 유효성 검사
			if(checkValid(questionStr[i].length())==false){
				System.out.println("<경고> 1~80 사이의 테스트 케이스 개수를 입력해주셔야합니다.");
				return;
			}
			
			//각 String 길이가 유효하다면
			else{
				//각 케이스String을 Char 배열에 하나하나 쪼개넣는 작업
				char questionCharArr[] = questionStr[i].toCharArray();				
				eachQuestionScore[i] = setScore(questionCharArr);
			}
		}
		
		//각 테스트 케이스의 최종 점수를 한줄씩 출력
		for(int i=0; i<qTotalCount; i++){
			System.out.print(eachQuestionScore[i] + "\n");
		}
	}
	
	/**
	 * @param charArray
	 * @return
	 */
	
	//각 케이스의 총점 매기기 메소드
	static int setScore(char charArray[]){
		int sum = 0;
		int score[] = new int[charArray.length];
		int totalSum = 0;
		//먼저 각 케이스안 문제들 0점으로 초기화
		for(int i : score){
			score[i]=0;
		}
		
		//각 케이스 안 문제 하나의 점수(O,X)를 체크
		for(int i=0; i<charArray.length; i++){     // 1 + 2 + 0 + .....
		
			if(charArray[i] == 'O'){
				score[i] = ++sum; //그 전의 점수 +1
			}
			else {
				sum=0;
				score[i] = sum;
			}
			totalSum += score[i]; // OOXXOXXOOO 이런 케이스 한줄의 총점를 totalSum에 담음
		}
		
		return totalSum;
	}
	
	
	
	//각 String 길이 유효성 검사
	static boolean checkValid(int count){
		if( (count>=1)&&(count<80) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	//static이 붙은 메소드에서 일반 인스턴스 변수(int qEachCount)를 사용할 수 없다.
	//반대로 인스턴스 변수나 인스턴스 메소드에서는 static 붙은 멤버들을 사용할 수 있다.

	
	
	
}

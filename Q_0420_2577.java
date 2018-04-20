//https://www.acmicpc.net/problem/2577
import java.util.Scanner;

public class Q_0420_2577 {

	public static void main(String[] args) {

		// 세수 입력 받기
		Scanner stdin = new Scanner(System.in);
		int num1 = stdin.nextInt();
		int num2 = stdin.nextInt();
		int num3 = stdin.nextInt();
		
		// 3개 입력 후 범위 제한
		if((valid(num1)==0) || (valid(num2)==0) || (valid(num3)==0)){
			System.out.println("숫자 범위가 유효하지 않습니다.");
		}
		else{
			
			//계산 결과 배열방에 담고 
			int num = num1*num2*num3;
			String str = Integer.toString(num);
			char result[];			
			result = str.toCharArray();
			System.out.println(result);
			
			int count[] = new int[10]; //0~9 넘버 빈도수를 체크
			for(int i:count){ //초기화
				count[i]=0;
			}
				
			for(int i=0; i<10; i++){ //0~9가 들어있는지 체크
				for(int j=0; j<result.length; j++){ //검사할 배열
					
					//char형 - '0' 을 하면 char형-> int형으로 쉽게 변환 가능
					if((result[j] -'0') == i){
						count[i]++;
					}
				}
				System.out.println(count[i]);
			}
			
		}
	}

	//범위 유효한지 체크
	private static int valid(int num){
		if(num>=100&&num<1000) return 1;
		else return 0;
	}
}

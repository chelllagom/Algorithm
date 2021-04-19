package A2;

import java.util.Scanner;

/*설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

출력
첫 줄에 소수의 개수를 출력합니다.
*/

class A05 {
	
	int solution(int n) {
		
		int answer = 0;
		int[] temp = new int[n+1]; //index 사용을 위해 1 증가
		
		for(int i=2; i<=n; i++) { // 0과 1 소수에서 제외
			if(temp[i] == 0) {
				answer++; //소수 1 카운트
				for(int j=i; j<=n; j=j+i) { //j=j+i로 배수 효과 가능
					temp[j] = 1; //i의 배수를 제거
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A05 main = new A05();
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		System.out.println(main.solution(input));
	}
}

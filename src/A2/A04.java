package A2;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

출력
첫 줄에 피보나치 수열을 출력합니다.
*/

class A04 {
	
	ArrayList<Integer> solution(int x) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		int temp = 1;
		answer.add(temp);
		
		//다른 방법: answer[i] = answer[i-2] + answer[i-1] , 코드가 직관적임
		for(int i=1; i<x; i++) {
			answer.add(temp);
			temp += answer.get(i-1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		A04 main = new A04();
		
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		for(int i : main.solution(input)) {
			System.out.print(i + " ");
		}
	}
}

package A3;

import java.util.Scanner;

/*설명
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 1511 20 2510 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.

입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

출력
첫 줄에 최대 매출액을 출력합니다.
*/

class A03 {
	
	int solution(int days, int x, int[] arr) {
		int answer = 0, sum = 0;
		for(int i=0; i<x; i++) {
			sum += arr[i];
		}
		answer = sum;
		for(int i=x; i<days; i++) {
			sum += (arr[i]-arr[i-x]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A03 main = new A03();
		Scanner in = new Scanner(System.in);
	    
		int input1 = in.nextInt();
		int input2 = in.nextInt();
	    int[] arr = new int[input1];
	    for(int i=0; i<input1; i++) {
	    	arr[i] = in.nextInt();
	    }
	    
	    System.out.println(main.solution(input1, input2, arr));
    }
}

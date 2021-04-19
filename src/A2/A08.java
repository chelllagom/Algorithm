package A2;

import java.util.Scanner;

/*설명
N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

입력
첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.

출력
입력된 순서대로 등수를 출력한다.
*/

class A08 {
	
	int[] solution(int n, int[] arr) {
		
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		A08 main = new A08();
		
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		for(int i=0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		
		for(int i : main.solution(input1, input2)) {
			System.out.print(i + " ");
		}
	}
	
}

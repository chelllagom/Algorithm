package A2;

import java.util.Scanner;

/*설명
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다.
각 자연수는 100을 넘지 않는다.

출력
최대합을 출력합니다.
*/

class A09 {

	int solution(int n, int[][] arr) {
		
		int max=Integer.MIN_VALUE, rowSum=0, colSum=0, temp=0;
		
		//행과 열의 합
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
			
			max = Math.max(max, rowSum);
			max = Math.max(max, colSum);
			
			rowSum = colSum = 0; //초기화
		}
		
		//대각선의 합
		for(int i=0; i<n; i++) {
			rowSum += arr[i][i];
			colSum += arr[i][n-i-1];
		}
		
		max = Math.max(max, rowSum);
		max = Math.max(max, colSum);
		
		return max;
	}
	
	
	public static void main(String[] args) {
		
		A09 main = new A09();
		
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[][] input2 = new int[input1][input1];
		
		for(int i=0; i<input1; i++) {
			for(int j=0; j<input1; j++) {
				input2[i][j] = in.nextInt();
			}
		}
		
		System.out.println(main.solution(input1, input2));
	}
	
}

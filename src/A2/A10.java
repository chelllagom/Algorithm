package A2;

import java.util.Scanner;

/*설명
지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 
봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
봉우리의 개수를 출력하세요.
*/

class A10 {

	int solution(int n, int[][] arr) {
		
		int cnt = 0;
		for(int i=1; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if( arr[i][j] > arr[i-1][j] &&
					arr[i][j] > arr[i][j-1] &&
					arr[i][j] > arr[i+1][j] &&
					arr[i][j] > arr[i][j+1]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		A10 main = new A10();
		
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[][] input2 = new int[input1+2][input1+2];
		
		for(int i=1; i<=input1; i++) {
			for(int j=1; j<=input1; j++) {
				input2[i][j] = in.nextInt();
			}
		}
		
		System.out.println(main.solution(input1, input2));
	}
}

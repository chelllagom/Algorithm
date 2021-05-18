package A6;

import java.util.Scanner;

/*설명
N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

입력
첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.

출력
N개의 좌표를 정렬하여 출력하세요.
*/

class A07 {
	
	int[][] solution(int n, int[][] arr) {
		int[][] answer = new int[n][2];
		return arr;
	}
	
	public static void main(String[] args) {
		
		A07 main = new A07();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			int cnt=0;
			arr[i][cnt++] = in.nextInt();
			arr[i][cnt] = in.nextInt();
		}
		
		int[][] arr2 = main.solution(n, arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr2[i][0] + " " + arr2[i][1]);
			System.out.println();
		}
    }
}
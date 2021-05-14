package A6;

import java.util.Scanner;

/*선택정렬
N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

출력
오름차순으로 정렬된 수열을 출력합니다.
*/

class A01 {
	
	int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int min=i;
			for(int j=i+1; j<n; j++) {
				if(arr[min] > arr[j]) min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		A01 main = new A01();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		for(int i : main.solution(n, arr)) System.out.print(i + " ");
    }
}
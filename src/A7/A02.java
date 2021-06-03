package A7;

import java.util.Scanner;

/* 재귀함수를 이용한 이진수 출력
재귀함수를 이용하여 N이 입력되면 2진수로 출력하여라
*/

class A02 {
	
	void DFS (int n) {
		if(n == 0) return;
		else {
			DFS(n/2);
			System.out.print(n%2 + " ");
		}
	}
	
	public static void main(String[] args) {
		
		A02 main = new A02();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		main.DFS(n);
    }
}
package A7;

import java.util.Scanner;

/* 팩토리얼
N이 입력되면 N!을 출력하여라
*/

class A03 {
	
	int DFS (int n) {
		if(n == 1) return 1;
		else return n*DFS(n-1);
	}
	
	public static void main(String[] args) {
		
		A03 main = new A03();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(main.DFS(n));
    }
}
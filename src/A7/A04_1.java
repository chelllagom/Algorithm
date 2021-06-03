package A7;

import java.util.Scanner;

/* 피보나치수열(재귀함수-성능 보통)
n을 받으면 앞의 2개의 수를 합하여 다음 숫자가 되는 수열을 n개 출력하시오
*/

class A04_1 {
	static int[] fibo;
	
	int DFS (int n) {
		if(n == 1) return fibo[n] = 1;
		else if(n == 2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2)+DFS(n-1);
	}
	
	public static void main(String[] args) {
		
		A04_1 main = new A04_1();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		fibo = new int[n+1];
		main.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }
}
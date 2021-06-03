package A7;

import java.util.Scanner;

/* 피보나치수열(재귀함수-성능 좋음-메모이제이션)
n을 받으면 앞의 2개의 수를 합하여 다음 숫자가 되는 수열을 n개 출력하시오
*/

class A04_2 {
	static int[] fibo;
	
	int DFS (int n) {
		//fibo[n] > 0는 값이 존재하면
		if(fibo[n] > 0) return fibo[n];
		if(n == 1) return fibo[n] = 1;
		else if(n == 2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2)+DFS(n-1);
	}
	
	public static void main(String[] args) {
		
		A04_2 main = new A04_2();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		fibo = new int[n+1];
		main.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }
}
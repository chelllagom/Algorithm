package A7;

import java.util.Scanner;

/* 피보나치수열(재귀함수-성능 안좋음)
n을 받으면 앞의 2개의 수를 합하여 다음 숫자가 되는 수열을 n개 출력하시오
*/

class A04 {
	
	int DFS (int n) {
		if(n == 1) return 1;
		else if(n == 2) return 1;
		else return DFS(n-2) + DFS(n-1);
	}
	
	public static void main(String[] args) {
		
		A04 main = new A04();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1; i<=n; i++) System.out.print(main.DFS(i) + " ");
    }
}
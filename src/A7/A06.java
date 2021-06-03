package A7;

import java.util.Scanner;

/* 부분집합 구하기-깊이우선탐색(DFS)
자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
*/

class A06 {
	//부분집합 원소의 개수
	static int n;
	//체크 확인용 배열
	static int[] ch;
	
	void DFS(int L) {
		if(L == n+1) { //종착점일 때
			String temp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i] == 1) temp += (i + " ");
			}
			//공집합 제외하고 출력
			if(temp.length()>0) System.out.println(temp);
		}else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		
		A06 main = new A06();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		ch = new int[n+1];
		
		main.DFS(1);
    }
}
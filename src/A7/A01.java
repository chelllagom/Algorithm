package A7;

import java.util.Scanner;

/* 재귀함수
재귀함수를 이용하여 N이 입력되면 1부터 N까지를 출력해라
*/

class A01 {
	
	void DFS (int n) {
		//재귀함수는 stack frame을 사용한다. stack frame에는 아래와 같은 정보가 저장되어 있다.
		//함수의 1.매개변수 2.지역변수 3.복귀주소(리턴 후 어디로 가야하는지) 등의 정보를 가지고 있다.
		//이것을 백트래킹이라 한다.
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		
		A01 main = new A01();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		main.DFS(n);
    }
}
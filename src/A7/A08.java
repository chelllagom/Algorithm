package A7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 송아지 찾기 1(BFS : 상태트리탐색)
설명
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 
현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
송아지는 움직이지 않고 제자리에 있다.
현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

입력
첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.

출력
점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
*/

class A08 {
	
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] check; //1은 방문
	Queue<Integer> q = new LinkedList<>();
	
	int BFS(int s, int e) {
		check = new int[10001];
		check[s] = 1;
		q.offer(s);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				int x = q.poll();
				for(int j=0; j<3; j++) {
					int childX = x + dis[j];
					if(childX == e) return L+1;
					//범위안에 있으면서 방문 안한 노드 체크
					if(1 <= childX && childX <= 10000 && check[childX] == 0) {
						check[childX] = 1;
						q.offer(childX);
					}
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		A08 main = new A08();
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int e = in.nextInt();
		
		System.out.println(main.BFS(s, e));
    }
}
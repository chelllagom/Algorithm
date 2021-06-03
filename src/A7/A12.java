package A7;

import java.util.Scanner;

/* 경로탐색(인접행렬)
 * 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 * 
 * 입력설명
 * 첫째 줄에는 정점의 수 N과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 * 
 * 출력설명
 * 총 가지수를 출력한다.
*/

public class A12 {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		//마지막 노드이면
		if(v == n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				//v라는 현재 지점에서 i라는 곳으로 갈 수 있으면
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		A12 main = new A12();
		Scanner in = new Scanner(System.in);
		n = in.nextInt(); //노드의 개수
		m = in.nextInt(); //간선의 개수
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		main.DFS(1);
		System.out.println(answer);
    }
}
package A7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 그래프 최단거리(BFS)
 * 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
 * 
 * 입력설명
 * 첫째 줄에는 정점의 수 N과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 * 
 * 출력설명
 * 총 가지수를 출력한다.
*/

public class A14 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void DFS(int v) {
		Queue<Integer> q = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		q.offer(v);
		while(!q.isEmpty()) {
			int cv = q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					q.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		A14 main = new A14();
		Scanner in = new Scanner(System.in);
		n = in.nextInt(); //노드의 개수
		m = in.nextInt(); //간선의 개수
		ch = new int[n+1];
		dis = new int[n+1];
		graph = new ArrayList<ArrayList<Integer>>();
		//0은 인덱스 제거용, 리스트 초기화
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		//리스트에 간선 추가
		for(int i=0; i<m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			graph.get(a).add(b);
		}
		main.DFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
    }
}
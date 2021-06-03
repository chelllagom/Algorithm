package A7;

import java.util.ArrayList;
import java.util.Scanner;

/* 경로탐색(인접리스트)
 * 인접행열로 N이 약 100개? 이상일때는 메모리,시간복잡도 측면에서 비효율적이기 때문에 "리스트"를 쓴다.
 * 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 * 
 * 입력설명
 * 첫째 줄에는 정점의 수 N과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 * 
 * 출력설명
 * 총 가지수를 출력한다.
*/

public class A13 {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		//마지막 노드이면
		if(v == n) answer++;
		else {
			for(int nextV : graph.get(v)) {
				//아직 방문 안했으면
				if(ch[nextV] == 0) {
					ch[nextV] = 1;
					DFS(nextV);
					ch[nextV] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		A13 main = new A13();
		Scanner in = new Scanner(System.in);
		n = in.nextInt(); //노드의 개수
		m = in.nextInt(); //간선의 개수
		ch = new int[n+1];
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
		ch[1] = 1;
		main.DFS(1);
		System.out.println(answer);
    }
}
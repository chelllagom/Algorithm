package A7;

import java.util.LinkedList;
import java.util.Queue;

/* Tree 말단 노드까지의 가장 짧은 경로 BFS로
이진트리 중 루트 노드에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램
*/

public class A10 {
	Node root;
	
	public int BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Node cur = q.poll();
				//말단 노드이면 레벨을 리턴
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		A10 main = new A10();
		main.root = new Node(1);
		main.root.lt = new Node(2);
		main.root.rt = new Node(3);
		main.root.lt.lt = new Node(4);
		main.root.lt.rt = new Node(5);
		System.out.println(main.BFS(main.root));
    }
}
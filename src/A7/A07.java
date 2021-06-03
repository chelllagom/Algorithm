package A7;

import java.util.LinkedList;
import java.util.Queue;

/* 이진트리 순회-넓이우선탐색(BFS)
최단거리 탐색에 쓰인다.
이진트리 레벨탐색 연습
*/

class A07 {
	
	Node root;
	
	void DFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while(!q.isEmpty()) {
			//len으로 for문의 반복 횟수 고정시켜줘야함!
			int len = q.size();
			for(int i=0; i<len; i++) {
				Node cur = q.poll();
				System.out.print(cur.data + " ");
				//cur.lt != null -> 자식 노드가 있으면
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		A07 main = new A07();
		main.root = new Node(1);
		main.root.lt = new Node(2);
		main.root.rt = new Node(3);
		main.root.lt.lt = new Node(4);
		main.root.lt.rt = new Node(5);
		main.root.rt.lt = new Node(6);
		main.root.rt.rt = new Node(7);
		main.DFS(main.root);
    }
}
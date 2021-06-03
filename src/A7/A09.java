package A7;

/* Tree 말단 노드까지의 가장 짧은 경로 DFS로
이진트리 중 루트 노드에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램
*/

class A09 {
	Node root;
	
	public int DFS(int L, Node root) {
		//노드의 자식이 없을 때
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}
	
	public static void main(String[] args) {
		
		A09 main = new A09();
		main.root = new Node(1);
		main.root.lt = new Node(2);
		main.root.rt = new Node(3);
		main.root.lt.lt = new Node(4);
		main.root.lt.rt = new Node(5);
		System.out.println(main.DFS(0, main.root));
    }
}
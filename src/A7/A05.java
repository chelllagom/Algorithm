package A7;

/* 이진트리 순회-깊이우선탐색(DFS)
전위순회, 중위순회, 후위순회를 연습해보세요.
*/

class Node{
	int data;
	Node lt, rt;
	Node(int val) {
		data = val;
		lt=rt=null;
	}
}

class A05 {
	
	Node root;
	
	void DFS(Node root) {
		//root == null 이면 말단노드임
		if(root == null) return;
		else {
			//전위 순회 코드
			DFS(root.lt); //왼쪽 가지 방문
			//중위 순회 코드
			DFS(root.rt); //오른쪽 가지 방문
			//후위 순회 코드
		}
	}
	
	public static void main(String[] args) {
		
		A05 main = new A05();
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
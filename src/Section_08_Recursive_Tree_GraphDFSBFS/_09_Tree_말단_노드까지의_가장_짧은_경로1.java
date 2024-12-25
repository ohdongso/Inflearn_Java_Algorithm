package Section_08_Recursive_Tree_GraphDFSBFS;

class Node2 {
	int data;
	Node2 lt, rt;
	public Node2(int val) {
		data = val;
		lt = rt = null;
	}
}

class _09_Tree_말단_노드까지의_가장_짧은_경로1 {
	
	/*
	 	이진트리에서 루트 노드 1에서 말단노드(자식이없는노드)까지 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하는 알고리즘
	 	짧은길이는 노드와 노드간의 이동 간선을 의미한다.
	 	
	 	DFS는 스택에 함수가 쌓이는게 머리에 그려지는것이 중요한것 같다.
	 	
		1, DFS(0, 100)
		2, DFS(1, 200)
		3, DFS(2, 400)
		4, DFS(2, 500)
		5, DFS(1, 300)
	 */
	
	Node2 root;
	
	public int DFS(int L, Node2 root) {
		if(root.lt == null && root.rt == null) { // 왼쪽자식, 오른쪽자식 모두 없는 경우
			return L;
		} else {
			return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
		}
	}
	
	public static void main(String[] args) {
		
		_09_Tree_말단_노드까지의_가장_짧은_경로1 tree = new _09_Tree_말단_노드까지의_가장_짧은_경로1();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		System.out.println(tree.DFS(0, tree.root));
		
	} // main 끝.
}
package Section_08_Recursive_Tree_GraphDFSBFS;

class Node2 {
	int data;
	Node2 lt, rt;
	public Node2(int val) {
		data = val;
		lt = rt = null;
	}
}

class _09_Tree_����_��������_����_ª��_���1 {
	
	/*
	 	����Ʈ������ ��Ʈ ��� 1���� ���ܳ��(�ڽ��̾��³��)���� ���� �� ���� ª�� ���̸� ���ϴ� ���α׷��� �ۼ��ϴ� �˰���
	 	ª�����̴� ���� ��尣�� �̵� ������ �ǹ��Ѵ�.
	 	
	 	DFS�� ���ÿ� �Լ��� ���̴°� �Ӹ��� �׷����°��� �߿��Ѱ� ����.
	 	
		1, DFS(0, 100)
		2, DFS(1, 200)
		3, DFS(2, 400)
		4, DFS(2, 500)
		5, DFS(1, 300)
	 */
	
	Node2 root;
	
	public int DFS(int L, Node2 root) {
		if(root.lt == null && root.rt == null) { // �����ڽ�, �������ڽ� ��� ���� ���
			return L;
		} else {
			return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
		}
	}
	
	public static void main(String[] args) {
		
		_09_Tree_����_��������_����_ª��_���1 tree = new _09_Tree_����_��������_����_ª��_���1();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		System.out.println(tree.DFS(0, tree.root));
		
	} // main ��.
}
package Section_08_Recursive_Tree_GraphDFSBFS;

/*
  	1, DFS(100)�� DFS(root.lt); ���� �ߴ�.
 	2, DFS(200)�� DFS(root.lt); ���� �ߴ�.
 	3, DFS(400)�� DFS(root.lt); ���� �ߴ�.
 	4, DFS(400)�� if(root == null) ���ǿ� �ɸ���. ==> DFS(NULL)
 	   ==> ���ܳ����� �˻��� �Ʊ� ������, DFS(NULL)�� POP�ϰ� DFS(400)���� �����Ѵ�.
 	5, DFS(400)���� �����ؼ� �������� 4�� ����Ѵ�
 	6, DFS(root.rt);�� ȣ���ϰ� if(root == null) ���ǿ� �ɸ���. ==> DFS(NULL)
 	    ==> ���ܳ����� �˻��� �Ʊ� ������, DFS(NULL)�� POP�ϰ� DFS(400)�� POP�Ѵ�.
 	7, DFS(200)���� �����ϰ� 2�� ����Ѵ�.
 	8, DFS(200)�� DFS(root.rt)�� ȣ���Ѵ�. ==> DFS(root.rt) == DFS(500)
 	9, DFS(500)�� ȣ���ϰ�, DFS(root.lt)�� ȣ���Ѵ�. ==> DFS(root.lt) == DFS(NULL)
 	10, DFS(500)�� lt���� NULL�̱� ������ ���� �����ӿ��� POP�ѵ� ���ƿͼ� DFS(500)�� �� 5�� ����Ѵ�.
 	11, DFS(500)�� rt�� ȣ���Ѵ�. rt�� NULL�̱� ������ ���� �����ӿ��� POP�ѵ� DFS(500)�� �����Ų��.
 	12, DFS(200)���� �����ؼ�, ���̻� ȣ���Ұ� ���� ������ POP�ϰ� ������.
 	13, DFS(100)���� �����ؼ�, DFS(root.lt)�� ������ ��µǱ� ������ "1"�� ����Ѵ�.
 	14, DFS(300)�� ȣ���Ѵ�. ==> ������ȸ ==> �����ڽ� > �θ� > �������ڽ�("���� �κ� ��ȸ�Ѵ�.")
 	15, ��������� ( 4, 5, 2, 6, 7, 3, 1 )�� ȣ���Ѵ�.
 */

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class _05_����Ʈ��_��ȸ_���̿켱Ž��1 {
	Node root;
	public void DFS(Node root) { // root�� ��� �ڽ� ������ ���ŵȴ�.
		if(root == null) {
			return;
		} else {
			// System.out.print(root.data + " "); // ������ȸ ==> �θ� > �����ڽ� > �������ڽ� ������ Ž�� ==> �θ� �����̴�.
			DFS(root.lt);
			// System.out.print(root.data + " "); // ������ȸ ==> �����ڽ� > �θ� > �������ڽ� ������ Ž�� ==> �����ڽ��� �����̴�.
			DFS(root.rt);
			// System.out.print(root.data + " "); // ������ȸ ==> �������ڽ� > �������ڽ� > �θ� ������ Ž�� ==> �����ڽ��� �����̴�.
		}
	}
	
	public static void main(String[] args) {
		_05_����Ʈ��_��ȸ_���̿켱Ž��1 tree = new _05_����Ʈ��_��ȸ_���̿켱Ž��1();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.lt.rt = new Node(6);
		tree.root.lt.rt = new Node(7);
		tree.DFS(tree.root);
	} // main ��.
}
package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.LinkedList;
import java.util.Queue;

class Node3 {
	int data;
	Node3 lt, rt;
	
	public Node3(int val) {
		data = val;
		lt = rt = null;
	}
}

class _10_Tree_����_��������_����_ª��_���2 {
	
	/*
	 	����Ʈ������ ��Ʈ ��� 1���� ���ܳ��(�ڽ��̾��³��)���� ���� �� ���� ª�� ���̸� ���ϴ� ���α׷��� �ۼ��ϴ� �˰���
	 	ª�����̴� ���� ��尣�� �̵� ������ �ǹ��Ѵ�.
	 */
	
	Node3 root;
	
	public int BFS(Node3 root) {
		Queue<Node3> Q = new LinkedList<Node3>();
		
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) { // �������� �����ϴ� ��� �� ��ŭ �ݺ����� ����.
				Node3 cur = Q.poll();
				if(cur.lt == null && cur.rt == null) { // ���� ���
					return L; // ��� 3�� �ڽĳ�尡 �����Ƿ� ���� ����1�� ��ȯ�ϰ� �ݺ����� ����ȴ�.
				}
				
				if(cur.lt != null) { // ���� �ڽĳ�� ����
					Q.offer(cur.lt);
				}
				
				if(cur.rt != null) { // ���� �ڽĳ�� ����
					Q.offer(cur.rt);
				}
			} // for�� ��.
			L++;
		} // while�� ��.
		return 0;
	}
	
	public static void main(String[] args) {
		_10_Tree_����_��������_����_ª��_���2 tree = new _10_Tree_����_��������_����_ª��_���2();
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		System.out.println(tree.BFS(tree.root));
	} // main ��.
}
package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	int data;
	Node1 lt, rt;
	
	public Node1(int val) {
		data = val;
		lt = rt = null;
	}
}

class _07_����Ʈ��_��ȸ_���̿켱Ž��_����Ž�� {
	
	/*
  		- root�� 100����, 1
  		- L�� ������ ���Ѵ�.
  		- ������ ������ 0 ~ N���� �����Ѵ�.
  		
  		1, 1�� ť�� �ִ´�
  		2, 1�� ����ϰ� 1�� ����� 2�� 3�� �ִ´�.
  		3, 2�� ����ϰ� 2�� ����� 4�� 5�� �ִ´�.
  		4, 3�� ����ϰ� 3�� ����� 6�� 7�� �ִ´�.
  		5, 4�� ����ϰ� 4�� ����� ���� ���°��� Ȯ���ϰ�, ������ ����Ѵ�.
  		6, 5�� ����ϰ� 5�� ����� ���� ���°��� Ȯ���ϰ�, ������ ����Ѵ�.
  		7, 6�� ����ϰ� 6�� ����� ���� ���°��� Ȯ���ϰ�, ������ ����Ѵ�.
  		8, 7�� ����ϰ� 7�� ����� ���� ���°��� Ȯ���ϰ�, ť�� ����ִ°��� Ȯ���ϰ� �����Ѵ�.
	 */
	
	Node1 root;
	public void BFS(Node1 root) {
		Queue<Node1> Q = new LinkedList<Node1>();
		Q.offer(root);
		int L = 0;
		
		while(!Q.isEmpty()) { // ť�� ���������, while���� �����.
			int len = Q.size(); // �� ������ ��� ������ �ǹ��Ѵ�. ex) ������1�̸� 2 > (2,3)
			System.out.print(L + " : ");
			for(int i = 0; i < len; i++) {
				Node1 cur = Q.poll();
				System.out.print(cur.data + " ");
				
				if(cur.lt != null) { // ���� ����� ���� �ڽ�
					Q.offer(cur.lt);
				}
				
				if(cur.rt != null) { // ���� ����� ������ �ڽ�
					Q.offer(cur.rt);
				}
			}
			L++; // ������ �������� �ش�.
			System.out.println();
		} // while�� ��
	}
	
	public static void main(String[] args) {
		_07_����Ʈ��_��ȸ_���̿켱Ž��_����Ž�� tree = new _07_����Ʈ��_��ȸ_���̿켱Ž��_����Ž��();
		
		tree.root = new Node1(1);
		tree.root.lt = new Node1(2);
		tree.root.rt = new Node1(3);
		tree.root.lt.lt = new Node1(4);
		tree.root.lt.rt = new Node1(5);
		tree.root.rt.lt = new Node1(6);
		tree.root.rt.rt = new Node1(7);
		tree.BFS(tree.root);
		
	} // main ��.
}
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

class _10_Tree_말단_노드까지의_가장_짧은_경로2 {
	
	/*
	 	이진트리에서 루트 노드 1에서 말단노드(자식이없는노드)까지 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하는 알고리즘
	 	짧은길이는 노드와 노드간의 이동 간선을 의미한다.
	 */
	
	Node3 root;
	
	public int BFS(Node3 root) {
		Queue<Node3> Q = new LinkedList<Node3>();
		
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) { // 각레벨에 존재하는 노드 수 만큼 반복문이 돈다.
				Node3 cur = Q.poll();
				if(cur.lt == null && cur.rt == null) { // 말단 노드
					return L; // 노드 3은 자식노드가 없으므로 현재 레벨1을 반환하고 반복문이 종료된다.
				}
				
				if(cur.lt != null) { // 좌측 자식노드 삽입
					Q.offer(cur.lt);
				}
				
				if(cur.rt != null) { // 우측 자식노드 삽입
					Q.offer(cur.rt);
				}
			} // for문 끝.
			L++;
		} // while문 끝.
		return 0;
	}
	
	public static void main(String[] args) {
		_10_Tree_말단_노드까지의_가장_짧은_경로2 tree = new _10_Tree_말단_노드까지의_가장_짧은_경로2();
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		System.out.println(tree.BFS(tree.root));
	} // main 끝.
}
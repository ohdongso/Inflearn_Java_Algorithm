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

class _07_이진트리_순회_넓이우선탐색_레벨탐색 {
	
	/*
  		- root는 100번지, 1
  		- L은 레벨을 뜻한다.
  		- 레벨은 순서는 0 ~ N으로 증가한다.
  		
  		1, 1을 큐에 넣는다
  		2, 1을 출력하고 1과 연결된 2와 3을 넣는다.
  		3, 2를 출력하고 2와 연결된 4와 5를 넣는다.
  		4, 3을 출력하고 3과 연결된 6과 7을 넣는다.
  		5, 4를 출력하고 4와 연결된 것이 없는것을 확인하고, 다음을 출력한다.
  		6, 5를 출력하고 5와 연결된 것이 없는것을 확인하고, 다음을 출력한다.
  		7, 6를 출력하고 6과 연결된 것이 없는것을 확인하고, 다음을 출력한다.
  		8, 7를 출력하고 7과 연결된 것이 없는것을 확인하고, 큐가 비어있는것을 확인하고 종료한다.
	 */
	
	Node1 root;
	public void BFS(Node1 root) {
		Queue<Node1> Q = new LinkedList<Node1>();
		Q.offer(root);
		int L = 0;
		
		while(!Q.isEmpty()) { // 큐가 비어있으면, while문은 멈춘다.
			int len = Q.size(); // 각 레벨의 노드 개수를 의미한다. ex) 레벨이1이면 2 > (2,3)
			System.out.print(L + " : ");
			for(int i = 0; i < len; i++) {
				Node1 cur = Q.poll();
				System.out.print(cur.data + " ");
				
				if(cur.lt != null) { // 현재 노드의 왼쪽 자식
					Q.offer(cur.lt);
				}
				
				if(cur.rt != null) { // 현재 노드의 오른쪽 자식
					Q.offer(cur.rt);
				}
			}
			L++; // 레벨을 증가시켜 준다.
			System.out.println();
		} // while문 끝
	}
	
	public static void main(String[] args) {
		_07_이진트리_순회_넓이우선탐색_레벨탐색 tree = new _07_이진트리_순회_넓이우선탐색_레벨탐색();
		
		tree.root = new Node1(1);
		tree.root.lt = new Node1(2);
		tree.root.rt = new Node1(3);
		tree.root.lt.lt = new Node1(4);
		tree.root.lt.rt = new Node1(5);
		tree.root.rt.lt = new Node1(6);
		tree.root.rt.rt = new Node1(7);
		tree.BFS(tree.root);
		
	} // main 끝.
}
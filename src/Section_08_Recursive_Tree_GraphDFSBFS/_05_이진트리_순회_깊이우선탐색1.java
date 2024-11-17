package Section_08_Recursive_Tree_GraphDFSBFS;

/*
  	1, DFS(100)은 DFS(root.lt); 까지 했다.
 	2, DFS(200)은 DFS(root.lt); 까지 했다.
 	3, DFS(400)은 DFS(root.lt); 까지 했다.
 	4, DFS(400)은 if(root == null) 조건에 걸린다. ==> DFS(NULL)
 	   ==> 말단노드까지 검색이 됐기 때문에, DFS(NULL)을 POP하고 DFS(400)으로 복귀한다.
 	5, DFS(400)으로 복귀해서 다음라인 4를 출력한다
 	6, DFS(root.rt);을 호출하고 if(root == null) 조건에 걸린다. ==> DFS(NULL)
 	    ==> 말단노드까지 검색이 됐기 때문에, DFS(NULL)을 POP하고 DFS(400)을 POP한다.
 	7, DFS(200)으로 복귀하고 2를 출력한다.
 	8, DFS(200)의 DFS(root.rt)를 호출한다. ==> DFS(root.rt) == DFS(500)
 	9, DFS(500)을 호출하고, DFS(root.lt)를 호출한다. ==> DFS(root.lt) == DFS(NULL)
 	10, DFS(500)의 lt값은 NULL이기 때문에 스택 프레임에서 POP한뒤 돌아와서 DFS(500)의 값 5를 출력한다.
 	11, DFS(500)의 rt를 호출한다. rt도 NULL이기 때문에 스택 프레임에서 POP한뒤 DFS(500)을 종료시킨다.
 	12, DFS(200)으로 복귀해서, 더이상 호출할게 없기 때문에 POP하고 끝난다.
 	13, DFS(100)으로 복귀해서, DFS(root.lt)가 끝나고 출력되기 때문에 "1"을 출력한다.
 	14, DFS(300)을 호출한다. ==> 중위순회 ==> 왼쪽자식 > 부모 > 오른쪽자식("이제 부분 순회한다.")
 	15, 결과적으로 ( 4, 5, 2, 6, 7, 3, 1 )을 호출한다.
 */

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class _05_이진트리_순회_깊이우선탐색1 {
	Node root;
	public void DFS(Node root) { // root가 계속 자식 번지로 갱신된다.
		if(root == null) {
			return;
		} else {
			// System.out.print(root.data + " "); // 전위순회 ==> 부모 > 왼쪽자식 > 오른쪽자식 순으로 탐색 ==> 부모가 기준이다.
			DFS(root.lt);
			// System.out.print(root.data + " "); // 중위순회 ==> 왼쪽자식 > 부모 > 오른쪽자식 순으로 탐색 ==> 왼쪽자식이 기준이다.
			DFS(root.rt);
			// System.out.print(root.data + " "); // 후위순회 ==> 왼쪽쪽자식 > 오른쪽자식 > 부모 순으로 탐색 ==> 왼쪽자식이 기준이다.
		}
	}
	
	public static void main(String[] args) {
		_05_이진트리_순회_깊이우선탐색1 tree = new _05_이진트리_순회_깊이우선탐색1();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.lt.rt = new Node(6);
		tree.root.lt.rt = new Node(7);
		tree.DFS(tree.root);
	} // main 끝.
}
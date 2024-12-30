package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.Scanner;

class _12_경로_탐색_인접행렬1 {
	
	/*
	 	● 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요. ●
	 	- 정점의 수 : 노드수(N)
	 	- 간선의 수 : N
	 	- 그래프에서는 방문한 노드를 중복으로 방문해서 경로를 만들지 않는다.
	 	- 경로 확인 후 백할 때는 체크를 풀어야 한다.
	 	
	 	1, DFS(1) > 1번 정점 > 방문한 배열은 체크해야 한다.
	 	2, DFS(1) > (1,2,3,4,5) 정점 호출 > 1은 체크되서 건너 뛴다.
	 		- DFS(1) > DFS(2) > DFS(3) > DFS(4) > DFS(5)
	 	3, DFS(1) > DFS(2) > DFS(5)
	 	4, DFS(1) > DFS(3) > DFS(4)....... ==> 이런식으로 경로를 확인한다.
	 	5, 체크가 안된 값을 먼저 깊이우선 탐색을 해준다.
	 */
	
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) {
			answer++;
		} else {
			for(int i = 1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1; // 체크해준다.
					DFS(i);
					ch[i] = 0; // 체크해제한다.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		_12_경로_탐색_인접행렬1 T = new _12_경로_탐색_인접행렬1();
		Scanner kb = new Scanner(System.in);
		
		// 5개의 정점과, 9개의 간선을 입력받았다.
		n = kb.nextInt(); // 정점의 개수(노드의 개수)
		m = kb.nextInt(); // 간선의 개수
		
		graph = new int[n+1][n+1]; // 인접행렬 저장할 변수(5x9 배열)
		ch = new int [n+1]; // 체크배열 (5 배열)
		
		for(int i = 0; i < m; i++) {
			// a에서 ~ b로 간다라는 의미(방향)
			/*
				1 2, 1 3, 1 4, 2 1, 2 3, 2 5
				3 4, 4 2, 4 5
			 */
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			graph[a][b] = 1;
		}
		
		ch[1] = 1; // 1번노드 체크점 이기 때문에 1로 변경
		T.DFS(1);
		
		System.out.println(answer);
	} // main 끝.
}
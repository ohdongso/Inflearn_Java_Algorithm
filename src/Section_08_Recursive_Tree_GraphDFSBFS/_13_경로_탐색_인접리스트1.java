package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.ArrayList;
import java.util.Scanner;

class _13_경로_탐색_인접리스트1 {
	
	/*
	 	문제 : 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
	 	아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는?
	 	
	 	5 9
	 	1 2
	 	1 3
	 	1 4
	 	2 1
	 	2 3
	 	2 5
	 	3 4
	 	4 2
	 	4 5
	 	
		정점의 개수가 많아지면 "인접 리스트로 해결해야 한다."
	 */
	
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) { // 최초 값은 1이 전달
		if(v == n) { // 일단 대기, (x , n == 5)
			answer++;
		} else {
			
			/*
				1 > (2,3,4)
				2 > (1,3,5)
				3 > (4)
				4 > (2,5)	
			 */
			
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		_13_경로_탐색_인접리스트1 T = new _13_경로_탐색_인접리스트1();
		Scanner kb = new Scanner(System.in);	
		n = kb.nextInt(); // 정점의 개수 ==> 5
		m = kb.nextInt(); // 간선의 개수(양방도 존재) ==> 9
		
		graph = new ArrayList<ArrayList<Integer>>(); // arraylist를 담는 arraylist배열
		for(int i = 0; i <= n; i++) { // 0 ~ 6
			graph.add(new ArrayList<Integer>()); // 총 6개의 arrayList를 저장
		}
		// System.out.println("graph.size() : " + graph.size());
		
		ch = new int[n + 1]; // (0 ~ 6), 크기 6의 체크 배열 생성
		for(int i = 0; i < m; i++) { // (0 ~ 8) 반복
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b); // 각 정점의 간선 이동값을 저장
		}
		
		ch[1] = 1; // 체크배열 1은 1로 체크표시
		T.DFS(1); // 깊이우선탐색 정점 값 1을 매개변수로 전달
		System.out.println(answer);
	} // main 끝.
}
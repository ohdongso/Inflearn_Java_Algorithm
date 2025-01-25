package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class _14_그래프_최단거리_BFS1 {
	
	/*	 	
		최단거리는 BFS라고 생각하면 된다.
		
		문제 : 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
	 */
	
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		
		while(!queue.isEmpty()) { // 큐가 비어있으면 while을 돌지 않는다.
			int cv = queue.poll();
			
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1; // 중요
				}
			}
		}
	}
	
	public static void main(String[] args) {
		_14_그래프_최단거리_BFS1 T = new _14_그래프_최단거리_BFS1();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt(); // 정점의 개수
		m = kb.nextInt(); // 간선의 개수
		
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <= n; i++) { // 총 7개의 ArrayList객체가 들어간다.
			graph.add(new ArrayList<Integer>());
		}
		
		ch = new int[n + 1]; // 1 ~ N
		dis = new int[n + 1]; // 1 ~ N
		
		for(int i = 0; i < m; i++) { // 간선 index
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			/*
				6 9
				1 3 ==> graph ArrayList에 저장
				1 4
				2 1
				2 5
				3 4
				4 5
				4 6
				6 2
				6 5
			 */
			graph.get(a).add(b);
		}
		
		T.BFS(1);
		
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	} // main 끝.
}
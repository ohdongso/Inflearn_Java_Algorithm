package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class _14_그래프_최단거리_BFS1 {
	
	/*	 	
		최단거리는 BFS라고 생각하면 된다.
		
		문제 : 1번 정점에서 각 정점으로 가는 "최소 이동 간선수"를 출력하세요.
		● 방법1 ●
		1, 1번 정점에서 1Lv로 가는 방법
		2, 1번 > 1Lv > 2Lv
		3, 1번 > 1Lv > 2Lv > 2Lv
		4, 이렇게 레벨로 구해줄수 있다.
		
		● 방법2 ●
		1, dis[3] ==> 1번정점에서 3번정점까지 가는 최소한의 간선수를 의미한다.
		2, dis[nv](다음정점까지가는 간선수) ==> dis[v]+1(현재정점까지가는 간선수)
		3, dis배열에는 자기자신(0으로 표현) 그리고 다른 노드는 "최소 이동 간선수"로 나타낸다.
		4, BFS는 최단거리방문이고 배열에 값을 저장해서 표현 할 수 있다.
		
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
	static ArrayList<ArrayList<Integer>> graph; // 인접행렬
	static int[] ch, dis;
	
	public void BFS(int v) { // v는 정점의 번호를 의미한다.
		Queue<Integer> queue = new LinkedList<Integer>();
		ch[v] = 1;
		dis[v] = 0; // 정점의 최소의 간선수를 저장한다.
		queue.offer(v);
		
		while(!queue.isEmpty()) { // 큐가 비어있으면 while을 돌지 않는다.
			int cv = queue.poll(); // cv는 현재 정점을 의미한다.
			
			for(int nv : graph.get(cv)) { // 현재 정점의 리스트를 돈다.
				if(ch[nv] == 0) { // 0이면 방문하지 않은 것
					ch[nv] = 1; // 1은 방문 한 것
					queue.offer(nv);
					dis[nv] = dis[cv] + 1; // dis[cv]는 현재까지의 간선을 나타내고, dis[nv]는 다음간선을 나타낸다.
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
		
		T.BFS(1); // 1번 정점부터 출발해라
		
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	} // main 끝.
}
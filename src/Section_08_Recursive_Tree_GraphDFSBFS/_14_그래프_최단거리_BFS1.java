package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class _14_�׷���_�ִܰŸ�_BFS1 {
	
	/*	 	
		�ִܰŸ��� BFS��� �����ϸ� �ȴ�.
		
		���� : 1�� �������� �� �������� ���� �ּ� �̵� �������� ����ϼ���.
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
		
		while(!queue.isEmpty()) { // ť�� ��������� while�� ���� �ʴ´�.
			int cv = queue.poll();
			
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1; // �߿�
				}
			}
		}
	}
	
	public static void main(String[] args) {
		_14_�׷���_�ִܰŸ�_BFS1 T = new _14_�׷���_�ִܰŸ�_BFS1();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt(); // ������ ����
		m = kb.nextInt(); // ������ ����
		
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <= n; i++) { // �� 7���� ArrayList��ü�� ����.
			graph.add(new ArrayList<Integer>());
		}
		
		ch = new int[n + 1]; // 1 ~ N
		dis = new int[n + 1]; // 1 ~ N
		
		for(int i = 0; i < m; i++) { // ���� index
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			/*
				6 9
				1 3 ==> graph ArrayList�� ����
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
	} // main ��.
}
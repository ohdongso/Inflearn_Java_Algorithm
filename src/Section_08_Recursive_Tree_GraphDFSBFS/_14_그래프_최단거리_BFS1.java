package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class _14_�׷���_�ִܰŸ�_BFS1 {
	
	/*	 	
		�ִܰŸ��� BFS��� �����ϸ� �ȴ�.
		
		���� : 1�� �������� �� �������� ���� "�ּ� �̵� ������"�� ����ϼ���.
		�� ���1 ��
		1, 1�� �������� 1Lv�� ���� ���
		2, 1�� > 1Lv > 2Lv
		3, 1�� > 1Lv > 2Lv > 2Lv
		4, �̷��� ������ �����ټ� �ִ�.
		
		�� ���2 ��
		1, dis[3] ==> 1���������� 3���������� ���� �ּ����� �������� �ǹ��Ѵ�.
		2, dis[nv](���������������� ������) ==> dis[v]+1(���������������� ������)
		3, dis�迭���� �ڱ��ڽ�(0���� ǥ��) �׸��� �ٸ� ���� "�ּ� �̵� ������"�� ��Ÿ����.
		4, BFS�� �ִܰŸ��湮�̰� �迭�� ���� �����ؼ� ǥ�� �� �� �ִ�.
		
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
	static ArrayList<ArrayList<Integer>> graph; // �������
	static int[] ch, dis;
	
	public void BFS(int v) { // v�� ������ ��ȣ�� �ǹ��Ѵ�.
		Queue<Integer> queue = new LinkedList<Integer>();
		ch[v] = 1;
		dis[v] = 0; // ������ �ּ��� �������� �����Ѵ�.
		queue.offer(v);
		
		while(!queue.isEmpty()) { // ť�� ��������� while�� ���� �ʴ´�.
			int cv = queue.poll(); // cv�� ���� ������ �ǹ��Ѵ�.
			
			for(int nv : graph.get(cv)) { // ���� ������ ����Ʈ�� ����.
				if(ch[nv] == 0) { // 0�̸� �湮���� ���� ��
					ch[nv] = 1; // 1�� �湮 �� ��
					queue.offer(nv);
					dis[nv] = dis[cv] + 1; // dis[cv]�� ��������� ������ ��Ÿ����, dis[nv]�� ���������� ��Ÿ����.
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
		
		T.BFS(1); // 1�� �������� ����ض�
		
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	} // main ��.
}
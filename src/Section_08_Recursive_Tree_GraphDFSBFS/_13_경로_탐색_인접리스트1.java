package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.ArrayList;
import java.util.Scanner;

class _13_���_Ž��_��������Ʈ1 {
	
	/*
	 	���� : ����׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 	�Ʒ� �׷������� 1�� �������� 5�� �������� ���� ���� ����?
	 	
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
	 	
		������ ������ �������� "���� ����Ʈ�� �ذ��ؾ� �Ѵ�."
	 */
	
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) { // ���� ���� 1�� ����
		if(v == n) { // �ϴ� ���, (x , n == 5)
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
		_13_���_Ž��_��������Ʈ1 T = new _13_���_Ž��_��������Ʈ1();
		Scanner kb = new Scanner(System.in);	
		n = kb.nextInt(); // ������ ���� ==> 5
		m = kb.nextInt(); // ������ ����(��浵 ����) ==> 9
		
		graph = new ArrayList<ArrayList<Integer>>(); // arraylist�� ��� arraylist�迭
		for(int i = 0; i <= n; i++) { // 0 ~ 6
			graph.add(new ArrayList<Integer>()); // �� 6���� arrayList�� ����
		}
		// System.out.println("graph.size() : " + graph.size());
		
		ch = new int[n + 1]; // (0 ~ 6), ũ�� 6�� üũ �迭 ����
		for(int i = 0; i < m; i++) { // (0 ~ 8) �ݺ�
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b); // �� ������ ���� �̵����� ����
		}
		
		ch[1] = 1; // üũ�迭 1�� 1�� üũǥ��
		T.DFS(1); // ���̿켱Ž�� ���� �� 1�� �Ű������� ����
		System.out.println(answer);
	} // main ��.
}
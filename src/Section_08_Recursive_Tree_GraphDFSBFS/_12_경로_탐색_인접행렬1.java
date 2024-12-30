package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.Scanner;

class _12_���_Ž��_�������1 {
	
	/*
	 	�� 1�� �������� N�� �������� ���� ��� ����� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���. ��
	 	- ������ �� : ����(N)
	 	- ������ �� : N
	 	- �׷��������� �湮�� ��带 �ߺ����� �湮�ؼ� ��θ� ������ �ʴ´�.
	 	- ��� Ȯ�� �� ���� ���� üũ�� Ǯ��� �Ѵ�.
	 	
	 	1, DFS(1) > 1�� ���� > �湮�� �迭�� üũ�ؾ� �Ѵ�.
	 	2, DFS(1) > (1,2,3,4,5) ���� ȣ�� > 1�� üũ�Ǽ� �ǳ� �ڴ�.
	 		- DFS(1) > DFS(2) > DFS(3) > DFS(4) > DFS(5)
	 	3, DFS(1) > DFS(2) > DFS(5)
	 	4, DFS(1) > DFS(3) > DFS(4)....... ==> �̷������� ��θ� Ȯ���Ѵ�.
	 	5, üũ�� �ȵ� ���� ���� ���̿켱 Ž���� ���ش�.
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
					ch[i] = 1; // üũ���ش�.
					DFS(i);
					ch[i] = 0; // üũ�����Ѵ�.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		_12_���_Ž��_�������1 T = new _12_���_Ž��_�������1();
		Scanner kb = new Scanner(System.in);
		
		// 5���� ������, 9���� ������ �Է¹޾Ҵ�.
		n = kb.nextInt(); // ������ ����(����� ����)
		m = kb.nextInt(); // ������ ����
		
		graph = new int[n+1][n+1]; // ������� ������ ����(5x9 �迭)
		ch = new int [n+1]; // üũ�迭 (5 �迭)
		
		for(int i = 0; i < m; i++) {
			// a���� ~ b�� ���ٶ�� �ǹ�(����)
			/*
				1 2, 1 3, 1 4, 2 1, 2 3, 2 5
				3 4, 4 2, 4 5
			 */
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			graph[a][b] = 1;
		}
		
		ch[1] = 1; // 1����� üũ�� �̱� ������ 1�� ����
		T.DFS(1);
		
		System.out.println(answer);
	} // main ��.
}
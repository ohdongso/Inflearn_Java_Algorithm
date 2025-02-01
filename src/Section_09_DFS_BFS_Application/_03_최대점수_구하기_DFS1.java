package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _03_�ִ�����_���ϱ�_DFS1 {
	
	/*
		���� : �־��� �ð����� ������ Ǯ�� �ִ������� ���� �� �ִ� ��츦 ���ض�.
5 20
10 5
25 12
15 8
6 3
7 4
41
	 */
	static int answer = Integer.MIN_VALUE, n, m;
	boolean flag = false;
	public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
		if(time > m) { // m(���ѽð�)�� �Ѵ� ��ʹ� ���͸� ���ش�.
			return;
		}
		
		if(L == n) {
			answer = Math.max(answer, sum);
		} else {
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt); // ������ Ǫ�� ��
			DFS(L+1, sum, time, ps, pt); // ������ Ǯ�� �ʴ� ��
		}
		
	}
	
	public static void main(String[] args) {
		_03_�ִ�����_���ϱ�_DFS1 T = new _03_�ִ�����_���ϱ�_DFS1();
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // ��������
		m = kb.nextInt(); // ���ѽð�
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = kb.nextInt(); // ����
			b[i] = kb.nextInt(); // �ɸ��� �ð�
		}
		
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
}

package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _01_����_����_�κ�����_DFS_�Ƹ���_���ͺ�1 {
	
	/*
		1, �� �κ����d�� ������ ���� ���� ���� ��찡 �����ϸ� "YES"�� ����ϰ�, �׷��� ������ "NO��" ����ϴ� ���α׷� �ۼ�
		
	 */
	
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	/*
		0, 0, arr
	 */
	public void DFS(int L, int sum, int[] arr) {
		if(flag) { // flag�� true��, ����Լ� ����
			return;
		}
		
		/*
			���� �������� > ������ ������ / 2���� ũ�� ����Լ� ����
			sum�� total/2 ���� ũ�� YES�� ���ü��� ����.
		*/
		if(sum > total / 2) {
			return;
		}
		
		// n�� ���Ұ����� 6�̴�. L�� ������ ���Ѵ�.
		if(L == n) {
			if((total - sum) == sum) { // 6, 16���� true�� �ȴ�.
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L+1, sum + arr[L], arr);
			
			System.out.println(L);
			System.out.println(sum);
			
			DFS(L+1, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		
		_01_����_����_�κ�����_DFS_�Ƹ���_���ͺ�1 T = new _01_����_����_�κ�����_DFS_�Ƹ���_���ͺ�1();
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // n�� ������ ����
		
		int[] arr = new int[n]; // { 1, 3, 5, 6, 7, 10 }
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i]; // �迭 ������ ����(32)
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
		
	}
}




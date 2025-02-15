package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _04_�ߺ�����_���ϱ�1 {
	
	/*
		���� : 1���� N�������� ������ ���� ��, 
		�� �� �ߺ��� ����Ͽ� M���� �̾� �Ϸķ� ���� �ϴ� ����� ����ϴ� ����
		M�� 2�� �ι� �̴´ٴ� ���̴�.
		
		�Է� �� : 3 2
	 */
	
	static int[] pm;
	static int n, m;
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			// 1 ~ 3, L�� 2�϶� ����ϰ� i�� �����Ǵ� �κ��� �߿��ϴ�.
			for(int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		_04_�ߺ�����_���ϱ�1 T = new _04_�ߺ�����_���ϱ�1();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}
}

package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _06_����_���ϱ�1 {
	
	/*
		���� : N���� �ڿ����� �־����� �� �� M���� �̾� "�Ϸķ� �����ϴ� ����� ��� ���"�մϴ�.
		3 2
		3 6 9
		3 6
		3 9
		6 3
		6 9
		9 3
		9 6
	 */
	static int[] pm, ch, arr; // pm:�����ǰ��, ch:üũ�迭, arr:�Էµȼ���
	static int n, m;
	public void DFS(int L) {
		if(L == m) { // ������ �ϳ� �ϼ��Ȱ�
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) { // �Է¹��� ������ ������ŭ �ݺ��Ѵ�.
				if(ch[i] == 0) { // üũ�迭���� index�� �ش��ϴ� ���� ������ �ʾ��� ��
					ch[i] = 1; // üũ ���ش�.
					pm[L] = arr[i]; // ������ ��� �迭�� �Է¹��� ���ڸ� �ִ´�.
					DFS(L+1);
					ch[i] = 0; // üũ������ ���ش�.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		_06_����_���ϱ�1 T = new _06_����_���ϱ�1();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // ������ ����
		m = kb.nextInt(); // �� ���� ������
		
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		ch = new int[n]; // ���ڰ�����ŭ ������ �Ѵ�.
		pm = new int[m];
		T.DFS(0);
	}
}









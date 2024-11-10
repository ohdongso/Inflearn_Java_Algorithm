package Section_08_Recursive_Tree_GraphDFSBFS;

public class _03_���丮��1 {
	/*
		1, DFS(5)
		2, 5 * DFS(4)
		3, 5 * 4 * DFS(3)
		4, 5 * 4 * 3 * DFS(2)
		5, 5 * 4 * 3 * 2 * DFS(1)
		6, 5 * 4 * 3 * 2 * 1
		
		7, ���ñ����� DFS �Լ� ȣ��κ��� �׿��ִ�.(���Լ���)
		DFS(1) > 1 = 1
		DFS(2) > 1 * 2 = 2
		DFS(3) > 1 * 2 * 3 = 6
		DFS(4) > 1 * 2 * 3 * 4 = 24
		DFS(5) > 1 * 2 * 3 * 4 * 5 = 120
		
		
	 */
	public int DFS(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * DFS(n - 1); // ����Լ��� ���� �ȴ�.
		}
	}
	
	public static void main(String[] args) {
		_03_���丮��1 T = new _03_���丮��1();
		System.out.println(T.DFS(6));
	}
}
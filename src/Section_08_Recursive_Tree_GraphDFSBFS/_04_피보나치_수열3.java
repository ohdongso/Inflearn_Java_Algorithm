package Section_08_Recursive_Tree_GraphDFSBFS;

public class _04_�Ǻ���ġ_����3 {
	/*
		1,                    DFS(5)
		2,         DFS(3)       +       DFS(4)
		3,    DFS(1) + DFS(2)       DFS(2) + DFS (3)
		==> fibo[]�迭�� �ش� ���� ã�Ƽ� ���ʿ��� ȣ���� ���δ�.!(�޸����̼�)
	 */
	
	static int[] fibo;
	
	public int DFS(int n) {		
		if(fibo[n] > 0) {
			return fibo[n];
		}
		
		if(n == 1) {
			return fibo[n] = 1;
		} else if(n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = DFS(n-2) + DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		_04_�Ǻ���ġ_����3 T = new _04_�Ǻ���ġ_����3();
		
		int n = 45;
		fibo = new int[n+1]; // 0�� index �ʿ����.
		T.DFS(n); // DFS���� 10�� �ѹ� ����. ȿ����
		
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
		
	}
}
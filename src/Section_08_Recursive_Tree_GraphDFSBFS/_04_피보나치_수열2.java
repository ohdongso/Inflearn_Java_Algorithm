package Section_08_Recursive_Tree_GraphDFSBFS;

public class _04_�Ǻ���ġ_����2 {

	static int[] fibo;
	
	public int DFS(int n) {
		if(n == 1) {
			return fibo[n] = 1;
		} else if(n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = DFS(n-2) + DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		_04_�Ǻ���ġ_����2 T = new _04_�Ǻ���ġ_����2();
		
		int n = 10;
		fibo = new int[n+1]; // 0�� index �ʿ����.
		T.DFS(n); // DFS���� 10�� �ѹ� ����. ȿ����
		
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
		
	}
}
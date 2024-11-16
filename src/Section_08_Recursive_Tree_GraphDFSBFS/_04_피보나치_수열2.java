package Section_08_Recursive_Tree_GraphDFSBFS;

public class _04_피보나치_수열2 {

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
		_04_피보나치_수열2 T = new _04_피보나치_수열2();
		
		int n = 10;
		fibo = new int[n+1]; // 0번 index 필요없다.
		T.DFS(n); // DFS에서 10만 한번 돈다. 효율적
		
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
		
	}
}
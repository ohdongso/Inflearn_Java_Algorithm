package Section_08_Recursive_Tree_GraphDFSBFS;

public class _04_피보나치_수열3 {
	/*
		1,                    DFS(5)
		2,         DFS(3)       +       DFS(4)
		3,    DFS(1) + DFS(2)       DFS(2) + DFS (3)
		==> fibo[]배열에 해당 값이 찾아서 불필요한 호출을 줄인다.!(메모리제이션)
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
		_04_피보나치_수열3 T = new _04_피보나치_수열3();
		
		int n = 45;
		fibo = new int[n+1]; // 0번 index 필요없다.
		T.DFS(n); // DFS에서 10만 한번 돈다. 효율적
		
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
		
	}
}
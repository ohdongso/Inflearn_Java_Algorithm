package Section_08_Recursive_Tree_GraphDFSBFS;

public class _04_피보나치_수열1 {
	/*
		1,                    DFS(5)
		2,         DFS(3)       +       DFS(4)
		3,    DFS(1) + DFS(2)       DFS(2) + DFS (3)
	 	
	 	1,                    DFS(5)
		2,         DFS(3)       +       DFS(4)
		3,         1 + 1                1 + DFS(3)
		4,      					   DFS (1) + DFS (2)
	 	
	 	1,                DFS(5)
		2,           2      +       DFS(4)
		3,         1 + 1                1 + DFS(3)
		4,      					        1 + 1
	 	
	 	1,                DFS(5)
		2,           2      +       DFS(4)
		3,         1 + 1                1 + 2
		4,      					      1 + 1
	 	
	 	1,                DFS(5)
		2,              2   +    3
		3,         1 + 1          1 + 2
		4,      					1 + 1
		
		1,                  5
		2,              2   +   3
		3,         1 + 1         2 + 3
		4,      				   1 + 2
	 */
	
	public int DFS(int n) {
		if(n == 1) {
			return 1;
		} else if(n == 2) {
			return 1;
		} else {
			return DFS(n-2) + DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		_04_피보나치_수열1 T = new _04_피보나치_수열1();
		int n = 10;
		
		for(int i = 1; i <= n; i++) {
			System.out.print(T.DFS(i) + " ");
		}
		
	}
}
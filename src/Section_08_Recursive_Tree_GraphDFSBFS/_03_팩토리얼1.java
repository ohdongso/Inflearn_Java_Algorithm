package Section_08_Recursive_Tree_GraphDFSBFS;

public class _03_팩토리얼1 {
	/*
		1, DFS(5)
		2, 5 * DFS(4)
		3, 5 * 4 * DFS(3)
		4, 5 * 4 * 3 * DFS(2)
		5, 5 * 4 * 3 * 2 * DFS(1)
		6, 5 * 4 * 3 * 2 * 1
		
		7, 스택구조로 DFS 함수 호출부분이 쌓여있다.(후입선출)
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
			return n * DFS(n - 1); // 재귀함수가 리턴 된다.
		}
	}
	
	public static void main(String[] args) {
		_03_팩토리얼1 T = new _03_팩토리얼1();
		System.out.println(T.DFS(6));
	}
}
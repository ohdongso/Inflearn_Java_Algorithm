package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _02_바둑이_승차_DFS1 {
	
	/*
		부분집합 문제
		
259 5
81
58
42
33
61

	 */
	
	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr) {
		
		if(sum > c) {
			return;
		}
		
		if(L == n) {
			answer = Math.max(answer, sum);		
		} else {
			DFS(L+1, sum + arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		
		_02_바둑이_승차_DFS1 T = new _02_바둑이_승차_DFS1();
		
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt(); // 최대적재 무게
		n = kb.nextInt(); // 원소 개수
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
		
	}
}




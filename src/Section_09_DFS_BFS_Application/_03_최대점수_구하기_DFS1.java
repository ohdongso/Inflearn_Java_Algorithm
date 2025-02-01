package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _03_최대점수_구하기_DFS1 {
	
	/*
		문제 : 주어진 시간동안 문제를 풀때 최대점수를 얻을 수 있는 경우를 구해라.
5 20
10 5
25 12
15 8
6 3
7 4
41
	 */
	static int answer = Integer.MIN_VALUE, n, m;
	boolean flag = false;
	public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
		if(time > m) { // m(제한시간)이 넘는 재귀는 필터링 해준다.
			return;
		}
		
		if(L == n) {
			answer = Math.max(answer, sum);
		} else {
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt); // 문제를 푸는 것
			DFS(L+1, sum, time, ps, pt); // 문제를 풀지 않는 것
		}
		
	}
	
	public static void main(String[] args) {
		_03_최대점수_구하기_DFS1 T = new _03_최대점수_구하기_DFS1();
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 문제개수
		m = kb.nextInt(); // 제한시간
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = kb.nextInt(); // 점수
			b[i] = kb.nextInt(); // 걸리는 시간
		}
		
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
}

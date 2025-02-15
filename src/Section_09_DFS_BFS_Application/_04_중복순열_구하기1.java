package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _04_중복순열_구하기1 {
	
	/*
		문제 : 1에서 N번까지의 구슬이 있을 때, 
		이 중 중복을 허락하여 M번을 뽑아 일렬로 나열 하는 방법을 출력하는 문제
		M이 2면 두번 뽑는다는 말이다.
		
		입력 값 : 3 2
	 */
	
	static int[] pm;
	static int n, m;
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			// 1 ~ 3, L이 2일때 출력하고 i가 증가되는 부분이 중요하다.
			for(int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		_04_중복순열_구하기1 T = new _04_중복순열_구하기1();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}
}

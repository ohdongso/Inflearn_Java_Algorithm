package Section_03_Two_Pointers__Sliding_window;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_두_배열_합치기1 {
	/*
	 	1, N == 첫 번째 배열크기, M == 두 번째 배열크기
	 	2, 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
	  	3, 투 포인터를 사용해서 해결하면 효율적이다.
	 */
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		// 두개의 포인터는 첫 번째 값을 가리키고 있어야 한다.
		int p1 = 0, p2 = 0;
		
		// p1이나 p2 둘중 하나만 마지막까지 가면 while문은 멈춘다.
		while(p1 < n && p2 < m) {
			if(a[p1] < b[p2]) {
				answer.add(a[p1++]);
			} else {
				 answer.add(b[p2++]);
			}
		} // while문 끝.
		
		while(p1 < n) {
			answer.add(a[p1++]);
		} // while문 끝.
		
		while(p2 < m) {
			answer.add(b[p2++]);
		} // while문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_01_두_배열_합치기1 T = new _01_두_배열_합치기1();
		Scanner kb = new Scanner(System.in);
		
		// 1번째 배열
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		
		// 2번째 배열
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, m, a, b)) {
			System.out.print(x + " ");
		}
	}
}
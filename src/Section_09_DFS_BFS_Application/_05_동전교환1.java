package Section_09_DFS_BFS_Application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _05_동전교환1 {
	
	/*
		문제 : 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
		각 단위의 동전은 무한정 쓸 수 있다.
	 */
	static int n, m, answer = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer[] arr) {
		if(sum > m) {
			return;
		}
		
		if(L >= answer) {
			return;
		}
		
		if(sum == m) { // 합계가 거슬러줄 금액이 됐을 때
			answer = Math.min(answer, L); // L은 레벨이기도 하지만, sum을 만들어내는 동전의 개수다.
		} else {		
			for(int i = 0; i < n; i++) { // 동전의 개수는 다 사용하는 것
				DFS(L+1, sum+arr[i], arr);
			}	
		}	
	}
	
	public static void main(String[] args) {
		_05_동전교환1 T = new _05_동전교환1();
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		
		Integer[] arr= new Integer[n]; // 배열에 동전의 종류를 담는다.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		m = kb.nextInt(); // 거슬러줄 금액
		T.DFS(0, 0, arr);
		System.out.println(answer); // answer는 동전의 최소 개수를 저장한다.
	}
}

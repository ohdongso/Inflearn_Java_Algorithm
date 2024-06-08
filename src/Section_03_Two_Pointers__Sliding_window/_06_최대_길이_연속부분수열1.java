package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _06_최대_길이_연속부분수열1 {
	/*
	 	1, 0과 1로 구성된 길이가 N인 수열이 주어집니다. 이 수열에서 최대 k번을 0을 1로 변경 해서
	 	   이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
	 	2, 투포인터 알고리즘을 사용하면 된다.
	 */
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) {
				cnt++;
			}
			
			// cnt는 0이 1로 변경된 횟수를 의미하는 변수다.
			// lt가 0이 나올때 까지 계속 증가하고, 0이 나오면 cnt를 -1해준다.
			while(cnt > k) {
				if(arr[lt] == 0) {
					cnt--;
				}
				lt++;
			} // while문 끝.
			
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_최대_길이_연속부분수열1 T = new _06_최대_길이_연속부분수열1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}
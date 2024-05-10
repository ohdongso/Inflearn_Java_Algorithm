package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _03_최대_매출1 {
	/*
	 	1, N일 동안의 매출기록중 K일 동안의 최대 매출액이 얼마인지 구하는 알고리즘
	 	2, "N" == 주어진 일수, "K" == 연속된 일수
	 	3, Sliding_window를 사용해서 해결하면 효율적이다.
	 */
	
	public int solution(int n, int k, int[] arr) {
		/*
		 	1, K 크기에 해당하는 윈도우를 >>> 방향으로 한칸씩 옮기면서 비교해준다.
		 	2, +arr[i]와, -arr[i-k]를 통해 교집합 2개를 제외한 첫값은 빼고 마지막 값은 더해주는 과정을 반복한다.
		 	3, 반복이 끝나면 K에 해당하는 최대매출액인 answer 반환하고, 출력해준다.
		 */
		int answer = 0, sum = 0;
		
		// 처음 윈도우를 구해준다.
		for(int i = 0; i < k; i++) {
			sum += arr[i];
		}
		answer = sum;
		
		for(int i = k; i < n; i++) { // 시작을 처음 윈도우 크기의 다음값(4번째 데이터)의 index(3)으로 i를 초기화 시켜준다.
			sum += (arr[i] - arr[i-k]); // sum변수에 i값을 더하고, i-k값을 빼준다.
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_03_최대_매출1 T = new _03_최대_매출1();
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
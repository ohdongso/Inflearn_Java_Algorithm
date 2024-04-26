package Section_02_Array;

import java.util.Scanner;

public class _07_점수계산1 {
	/*
		1, n개에 해당하는 숫자 배열을 입력받는다.
		2, 1이면 cnt를 1로 변경하고 sum에 누적한다.
		3, 1이 연속으로 나오면 cnt를 1에서 계속 더해주고, sum에 누적한다.
	*/
	public int solution(int n, int[] arr) {
		int answer = 0, cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		_07_점수계산1 T = new _07_점수계산1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		// n개에 맞는 숫자를 공백을 기준으로 한번에 배열에 입력받을수 있다.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}
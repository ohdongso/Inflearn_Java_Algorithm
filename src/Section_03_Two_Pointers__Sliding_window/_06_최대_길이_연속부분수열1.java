package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _06_최대_길이_연속부분수열1 {
	/*
	 	1, 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력
	 	2, "N" == 2개 이상 숫자의 합으로 구해줄 정수
	 	3, 투포인터를 사용해서 해결하면 효율적이다.
	 */
	
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n / 2 + 1; // N에서 연속된 숫자로 만들수 있는, 연속된 값중 최대값을 의미한다.
		int[] arr = new int[m]; // ex) 15를 입력받으면 8이 연속된 숫자중 최대값이고 배열의 크기가 된다.
		
		for(int i = 0; i < m; i++) { // 배열에 값 저장(1~8)
			arr[i] = i + 1;
		}
		
		for(int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum == n) {
				answer++;
			}
			while(sum >= n) { // sum이 n 이상인경우 lt를 계속 >>> 이동시켜서, sum이 n보다 작아지게 해준다.
				sum -= arr[lt++];
				if(sum == n) {
					answer++;
				}
			} // while문 끝.
		} // for문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_최대_길이_연속부분수열1 T = new _06_최대_길이_연속부분수열1();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		System.out.print(T.solution(n));
	}
}
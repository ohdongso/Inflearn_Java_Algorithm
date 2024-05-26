package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _04_연속_부분수열1 {
	/*
	 	1, 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 알고리즘
	 	2, "N" == 숫자개수, "M" == 특정숫자
	 	3, 투포인터를 사용해서 해결하면 효율적이다.
	 */
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) { // 증가
			sum += arr[rt]; // 더하고
			if(sum == m) { // 확인(lt~rt까지의 합.)
				answer++;
			}
			
			// lt~rt 값이 m이상이면
			// sum의 값이 m값보다 크기거나 같기때문에, sum이 m보다 작아질 때 까지 while문을 반복한다.
			// rt가 n까지 돌고, 현재 lt에서 마지막숫자(rt)의 합이 sum이랑 같거나 크지 않으면 lt를 >>> +1 해줄 필요가 없어서 끝난다.
			while(sum >= m) { 
				 sum -= arr[lt++]; // sum에서 기존 lt값을 뺴고 lt index를 +1 해준다.
				 if(sum == m) { // lt~rt 값이 m이면 answer을 +1 해준다.
					 answer++;
				 }
			} // while문 끝.
		} // for문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_04_연속_부분수열1 T = new _04_연속_부분수열1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 몇개의 수열을 받을지
		int m = kb.nextInt(); // 부분 구간의 합
		
		int[] arr = new int[n]; // 입력받은 배열
		
		for(int i = 0; i < n; i++) { // 각각의 숫자 배열
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, m, arr));
	}
}
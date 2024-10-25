package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _08_이분검색1 {
	/*
	 	1, mid가 정렬된 배열에서 순서가 되는 이유는, lt와 rt가 중앙값을 기준으로 변수에 저장 되기 때문에
	 	lt는 0에서 mid가 더해진 값으로, rt는 n-1값에서 mid가 빼기 된 값으로 변경 되기때문에
	 	mid는 정렬된 배열에서 몇 번째 숫자인지 알 수 있다.
	 */
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr); // 오름차순 정렬
		int lt = 0, rt = n-1;
		
		while(lt <= rt) {
			int mid = (lt+rt) / 2; // 소수점은 버림처리 된다.
			
			if(arr[mid] == m) {
				answer = mid + 1;
				break;
			}
			
			if(arr[mid] > m) { // 찾고자 하는 값이 더 작기때문에 큰 쪽을 날려야 한다.
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
			
		} // while문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_08_이분검색1 T = new _08_이분검색1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 입력받을 숫자 개수
		int m = kb.nextInt(); // 찾을 숫자
		
		int[] arr = new int[n]; // 입력받은 숫자 배열
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for문 끝.
		
		System.out.println(T.solution(n, m, arr));
	}
}
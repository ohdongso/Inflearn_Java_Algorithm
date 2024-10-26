package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _09_뮤직비디오_결정알고리즘1 {
	/*
	 	1, n(전체노래개수), m(사용가능한 CD 개수), arr(입력받을 노래 배열) 3가지를 입력받는다.
	 	2, lt는 노래배열중 최대값을 rt는 노래배열의 총합을 기준으로 초기화 한다.
	 	3, (lt <= rt) 이조건으로 while문을 반복 시키고, mid(중앙값) == (lt+rt)/2를 구해준다.
	 	4, count()함수를 이용해, capacity를 기준으로 사용 CD개수를 구한다.
	 	5, 사용개수 cnt가 사용할수 있는 cd 개수 m이하이면 답이 될 수 있고, mid를 줄여나가면서 최적을 값을 찾는다. 
	 	   그리고 answer에 CD용량을 저장한다.
	 	6, 사용개수 cnt가 사용할수 있는 cd 개수 m초과 이면 답이 될 수 없고, mid를 증가해주면서 범위안에 값을 찾는다.
	 	7, (lt <= rt)을 만족하지 않을 때 까지 while문이 반복되기 때문에 최적의 값을 찾을 수 있다.!
	 */
	public int count(int[] arr, int capacity) {
		// 첫 번째 CD, 현재 사용되고 있는 CD에 용량을 확인하는 변수
		int cnt = 1, sum = 0;
		
		for(int x : arr) {
			// CD한장의 용량이 넘어가면
			if(sum + x > capacity) {
				cnt++; // cd추가
				sum = x; // 새로운 CD에 노래 용량을 초기화 시켜준다.
			} else {
				sum += x;
			}
		} // for문 끝.
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		// 입력받은 숫자중 최대값이 lt의 초기값이 된다.
		// CD 한장에 최소한 1곡이 들어갈수 있는 경우의 수를 의미
		int lt = Arrays.stream(arr).max().getAsInt();
		
		// 입력받은 숫자들의 합이 rt의 초기값이 된다.
		// CD 한장에 모든 곡이 들어갈수 있는 경우의 수를 의미
		int rt = Arrays.stream(arr).sum();
		
		// 이분검색
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // CD 한장의 용량
			
			// 사용가능한 CD 개수 m보다 사용된 cd 개수가 더 적으면, rt를 감소시킨다.
			// 이쪽으로 들어오는건 더좋은 값을 찾기위해 범위를 줄여나가는 것
			if(count(arr, mid) <= m) { // 용량 감소 시켜 최적의 값을 찾는다.
				answer = mid;
				rt = mid - 1;
			
			// m보다 사용된 cd 개수가 더 많으면, lt를 증가시킨다.
			// 이쪽으로 들어오는건 값이 될수가 없어서 다른 값을 찾는 것
			} else { // 용량을 증가 시켜 범위에 해당시키는 값을 찾는다.
				// 이값은 answer에 저장 하면 안되는 이유가 범위에 포함 자체가 안된다.
				// answer = mid; 
				lt = mid + 1;
			}		
		} // while문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_09_뮤직비디오_결정알고리즘1 T = new _09_뮤직비디오_결정알고리즘1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 전체 노래 개수
		int m = kb.nextInt(); // 사용가능한 CD 개수
		
		int[] arr = new int[n]; // 입력받을 노래 배열
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for문 끝.
		
		System.out.println(T.solution(n, m, arr));
	}
}
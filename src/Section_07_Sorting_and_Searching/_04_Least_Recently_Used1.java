package Section_07_Sorting_and_Searching;

import java.util.Scanner;

public class _04_Least_Recently_Used1 {
	/*
	  	1, 캐시사이즈, 작업개수 2개를 입력받는다.
	  	2, 작업배열에서 작업번호를 하나씩 꺼내서 캐시배열에 있는지 비교한다.
	  	3, 있다면, hit로 pos에 작업번호 index를 저장한다.
	 	4, pos가 -1이면 miss로 캐시배열의 마지막부터 2번째까지 반복하며 >으로한칸씩 당겨준다.
	 	5, pos가 -1이 아니면 hit로 pos부터 2번째까지 반복하며 >으로한칸씩 당겨준다.
	  	6, 마지막으로 (hit, miss)든 선택된 작업번호를 1번째에 저장해 준다.
	  	7, 이 알고리즘은 hit가 발생하면 i가 pos부터시작, miss가 발생하면 size-1부터 시작한뒤
	  	   한 칸씩 당겨주는걸 파악하는게 중요하다.!
	 */
	
	
	// s=size, n=작업의 개수, arr=작업이 처리하는 순서
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int [size];
		
		// 작업번호 하나씩 출력
		for(int x : arr) {
			int pos = -1;
			
			for(int i = 0; i < size; i++) {
				if(x == cache[i]) { // hit(작업번호가, 캐시배열에 있다면)
					pos = i;
				}
			} // 안쪽 for문 끝
			
			if(pos == -1) { // miss(작업번호가, 캐시배열에 없다면)
				for(int i = size-1; i >= 1; i--) { // 캐시배열 끝에서부터 2번째 자리까지 반복한다
					cache[i] = cache[i-1]; // 한 칸씩 당겨주면서 복사한다.
				}
				cache[0] = x; // 1번째 자리에는 miss(작업번호가, 캐시배열에 없다면)가 발생한 작업번호를 저장해준다.
			} else { // hit(작업번호가, 캐시배열에 있다면)
				for(int i = pos; i >= 1; i--) { // 캐시배열에서 hit가 발생한 인덱스부터 2번째 자리까지 반복한다.
					cache[i] = cache[i-1]; // 한 칸씩 당겨주면서 복사한다.
				}
				cache[0] = x; // 1번째 자리에는 hit가 발생한 작업번호를 저장한다.
			}
			
			
		} // 바깥 for문 끝
		
		return cache;
	}
	
	public static void main(String[] args) {
		_04_Least_Recently_Used1 T = new _04_Least_Recently_Used1();
		Scanner kb = new Scanner(System.in);
		
		int s = kb.nextInt(); // 캐시 사이즈
		int n = kb.nextInt(); // 작업개수
		int[] arr= new int[n]; // 작업 담길 배열 선언
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt(); // 수행번호 저장
		}
		
		for(int x : T.solution(s, n, arr)) {
			System.out.print(x + " ");
		}
	}
}
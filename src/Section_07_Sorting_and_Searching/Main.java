package Section_07_Sorting_and_Searching;

import java.util.Scanner;

public class Main {
	
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
		Main T = new Main();
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
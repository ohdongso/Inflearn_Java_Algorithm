package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 
	 */
	public int count(int[] arr, int dist) {
		
		int cnt = 1; // 말 마리 수 = 1마리 배치
		int ep = arr[0]; // 바로 전에 말을 배치한 마구간의 좌표
		
		for(int i = 1; i < arr.length; i++) {
			// CD한장의 용량이 넘어가면
			if(arr[i] - ep >= dist) {
				cnt++; // 말 한마리 증가
				ep = arr[i];
			} 
		} // for문 끝.
		
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr); // 오름차순 정렬
		int lt = 1;
		int rt = arr[n - 1];
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // 말과 말사이의 거리
			if(count(arr, mid) >= c) { // mid에 해당하는 거리로 말을 다 배치할수 있다. mid를 좁혀나간다.
				answer = mid;
				lt = mid + 1;
			} else { // 사이거리가 너무 멀어서 말을 다 배치 할 수 없다. mid를 증가시켜나간다.
				rt = mid - 1;
			}
		} // while문 끝
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 마구간 좌표 개수
		int c = kb.nextInt(); // 말 마리 수
		
		int[] arr = new int[n]; // 마구간 좌표 저장 될 배열
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for문 끝.
		
		System.out.println(T.solution(n, c, arr));
	}
}
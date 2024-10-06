package Section_07_Sorting_and_Searching;

import java.util.Scanner; 

public class _02_버블_정렬1 {
	/*

	 */
	public int[] solution(int n, int[] arr) {
		// 숫자 5개를 받으면 4번째 숫자까지 돈다.(i는 j반복문의 위해 존재한다.)
		// 0,1,2,3
		for(int i = 0; i < n-1; i++) {
			
			/*
			 	숫자 5개를 받으면 4번째 숫자까지 돈다.
			 	(0,1),(1,2),(2,3),(3,4) ==> 마지막 index3과, index4를 비교 ==> i=0
			 	(0,1),(1,2),(2,3) ==> 마지막 index2와, index3을 비교 ==> i=1
			 	(0,1),(1,2) ==> 마지막 index1과, index2를 비교 ==> i=2
			 	(0,1), ==> 마지막 index0과, index1을 비교 ==> i=3
				i가 3이되면, j는 0으로 한번만 반복문이 수행된다.
			 	==> (비교할index, 비교할index)
			 */		
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		} // 바깥 for문 끝.
		return arr;
	}
	
	public static void main(String[] args) {
		_02_버블_정렬1 T = new _02_버블_정렬1();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 입력받을 숫자의 개수
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) { // 배열에 숫자 저장
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) { // 버블정렬된 배열을 하나씩 출력
			System.out.print(x + " ");
		}
	}
}
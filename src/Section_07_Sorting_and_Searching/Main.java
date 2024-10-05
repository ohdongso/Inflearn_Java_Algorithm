package Section_07_Sorting_and_Searching;

import java.util.Scanner; 

public class Main {
	/*
	 	1, 숫자로 이루어진 배열을 받는다.
	 	2, i는 0~n-1까지 비교한다.
	 	3, j는 i+1부터 n까지 비교한다.
	 	4, i에 해당하는 값보다 더 작은 값이 있다면, i에 j에 해당하는 값을 넣어주고 계속 반복한다.
	 	5, 결과적으로 index i에 순차적으로 작은 값들이 오름 차순 정렬 되는 알고리즘이다.
	 */
	public int[] solution(int n, int[] arr) {
		for(int i = 0; i < n-1; i++) { // 비교기준이 되는 index는 n까지 돌 필요가 없다.
			int idx = i; // 비교기준이 되는 index값을 넣는다.
			
			for(int j = i+1; j < n; j++) { // 비교값은 i보다 1큰 수부터 시작하고, n까지 비교한다.
				if(arr[j] < arr[idx]) { // 비교기준이 되는 값보다 비교값이 더 작다면 idx에 비교값 index를 넣는다.
					idx = j; // 비교기준값이 저장된 변수에, 비교기준보다 더 작은 비교값 index를 저장
				}
			}
			
			int tmp = arr[i]; // tmp변수에 비교기준값 저장
			arr[i] = arr[idx]; // 비교기준값에 비교값 저장
			arr[idx] = tmp; // 비교값에 비교기준값 저장
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 입력받을 숫자의 개수
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) { // 배열에 숫자 저장
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) { // 선택정렬된 배열 하나씩 출력
			System.out.print(x + " ");
		}
	}
}
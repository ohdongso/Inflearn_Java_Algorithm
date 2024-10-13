package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _05_중복_확인1 {
	/*

	 */
	
	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == arr[i+1]) {
				answer = "D";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_05_중복_확인1 T = new _05_중복_확인1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 입력받을 숫자 개수
		int[] arr= new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, arr));
	}
}
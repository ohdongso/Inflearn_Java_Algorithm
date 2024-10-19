package Section_07_Sorting_and_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _06_장난꾸러기1 {
	/*

	 */
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) {
				answer.add(i+1);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_장난꾸러기1 T = new _06_장난꾸러기1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 반 전체 학생 수
		int[] arr= new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
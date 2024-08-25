package Section_04_HashMap_TreeSet;

import java.util.Collections; 
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder()); // 내림차순 정렬
		
		// 주어진 자연수가 배열에 저장 돼 있고, 그중 3장으로 뽑을수 있는
		// 모든 카드의 경우의 수에 대한 합이 TreeSet에 저장된다.
		for(int i = 0; i < n; i++) { 
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0; // 몇번째
		for(int x : Tset) {
			cnt++;
			if(cnt == k) {
				return x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 배열에 저장될 자연수 개수
		int k = kb.nextInt(); // 몇 번쨰로 큰 수를 출력할지 저장하는 변수
		int[] arr = new int[n]; // 배열 크기 선언
		for(int i = 0; i < n; i++) { // 배열에 자연수 저장
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
package Section_04_HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < k - 1; i++) { // 3개 세팅 , rt값을 빼기 때문에 3개만 세팅
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		
		int lt = 0;
		for(int rt = k - 1; rt < n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt]) - 1);
			if(HM.get(arr[lt]) == 0) {
				HM.remove(arr[lt]);
			}
			lt++;
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr= new int[n];
		for(int i = 0; i < n; i++) { // 공백을 기준으로 입력 값을 배열에 담아준다.
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}
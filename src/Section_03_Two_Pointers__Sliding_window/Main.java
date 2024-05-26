package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) { // 증가
			sum += arr[rt]; // 더하고
			if(sum == m) { // 확인(lt~rt까지의 합.)
				answer++;
			}
			
			while(sum >= m) { // lt~rt 값이 m이상이면
				 sum -= arr[lt++]; // sum에서 기존 lt값을 뺴고 lt index를 +1 해준다.
				 if(sum == m) { // lt~rt 값이 m이면 answer을 +1 해준다.
					 answer++;
				 }
			} // while문 끝.
		} // for문 끝.
		
		
		return answer;
	}
	

public static void main(String[] args) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	
	int n = kb.nextInt();
	int m = kb.nextInt();
	
	int[] arr = new int[n];
	
	for(int i = 0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	
	System.out.print(T.solution(n, m, arr));
}
}
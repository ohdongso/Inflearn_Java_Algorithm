package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class Main {
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) {
				cnt++;
			}
			
			while(cnt > k) {
				if(arr[lt] == 0) {
					cnt--;
				}
				lt++;
			} // while¹® ³¡.
			
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
	
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n / 2 + 1;
		int[] arr = new int[m];
		
		for(int i = 0; i < m; i++) {
			arr[i] = i + 1;
		}
		
		for(int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum == n) {
				answer++;
			}
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	

public static void main(String[] args) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int k = kb.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	System.out.print(T.solution(n, k, arr));
}
}
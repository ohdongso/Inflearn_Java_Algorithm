package Section_03_Array;

import java.util.Scanner;

public class _03_가위_바위_보1 {

	public String solution(int n, int[] a, int[] b) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) { // 비기는 경우
				answer += "D";
			} else if(a[i] == 1 && b[i] == 3) { // 가위 VS 보 ==> A가 이기는 경우
				answer += "A";
			} else if(a[i] == 2 && b[i] == 1) { // 바위 VS 가위 ==> A가 이기는 경우
				answer += "A";
			} else if(a[i] == 3 && b[i] == 2) { // 보 VS 바위 ==> A가 이기는 경우
				answer += "A";
			} else { // 그 외에 나머지 경우는 B가 이긴다.
				answer += "B";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_03_가위_바위_보1 T = new _03_가위_바위_보1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 게임 횟수 n
		int[] a = new int[n];
		int[] b = new int[n];
		
		// (a, b)에 해당하는 가위바위보 정보를 저장한다.
		for(int i = 0; i < n; i++) { 
			a[i] = kb.nextInt();
		}
		
		for(int i = 0; i < n; i++) { 
			b[i] = kb.nextInt();
		}
		
		for(char x : T.solution(n, a, b).toCharArray()) {
			System.out.println(x);
		}
	}
}
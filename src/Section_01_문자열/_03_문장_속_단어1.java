package Section_01_문자열;

import java.util.Scanner;

public class _03_문장_속_단어1 {

	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE; // int형의 가장 작은 값으로 초기화
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length(); // split로 짤린 각각의 문자열 길이
			if(len > m) { // 동일할 경우 가장 앞쪽에 위치한것을 출력하면 되기 때문에 ">" 조건으로 가능하다.
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_03_문장_속_단어1 T = new _03_문장_속_단어1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));	
	}
}
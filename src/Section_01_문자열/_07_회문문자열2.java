package Section_01_문자열;

import java.util.Scanner;

public class _07_회문문자열2 {
	
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_07_회문문자열2 T = new _07_회문문자열2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));		
	}
}
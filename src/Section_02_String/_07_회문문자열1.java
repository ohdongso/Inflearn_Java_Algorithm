package Section_02_String;

import java.util.Scanner;

public class _07_회문문자열1 {
	
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) {
				return "NO";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_07_회문문자열1 T = new _07_회문문자열1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));		
	}
}
package Section_02_String;

import java.util.Scanner;

public class _08_유효한_팰린드롬1 {
	
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
//		System.out.println(s);
		String tmp = new StringBuilder(s).reverse().toString();
		
		if(s.equals(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_08_유효한_팰린드롬1 T = new _08_유효한_팰린드롬1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));		
	}
}
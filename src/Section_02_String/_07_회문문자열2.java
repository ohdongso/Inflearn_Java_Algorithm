package Section_02_String;

import java.util.Scanner;

public class _07_ȸ�����ڿ�2 {
	
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_07_ȸ�����ڿ�2 T = new _07_ȸ�����ڿ�2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));		
	}
}
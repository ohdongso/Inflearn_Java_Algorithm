package Section_02_String;

import java.util.Scanner;

public class _09_숫자만_추출1 {
	
	public int solution(String s) {
		int answer = 0;
		
		for(char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_09_숫자만_추출1 T = new _09_숫자만_추출1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));		
	}
}
package Section_01_String;

import java.util.Scanner;

public class _09_���ڸ�_����2 {
	
	public int solution(String s) {
		String answer = "";
		
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		_09_���ڸ�_����2 T = new _09_���ڸ�_����2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));		
	}
}
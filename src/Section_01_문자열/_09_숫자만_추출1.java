package Section_01_���ڿ�;

import java.util.Scanner;

public class _09_���ڸ�_����1 {
	
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
		_09_���ڸ�_����1 T = new _09_���ڸ�_����1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));		
	}
}
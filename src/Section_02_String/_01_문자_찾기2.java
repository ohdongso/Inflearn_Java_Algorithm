package Section_02_String;

import java.util.Scanner;

public class _01_문자_찾기2 {
	
	public int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_01_문자_찾기2 T = new _01_문자_찾기2();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}
}
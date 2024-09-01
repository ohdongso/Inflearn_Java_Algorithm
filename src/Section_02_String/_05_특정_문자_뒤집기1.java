package Section_02_String;

import java.util.Scanner;

public class _05_Ư��_����_������1 {
	
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			} else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
		_05_Ư��_����_������1 T = new _05_Ư��_����_������1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));		
	}
}
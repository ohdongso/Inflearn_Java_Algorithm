package Section_01_String;

import java.util.Scanner;

public class _02_대소문자_변환 {
	// TestCase : StuDY 
	
	public String solution(String str) {
		String answer = "";
		
		// 방법 1
		// 대문자 65~90, 소문자 97~122 ==> 대문자 소문자 "32"차이가 난다.
		// 연산 뒤 char로 형변환 안해주면, 알파벳에 맞는 아스키코드가 누적된다. (형변환 필요하다.)
		for(char x : str.toCharArray()) {
			if(x >= 97 && x <= 122) {
				answer += (char)(x - 32);
//				answer += (x - 32);
			} else {
				answer += (char)(x + 32);
//				answer += (x + 32);
			}
		}
		
		// 방법 2
		/*
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			} else {
				answer += Character.toLowerCase(x);
			}
		}
		*/
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_대소문자_변환 T = new _02_대소문자_변환();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); // 문자입력
		System.out.print(T.solution(str));
		
	}
}
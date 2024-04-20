package Section_01_문자열;

import java.util.Scanner;

public class _11_문자열_압축1 {
	/*
	 	KKHSSSSSSSE ==> 11개, index(0~10)
		1, 문자열을 입력받는다.
		2, 문자열 끝에 " "빈공을을 붙여서 변수선언한다. ==> 12개, index(0~11)
		3, 
	*/
	public String solution(String s) {
		String answer = "";
		// 입력받은 문자열 마지막에 " "공백으로 초기화해준다.
		// 마지막문자를 비교할때는 i+1이 되면 에러가 발생하기 때문에 " "을 추가로 붙여줘 에러를 막으면서 출력해준다.
		s = s + " "; 
		int cnt = 1;
		
		// 0~10 < 11(12-1)
		// 11개의 문자열을 입력받았으면 
		// (index값 ==> -1), (마지막" "전까지만 비교하기 ==> -1)
		// 2개의 상황때문에 조건이 "i < s.length()-1" 이렇게 된다.
		for(int i = 0; i < s.length()-1; i++) { 
			// index i에 해당하는 알파벳과 i+1에 해당하는 알파벳이 같으면 cnt++해준다.
			if(s.charAt(i) == s.charAt(i+1)) {
				cnt++;
			} else {
				answer += s.charAt(i);
				if(cnt > 1) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_11_문자열_압축1 T = new _11_문자열_압축1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
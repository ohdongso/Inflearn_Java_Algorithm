package Section_01_문자열;

import java.util.Scanner;

public class _01_문자_찾기_1 {
	
	/*
	 1, next()로 문자열을 입력받는다.
	 2, next().charAt(0)으로 문자형을 입력받는다.
	 3, 대문자 소문자 구별이 필요 없기 때문에 모두 대문자료 변경한 뒤 비교해서 답을 출력한다.
	 */
	
	public int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		// System.out.println(str + ", " + t);
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_01_문자_찾기_1 T = new _01_문자_찾기_1();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}
}
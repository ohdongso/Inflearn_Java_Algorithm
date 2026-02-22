package Section_02_String;

import java.util.Scanner;

public class _01_문자_찾기1 {
	
	/*
	 1, next()로 문자열을 입력받는다.
	 2, next().charAt(0)으로 문자형을 입력받는다.
	 3, 대문자 소문자 구별이 필요 없기 때문에 모두 대문자료 변경한 뒤 비교해서 답을 출력한다.
	 4, for문과 확장for문 2가지 선택지가 있다.
	 5, toUpperCase 문자열, 문자형을 대문자로 변경 할 수 있다.
	 6, toCharArray() 문자열을 처음부터 char형으로 하나씩 잘라서 반환한다.
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
		_01_문자_찾기1 T = new _01_문자_찾기1();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}
}
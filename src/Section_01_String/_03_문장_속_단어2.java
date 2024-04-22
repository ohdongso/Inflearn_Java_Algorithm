package Section_01_String;

import java.util.Scanner;

public class _03_문장_속_단어2 {
	// it is time to study
	
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		// indexOf(' ')를 사용하면 처음 발견되는 ' '부분의 index를 반환한다. ==> 2
		// 발견하지 못한다면 -1을 반환한다.
		while((pos = str.indexOf(' ')) != -1) {
			// substring(0, 5)을 하면 index번호로 0~5를 가리키고 실제로 0~4를 잘라낸다, 마지막 값 -1이라고 생각하면 된다. 
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) { // 같다라고 하면 제일 뒤쪽 값이 저장된다.
				m = len;
				answer = tmp;
			}
			

			// substring 인수값이 하나만 들어갈 경우 index (0 ~ n-1) 여기까지 잘라낸다.
			// 잘라내고 난 나머지 문자열을 최신화 시켜주는 구문
			str = str.substring(pos + 1);

		} // while문 끝
		
		// 마지막 단어처리
		if(str.length() > m) answer = str;
		return answer;
	}
	
	public static void main(String[] args) {
		_03_문장_속_단어2 T = new _03_문장_속_단어2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));	
	}
}
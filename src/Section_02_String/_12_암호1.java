package Section_02_String;

import java.util.Scanner;

public class _12_암호1 {

	public String solution(int n, String s) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0') ; // index 0~7까지 인덱스 추출
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
//			System.out.println(tmp + " " + num);
			s = s.substring(7); // index 7부터 끝까지 잘라내서 s에 담는다.
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_12_암호1 T = new _12_암호1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
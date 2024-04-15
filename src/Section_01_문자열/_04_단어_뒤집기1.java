package Section_01_문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_단어_뒤집기1 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_04_단어_뒤집기1 T = new _04_단어_뒤집기1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 3입력
		String[] str = new String[n];
		for(int i = 0; i < n; i ++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}	
	}
}
package Section_02_String;

import java.util.ArrayList; 
import java.util.Scanner;

public class _04_단어_뒤집기2 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			} // while문 끝.
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		_04_단어_뒤집기2 T = new _04_단어_뒤집기2();
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
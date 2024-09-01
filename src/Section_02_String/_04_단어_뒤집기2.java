package Section_02_String;

import java.util.ArrayList; 
import java.util.Scanner;

public class _04_�ܾ�_������2 {
	
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
			} // while�� ��.
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		_04_�ܾ�_������2 T = new _04_�ܾ�_������2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 3�Է�
		String[] str = new String[n];
		for(int i = 0; i < n; i ++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}	
	}
}
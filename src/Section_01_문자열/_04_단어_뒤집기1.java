package Section_01_���ڿ�;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_�ܾ�_������1 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_04_�ܾ�_������1 T = new _04_�ܾ�_������1();
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
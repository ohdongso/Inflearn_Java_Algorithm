package Section_01_���ڿ�;

import java.util.Scanner;

public class _01_����_ã��_1 {
	
	/*
	 1, next()�� ���ڿ��� �Է¹޴´�.
	 2, next().charAt(0)���� �������� �Է¹޴´�.
	 3, �빮�� �ҹ��� ������ �ʿ� ���� ������ ��� �빮�ڷ� ������ �� ���ؼ� ���� ����Ѵ�.
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
		_01_����_ã��_1 T = new _01_����_ã��_1();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}
}
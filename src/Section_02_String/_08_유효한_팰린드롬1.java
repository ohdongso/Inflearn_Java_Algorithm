package Section_02_String;

import java.util.Scanner;

public class _08_��ȿ��_�Ӹ����1 {
	
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
//		System.out.println(s);
		String tmp = new StringBuilder(s).reverse().toString();
		
		if(s.equals(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_08_��ȿ��_�Ӹ����1 T = new _08_��ȿ��_�Ӹ����1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));		
	}
}
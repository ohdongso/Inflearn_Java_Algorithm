package Section_02_String;

import java.util.Scanner;

public class _12_��ȣ1 {

	public String solution(int n, String s) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0') ; // index 0~7���� �ε��� ����
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
//			System.out.println(tmp + " " + num);
			s = s.substring(7); // index 7���� ������ �߶󳻼� s�� ��´�.
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_12_��ȣ1 T = new _12_��ȣ1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
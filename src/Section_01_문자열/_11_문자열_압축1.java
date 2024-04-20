package Section_01_���ڿ�;

import java.util.Scanner;

public class _11_���ڿ�_����1 {
	/*
	 	KKHSSSSSSSE ==> 11��, index(0~10)
		1, ���ڿ��� �Է¹޴´�.
		2, ���ڿ� ���� " "������� �ٿ��� ���������Ѵ�. ==> 12��, index(0~11)
		3, 
	*/
	public String solution(String s) {
		String answer = "";
		// �Է¹��� ���ڿ� �������� " "�������� �ʱ�ȭ���ش�.
		// ���������ڸ� ���Ҷ��� i+1�� �Ǹ� ������ �߻��ϱ� ������ " "�� �߰��� �ٿ��� ������ �����鼭 ������ش�.
		s = s + " "; 
		int cnt = 1;
		
		// 0~10 < 11(12-1)
		// 11���� ���ڿ��� �Է¹޾����� 
		// (index�� ==> -1), (������" "�������� ���ϱ� ==> -1)
		// 2���� ��Ȳ������ ������ "i < s.length()-1" �̷��� �ȴ�.
		for(int i = 0; i < s.length()-1; i++) { 
			// index i�� �ش��ϴ� ���ĺ��� i+1�� �ش��ϴ� ���ĺ��� ������ cnt++���ش�.
			if(s.charAt(i) == s.charAt(i+1)) {
				cnt++;
			} else {
				answer += s.charAt(i);
				if(cnt > 1) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_11_���ڿ�_����1 T = new _11_���ڿ�_����1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
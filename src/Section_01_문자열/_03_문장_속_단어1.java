package Section_01_���ڿ�;

import java.util.Scanner;

public class _03_����_��_�ܾ�1 {

	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE; // int���� ���� ���� ������ �ʱ�ȭ
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length(); // split�� ©�� ������ ���ڿ� ����
			if(len > m) { // ������ ��� ���� ���ʿ� ��ġ�Ѱ��� ����ϸ� �Ǳ� ������ ">" �������� �����ϴ�.
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_03_����_��_�ܾ�1 T = new _03_����_��_�ܾ�1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));	
	}
}
package Section_01_String;

import java.util.Scanner;

public class _03_����_��_�ܾ�2 {
	// it is time to study
	
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		// indexOf(' ')�� ����ϸ� ó�� �߰ߵǴ� ' '�κ��� index�� ��ȯ�Ѵ�. ==> 2
		// �߰����� ���Ѵٸ� -1�� ��ȯ�Ѵ�.
		while((pos = str.indexOf(' ')) != -1) {
			// substring(0, 5)�� �ϸ� index��ȣ�� 0~5�� ����Ű�� ������ 0~4�� �߶󳽴�, ������ �� -1�̶�� �����ϸ� �ȴ�. 
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) { // ���ٶ�� �ϸ� ���� ���� ���� ����ȴ�.
				m = len;
				answer = tmp;
			}
			

			// substring �μ����� �ϳ��� �� ��� index (0 ~ n-1) ������� �߶󳽴�.
			// �߶󳻰� �� ������ ���ڿ��� �ֽ�ȭ �����ִ� ����
			str = str.substring(pos + 1);

		} // while�� ��
		
		// ������ �ܾ�ó��
		if(str.length() > m) answer = str;
		return answer;
	}
	
	public static void main(String[] args) {
		_03_����_��_�ܾ�2 T = new _03_����_��_�ܾ�2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));	
	}
}
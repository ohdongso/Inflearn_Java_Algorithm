package Section_01_String;

import java.util.Scanner;

public class _06_�ߺ���������1 {
	
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
//			index�� �ش��ϴ� ���ĺ�, ���� ���ĺ��� �ش��ϴ� index, str���ڿ����� index�� �ش��ϴ� ���ĺ��� ó�� index��ġ
//			System.out.println(str.charAt(i) + " " +  i + " " + str.indexOf(str.charAt(i)));
		
            // ���� ���ĺ��� ��ġ�� ���� ���ĺ��� index�� �� ���ٸ� ����
			// �׷��� ������ �ߺ����ڱ� ������ �������� �ʴ´�.
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		} // for�� ��.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_�ߺ���������1 T = new _06_�ߺ���������1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));		
	}
}
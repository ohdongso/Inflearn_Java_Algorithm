package Section_01_String;

import java.util.Scanner;

public class _02_��ҹ���_��ȯ {
	// TestCase : StuDY 
	
	public String solution(String str) {
		String answer = "";
		
		// ��� 1
		// �빮�� 65~90, �ҹ��� 97~122 ==> �빮�� �ҹ��� "32"���̰� ����.
		// ���� �� char�� ����ȯ �����ָ�, ���ĺ��� �´� �ƽ�Ű�ڵ尡 �����ȴ�. (����ȯ �ʿ��ϴ�.)
		for(char x : str.toCharArray()) {
			if(x >= 97 && x <= 122) {
				answer += (char)(x - 32);
//				answer += (x - 32);
			} else {
				answer += (char)(x + 32);
//				answer += (x + 32);
			}
		}
		
		// ��� 2
		/*
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			} else {
				answer += Character.toLowerCase(x);
			}
		}
		*/
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_��ҹ���_��ȯ T = new _02_��ҹ���_��ȯ();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); // �����Է�
		System.out.print(T.solution(str));
		
	}
}
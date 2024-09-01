package Section_06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class _01_�ùٸ�_��ȣ1 {
	/*
	 	1, Ž���� ������ ������, ������ ��� �־�� ��ȣ�� �´� ���̴�.
	 	
	 */
	
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') { // ���� ��ȣ
				stack.push(x);
			} else { // �ݴ� ��ȣ
				if(stack.isEmpty()) { // �ݴ� ��ȣ ��, ������ ����ִٸ� ==> ������ȣ�� ���� ��.
					return "NO";
				}
				
				stack.pop(); // ���� ��ȣ �ϳ��� ������.
			}
		} // for�� ��.
		
		if(!stack.isEmpty()) { // ��üŽ���� ������ ��, ������ ��������ʴٸ� ==> ������ȣ�� ���� ��.
			return "NO";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_01_�ùٸ�_��ȣ1 T = new _01_�ùٸ�_��ȣ1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
package Section_06_Stack_Queue;

import java.util.Scanner; 
import java.util.Stack; 

public class _02_��ȣ��������1 {
	/*
	 	
	 */
	public String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') { // �ݴ� ��ȣ��
				while(stack.pop() != '(') {

				} // while�� ��
			} else { // (���ڿ�, ���� ��ȣ)�� push�ȴ�.
				stack.push(x);
			}		
		} // for�� ��.
		
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_��ȣ��������1 T = new _02_��ȣ��������1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
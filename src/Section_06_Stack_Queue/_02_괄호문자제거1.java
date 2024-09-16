package Section_06_Stack_Queue;

import java.util.Scanner; 
import java.util.Stack; 

public class _02_괄호문자제거1 {
	/*
	 	
	 */
	public String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') { // 닫는 괄호면
				while(stack.pop() != '(') {

				} // while문 끝
			} else { // (문자열, 여는 괄호)가 push된다.
				stack.push(x);
			}		
		} // for문 끝.
		
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_괄호문자제거1 T = new _02_괄호문자제거1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
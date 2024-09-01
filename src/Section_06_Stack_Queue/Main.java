package Section_06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	/*
	 	1, 탐색이 끝나는 시점에, 스택이 비어 있어야 괄호가 맞는 식이다.
	 	
	 */
	
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') { // 여는 괄호
				stack.push(x);
			} else { // 닫는 괄호
				if(stack.isEmpty()) { // 닫는 괄호 때, 스택이 비어있다면 ==> 우측괄호가 많은 것.
					return "NO";
				}
				
				stack.pop(); // 좌측 괄호 하나를 꺼낸다.
			}
		} // for문 끝.
		
		if(!stack.isEmpty()) { // 전체탐색이 끝났을 때, 스택이 비어있지않다면 ==> 좌측괄호가 많은 것.
			return "NO";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
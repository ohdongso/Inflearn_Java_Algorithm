package Section_06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class _05_쇠막대기1 {
	/*
	 	* 겹쳐있는 막대기를 레이저로 잘 랐을 때 잘려진 막대기의 총 개수를 구하는 문제다.
	 	1, 좌측 괄호면 Stack에 푸시
	 	2, 우측 괄호면, 레이저의 닫는 괄호인지, 막대기의 닫는 괄호인지 판단해야 한다.
	 	3, 레이저의 닫는 괄호이면, 스택에 있는 하나의 좌측괄호를 pop하고 스택에 남아있는 좌측괄호(막대기 괄호)를 잘라준다.
	 	4, 레이저의 괄호인지 판단하는 방법은 우측괄호가 나왔을 때 이전 괄호가 좌측괄호 인지 여부로 판별 할 수 있다.
	 	5, 우측 괄호가 나왔을 때, 이전 괄호가 좌측괄호가 아니면 막대기 괄호이기때문에 Stack에서 좌측괄호를 Pop시켜 준다.
	 	   그리고 막대기 자투리 하나가 나왔기 때문에 +1을 해준다.	
	 */
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			} else { // 닫는 괄호면
				stack.pop();
				if(str.charAt(i - 1) == '(') { // 레이저
					answer += stack.size();
				} else { // 막대기의 끝이면
					answer++;
				}
			}	
		} // for문 끝.	
		return answer;
	}
	
	public static void main(String[] args) {
		_05_쇠막대기1 T = new _05_쇠막대기1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
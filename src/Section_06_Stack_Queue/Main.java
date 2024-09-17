package Section_06_Stack_Queue;

import java.util.Scanner; 
import java.util.Stack; 

public class Main {
	/*
	 	
	 */
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) { // 숫자면
				stack.push(x - 48);
			} else { // 연산자를 만나면
				int rt = stack.pop();
				int lt = stack.pop();
				if(x == '+') stack.push(lt + rt);
				else if(x == '-') stack.push(lt - rt);
				else if(x == '*') stack.push(lt * rt);
				else if(x == '/') stack.push(lt / rt);
			}
		} // for문 끝.
		
		answer = stack.get(0);	
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
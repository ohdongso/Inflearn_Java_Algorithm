package Section_06_Stack_Queue;

import java.util.Scanner; 
import java.util.Stack; 

public class _04_������_����_postfix1 {
	/*
	 	
	 */
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) { // ���ڸ�
				stack.push(x - 48);
			} else { // �����ڸ� ������
				int rt = stack.pop();
				int lt = stack.pop();
				if(x == '+') stack.push(lt + rt);
				else if(x == '-') stack.push(lt - rt);
				else if(x == '*') stack.push(lt * rt);
				else if(x == '/') stack.push(lt / rt);
			}
		} // for�� ��.
		
		answer = stack.get(0);	
		return answer;
	}
	
	public static void main(String[] args) {
		_04_������_����_postfix1 T = new _04_������_����_postfix1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
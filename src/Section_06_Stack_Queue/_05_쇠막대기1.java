package Section_06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class _05_�踷���1 {
	/*
	 	* �����ִ� ����⸦ �������� �� ���� �� �߷��� ������� �� ������ ���ϴ� ������.
	 	1, ���� ��ȣ�� Stack�� Ǫ��
	 	2, ���� ��ȣ��, �������� �ݴ� ��ȣ����, ������� �ݴ� ��ȣ���� �Ǵ��ؾ� �Ѵ�.
	 	3, �������� �ݴ� ��ȣ�̸�, ���ÿ� �ִ� �ϳ��� ������ȣ�� pop�ϰ� ���ÿ� �����ִ� ������ȣ(����� ��ȣ)�� �߶��ش�.
	 	4, �������� ��ȣ���� �Ǵ��ϴ� ����� ������ȣ�� ������ �� ���� ��ȣ�� ������ȣ ���� ���η� �Ǻ� �� �� �ִ�.
	 	5, ���� ��ȣ�� ������ ��, ���� ��ȣ�� ������ȣ�� �ƴϸ� ����� ��ȣ�̱⶧���� Stack���� ������ȣ�� Pop���� �ش�.
	 	   �׸��� ����� ������ �ϳ��� ���Ա� ������ +1�� ���ش�.	
	 */
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			} else { // �ݴ� ��ȣ��
				stack.pop();
				if(str.charAt(i - 1) == '(') { // ������
					answer += stack.size();
				} else { // ������� ���̸�
					answer++;
				}
			}	
		} // for�� ��.	
		return answer;
	}
	
	public static void main(String[] args) {
		_05_�踷���1 T = new _05_�踷���1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
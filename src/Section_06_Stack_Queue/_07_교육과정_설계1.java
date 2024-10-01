package Section_06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; 

public class _07_��������_����1 {
	/*
		1, need:�ʼ�����, plan:������ �ۼ��� �����ȹ��
	 	2, 
	 */
	public String solution(String need, String plan) {
		String answer = "YES";
		
		Queue<Character> Q = new LinkedList<>();
		
		for(char x : need.toCharArray()) {
			Q.offer(x); // ť�� �ʼ����� ����
		}
		
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) { // ��ȹ���� ������ �ʼ����� ������
				if(x != Q.poll()) { // ��ȹ���� ������ �ʼ������� ó���� �ƴϸ�
					return "NO";
				}
			}		
		}
		
		if(!Q.isEmpty()) { // �ʼ����� �� �̼����� ���� ������ �ִٸ�
			return "NO";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_07_��������_����1 T = new _07_��������_����1();
		
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next(); // �ʼ�����
		String b = kb.next(); // ������ �ۼ��� �����ȹǥ
		
		System.out.println(T.solution(a, b));
	}
}
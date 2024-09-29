package Section_06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; 

public class _06_����_���ϱ�1 {
	/*
	 	1, ������ 2���� ������ ��, (4,7) > (7,4) > (4,7) > 
	 	3��° ���ڿ� �ش��ϴ� 4�� poll�ϰ� �Ѹ��� 7�� ���ڸ� ��ȯ�Ѵ�.
	 */
	public int solution(int n, int k) {
		int answer = 0;
		
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) { // 1~n���� ���ڹ�ȣ�� ť�� ����
			Q.offer(i);
		}
		
		while(!Q.isEmpty()) { // ť�� ��� ���� ������
			
			for(int i = 1; i < k; i++) { // ť���� �ڸ��� 3-1���� ���ڸ� �̵���Ű�� ����
				Q.offer(Q.poll()); // ���� �տ� ���ڸ� ������, ���� �ڿ� ����
			}
			
			Q.poll(); // ť���� �ڸ��� 3�� ���ڸ� ���ܽ�Ų��.
			
			if(Q.size() == 1) { // ť�� ���ڰ� �Ѹ� ������, ������ answer�� ��� ��ȯ
				answer = Q.poll();
			}
			
		} // while�� ��.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_����_���ϱ�1 T = new _06_����_���ϱ�1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ������ ��
		int k = kb.nextInt(); // ���� �� ��ȣ
		
		System.out.println(T.solution(n, k));
	}
}
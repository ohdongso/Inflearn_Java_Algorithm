package Section_06_Stack_Queue;

import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner; 

class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) { // ������
		this.id = id;
		this.priority = priority;
	}
} // Person Ŭ���� ��.

public class _08_���޽�1 {
	/*
		
	 */
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Queue<Person> Q = new LinkedList<>();
		
		// ť�� ȯ��index�� ���赵�� �����Ѵ�.
		for(int i = 0; i < n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) { // ť�� ������� ������쿡 while�� �ݺ�
			Person tmp = Q.poll(); // ���� ���� ȯ�ڸ� ������.
			
			for(Person x : Q) { // ���� ���� ȯ�ڸ� ������ ������ ȯ�ڸ� �ϳ��� ������.
				if(x.priority > tmp.priority) { // ���� ȯ�ں��� xȯ���� ���赵�� �� ���ٸ�
					Q.offer(tmp); // ���� �տ��� ���� ȯ�ڸ� ���� �ڷ� �ִ´�.
					tmp = null; // tmp�ʱ�ȭ
					break; // for�� ����
				}
			}
			
			// tmp�� null�� �ƴ϶�� ���� ���� ȯ�ڰ� ���赵�� ���� ���⶧���� 
			// "���Ḧ �޴´ٴ� �ǹ̴�"
			if(tmp != null) {
				answer++;
				if(tmp.id == m) { // tmp�� id(������)�� m�̸� ���� �������(answer)�θ� ��ȯ�Ѵ�.
					return answer;
				}
			}
		} // while�� ��.

		return answer;
	}

	public static void main(String[] args) {
		_08_���޽�1 T = new _08_���޽�1();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // n�� ȯ���� "�Ѹ��"�� �ǹ�
		int m = kb.nextInt(); // m�� n�� ���° "���ȯ��"�� �ǹ�
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt(); // ȯ���� ���赵�� �Է� ���� �迭
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}
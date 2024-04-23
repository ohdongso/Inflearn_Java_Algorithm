package Section_02_Array;

import java.util.Scanner;

public class _02_���̴�_�л�1 {
	/*
		1, max������ index 0�� �ش��ϴ� ���� �ʱ�ȭ �����ش�.
		2, index 1���� ~ N-1���� ���ʷ� ���ϸ鼭 �ռ� ������ ū ������ ������ ���� �������� ���� �ֱ⶧����
		   +1 ���ָ鼭 for���� �ѹ��� ����.
		3, ���� �߿��Ѱ� �ռ� �񱳵� ���麸�� index�� �ش��ϴ� �� ���� ũ�� +1 ���ִ� �˰����̴�.
	*/
	public int solution(int n, int[] arr) {
		// ù ��° ����� ������ ���̱� ������ 1�� �ʱ�ȭ �Ѵ�.
		// ù ����� ���� max�� �־��ش�.
		int answer = 1, max = arr[0];
		
		// index 0�� max������ �ʱⰪ���� �ִ´�.
		// index 1���� ���ϴµ� max���� i index�� �ش��ϴ� ���� ũ�ٸ�
		// �������� ���� �ֱ� ������ answer�� +1���ش�.
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_���̴�_�л�1 T = new _02_���̴�_�л�1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ��� ���ڸ� �Է¹����� �����ϴ� ����
		int[] arr = new int[n]; // ������ ������ �°� �迭����
		
		
		// ex) ==> (7 3 9 5 6 12)�� �ش��ϴ� ���� �ѹ��� �Է¹����� �ִ�.
		// nextInt�� ������ �������� �ʱ⶧���� ���� �Է¹޴´�.
		for(int i = 0; i < n; i++) { 
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, arr));
	}
}
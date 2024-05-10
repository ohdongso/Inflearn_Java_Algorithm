package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _03_�ִ�_����1 {
	/*
	 	1, N�� ������ �������� K�� ������ �ִ� ������� ������ ���ϴ� �˰���
	 	2, "N" == �־��� �ϼ�, "K" == ���ӵ� �ϼ�
	 	3, Sliding_window�� ����ؼ� �ذ��ϸ� ȿ�����̴�.
	 */
	
	public int solution(int n, int k, int[] arr) {
		/*
		 	1, K ũ�⿡ �ش��ϴ� �����츦 >>> �������� ��ĭ�� �ű�鼭 �����ش�.
		 	2, +arr[i]��, -arr[i-k]�� ���� ������ 2���� ������ ù���� ���� ������ ���� �����ִ� ������ �ݺ��Ѵ�.
		 	3, �ݺ��� ������ K�� �ش��ϴ� �ִ������� answer ��ȯ�ϰ�, ������ش�.
		 */
		int answer = 0, sum = 0;
		
		// ó�� �����츦 �����ش�.
		for(int i = 0; i < k; i++) {
			sum += arr[i];
		}
		answer = sum;
		
		for(int i = k; i < n; i++) { // ������ ó�� ������ ũ���� ������(4��° ������)�� index(3)���� i�� �ʱ�ȭ �����ش�.
			sum += (arr[i] - arr[i-k]); // sum������ i���� ���ϰ�, i-k���� ���ش�.
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_03_�ִ�_����1 T = new _03_�ִ�_����1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, k, arr));
	}
}
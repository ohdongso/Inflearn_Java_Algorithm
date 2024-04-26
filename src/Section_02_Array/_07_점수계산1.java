package Section_02_Array;

import java.util.Scanner;

public class _07_�������1 {
	/*
		1, n���� �ش��ϴ� ���� �迭�� �Է¹޴´�.
		2, 1�̸� cnt�� 1�� �����ϰ� sum�� �����Ѵ�.
		3, 1�� �������� ������ cnt�� 1���� ��� �����ְ�, sum�� �����Ѵ�.
	*/
	public int solution(int n, int[] arr) {
		int answer = 0, cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		_07_�������1 T = new _07_�������1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		// n���� �´� ���ڸ� ������ �������� �ѹ��� �迭�� �Է¹����� �ִ�.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}
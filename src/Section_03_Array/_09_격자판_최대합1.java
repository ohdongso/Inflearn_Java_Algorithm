package Section_03_Array;

import java.util.Scanner;

public class _09_������_�ִ���1 {
	/*
		1, 5*5 2�����迭����
		2, ��,��,X�밢�� ���� ���� ū ���� ����ϸ� �ȴ�.
	*/
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2; // sum1�� �� ���� ��, sum2�� �� ���� ��
		
		for(int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for(int j = 0; j < n; j++) {
				sum1 += arr[i][j]; // i���� �� j���� ��
				sum2 += arr[j][i]; // i���� �� j���� �� 
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = sum2 = 0;		
		for(int i = 0; i < n; i++) {
			sum1 += arr[i][i]; // ��� ���� ������� ==> (��)
			sum2 += arr[i][n-i-1]; // ���� 1�� �����ϰ� ���� 1�� �����ؾ� �Ѵ�. ==> (��)
		}
		
		// answer���� �̹� ��� ���� ���� ���� ū���� answer�� ���� �� �ִ�.
		// �� �밢�� X�� ���������� ���ϰ� ����ϸ� �ȴ�.
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		_09_������_�ִ���1 T = new _09_������_�ִ���1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		// 2�� for������ 2���� �迭�� ���ڸ� �ѹ��� ���� �� �� �ִ�.(�������ϴ�.)
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}
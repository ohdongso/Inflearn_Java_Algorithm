package Section_02_Array;

import java.util.Scanner;

public class _08_������ϱ�1 {
	/*
		1,���� ���� �迭�� �Է¹޴´�.
		2,index i�� �ش��ϴ� �л��� ����� ���ؼ� ���� �迭�� ����ָ� �ȴ�.
		3,index i���� ���ؼ� �ڱ⺸�� ū ���� ������ cnt�� +1�ؼ� ����� �����ش�.
		4,������ ������ ������� �ڱ⺸�� ū �� ���ڰ� ���⶧���� ������ ����� �ο��ǰ�
		  �ٸ� ���ڰ� ������ ���ڸ� ��������� ���� �ڱ⺸�� ���� ũ�� ������ cnt�� ������ ���ڸ�ŭ �ݺ��Ǽ�
		  �ڵ����� ������ �Ű�����. 
	*/
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) { // ����� ������ ������ �Ǵ� �л�
			int cnt = 1; // cnt�� j �ݺ����� ������ 1�� �ʱ�ȭ �Ǿ�� �Ѵ�.
			for(int j = 0; j < n; j++) { // ������ �Ǹ� �л��� �񱳵� �л�
				if(arr[j] > arr[i]) { // �����л����� �񱳵� �л� ������ �� ������
					cnt++; // �����л� ����� +1���ش�.
				}
			}
			answer[i] = cnt; // ���������� �����л� ����� �迭�� �������ش�.
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_08_������ϱ�1 T = new _08_������ϱ�1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		// n���� �´� ���ڸ� ������ �������� �ѹ��� �迭�� �Է¹����� �ִ�.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
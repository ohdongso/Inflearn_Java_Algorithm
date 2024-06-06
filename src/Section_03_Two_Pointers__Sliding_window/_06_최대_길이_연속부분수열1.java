package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _06_�ִ�_����_���Ӻκм���1 {
	/*
	 	1, ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ���
	 	2, "N" == 2�� �̻� ������ ������ ������ ����
	 	3, �������͸� ����ؼ� �ذ��ϸ� ȿ�����̴�.
	 */
	
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n / 2 + 1; // N���� ���ӵ� ���ڷ� ����� �ִ�, ���ӵ� ���� �ִ밪�� �ǹ��Ѵ�.
		int[] arr = new int[m]; // ex) 15�� �Է¹����� 8�� ���ӵ� ������ �ִ밪�̰� �迭�� ũ�Ⱑ �ȴ�.
		
		for(int i = 0; i < m; i++) { // �迭�� �� ����(1~8)
			arr[i] = i + 1;
		}
		
		for(int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum == n) {
				answer++;
			}
			while(sum >= n) { // sum�� n �̻��ΰ�� lt�� ��� >>> �̵����Ѽ�, sum�� n���� �۾����� ���ش�.
				sum -= arr[lt++];
				if(sum == n) {
					answer++;
				}
			} // while�� ��.
		} // for�� ��.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_�ִ�_����_���Ӻκм���1 T = new _06_�ִ�_����_���Ӻκм���1();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		System.out.print(T.solution(n));
	}
}
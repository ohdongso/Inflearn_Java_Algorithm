package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _06_�ִ�_����_���Ӻκм���1 {
	/*
	 	1, 0�� 1�� ������ ���̰� N�� ������ �־����ϴ�. �� �������� �ִ� k���� 0�� 1�� ���� �ؼ�
	 	   �� �������� 1�θ� ������ �ִ� ������ ���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.
	 	2, �������� �˰����� ����ϸ� �ȴ�.
	 */
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) {
				cnt++;
			}
			
			// cnt�� 0�� 1�� ����� Ƚ���� �ǹ��ϴ� ������.
			// lt�� 0�� ���ö� ���� ��� �����ϰ�, 0�� ������ cnt�� -1���ش�.
			while(cnt > k) {
				if(arr[lt] == 0) {
					cnt--;
				}
				lt++;
			} // while�� ��.
			
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_�ִ�_����_���Ӻκм���1 T = new _06_�ִ�_����_���Ӻκм���1();
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
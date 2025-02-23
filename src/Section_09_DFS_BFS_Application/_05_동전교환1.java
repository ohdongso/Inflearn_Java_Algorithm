package Section_09_DFS_BFS_Application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _05_������ȯ1 {
	
	/*
		���� : ���� ������ �������� �־��� ������ �Ž������� ���� ���� ���� �������� ��ȯ���ַ��� ��� �ָ� �Ǵ°�?
		�� ������ ������ ������ �� �� �ִ�.
	 */
	static int n, m, answer = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer[] arr) {
		if(sum > m) {
			return;
		}
		
		if(L >= answer) {
			return;
		}
		
		if(sum == m) { // �հ谡 �Ž����� �ݾ��� ���� ��
			answer = Math.min(answer, L); // L�� �����̱⵵ ������, sum�� ������ ������ ������.
		} else {		
			for(int i = 0; i < n; i++) { // ������ ������ �� ����ϴ� ��
				DFS(L+1, sum+arr[i], arr);
			}	
		}	
	}
	
	public static void main(String[] args) {
		_05_������ȯ1 T = new _05_������ȯ1();
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		
		Integer[] arr= new Integer[n]; // �迭�� ������ ������ ��´�.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		m = kb.nextInt(); // �Ž����� �ݾ�
		T.DFS(0, 0, arr);
		System.out.println(answer); // answer�� ������ �ּ� ������ �����Ѵ�.
	}
}

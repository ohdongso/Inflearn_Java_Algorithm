package Section_04_HashMap_TreeSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class _05_K��°_ū_��1 {
	/*
	 	1, i, j, l�� (< n)�ص� ���������� ����ȴ�.
	 */
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		
		// Collections.reverseOrder() ������, �ڵ����� �������� ���ĵȴ�.
		TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder()); // �������� ����
		
		// �־��� �ڿ����� �迭�� ���� �� �ְ�, ���� 3������ ������ �ִ�
		// ��� ī���� ����� ���� ���� ���� TreeSet�� ����ȴ�.
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0; // ���°
		for(int x : Tset) {
			cnt++;
			if(cnt == k) {
				return x;
			}
		} 
		 
		return answer;
	}
	
	public static void main(String[] args) {
		_05_K��°_ū_��1 T = new _05_K��°_ū_��1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // �迭�� ����� �ڿ��� ����
		int k = kb.nextInt(); // �� ������ ū ���� ������� �����ϴ� ����
		int[] arr = new int[n]; // �迭 ũ�� ����
		for(int i = 0; i < n; i++) { // �迭�� �ڿ��� ����
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
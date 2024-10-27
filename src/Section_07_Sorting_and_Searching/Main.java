package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 
	 */
	public int count(int[] arr, int dist) {
		
		int cnt = 1; // �� ���� �� = 1���� ��ġ
		int ep = arr[0]; // �ٷ� ���� ���� ��ġ�� �������� ��ǥ
		
		for(int i = 1; i < arr.length; i++) {
			// CD������ �뷮�� �Ѿ��
			if(arr[i] - ep >= dist) {
				cnt++; // �� �Ѹ��� ����
				ep = arr[i];
			} 
		} // for�� ��.
		
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr); // �������� ����
		int lt = 1;
		int rt = arr[n - 1];
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // ���� �������� �Ÿ�
			if(count(arr, mid) >= c) { // mid�� �ش��ϴ� �Ÿ��� ���� �� ��ġ�Ҽ� �ִ�. mid�� ����������.
				answer = mid;
				lt = mid + 1;
			} else { // ���̰Ÿ��� �ʹ� �־ ���� �� ��ġ �� �� ����. mid�� �������ѳ�����.
				rt = mid - 1;
			}
		} // while�� ��
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ������ ��ǥ ����
		int c = kb.nextInt(); // �� ���� ��
		
		int[] arr = new int[n]; // ������ ��ǥ ���� �� �迭
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for�� ��.
		
		System.out.println(T.solution(n, c, arr));
	}
}
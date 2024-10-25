package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _08_�̺а˻�1 {
	/*
	 	1, mid�� ���ĵ� �迭���� ������ �Ǵ� ������, lt�� rt�� �߾Ӱ��� �������� ������ ���� �Ǳ� ������
	 	lt�� 0���� mid�� ������ ������, rt�� n-1������ mid�� ���� �� ������ ���� �Ǳ⶧����
	 	mid�� ���ĵ� �迭���� �� ��° �������� �� �� �ִ�.
	 */
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr); // �������� ����
		int lt = 0, rt = n-1;
		
		while(lt <= rt) {
			int mid = (lt+rt) / 2; // �Ҽ����� ����ó�� �ȴ�.
			
			if(arr[mid] == m) {
				answer = mid + 1;
				break;
			}
			
			if(arr[mid] > m) { // ã���� �ϴ� ���� �� �۱⶧���� ū ���� ������ �Ѵ�.
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
			
		} // while�� ��.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_08_�̺а˻�1 T = new _08_�̺а˻�1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // �Է¹��� ���� ����
		int m = kb.nextInt(); // ã�� ����
		
		int[] arr = new int[n]; // �Է¹��� ���� �迭
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for�� ��.
		
		System.out.println(T.solution(n, m, arr));
	}
}
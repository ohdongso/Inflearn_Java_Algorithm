package Section_07_Sorting_and_Searching;

import java.util.Scanner; 

public class Main {
	/*
	 	1, ���ڷ� �̷���� �迭�� �޴´�.
	 	2, i�� 0~n-1���� ���Ѵ�.
	 	3, j�� i+1���� n���� ���Ѵ�.
	 	4, i�� �ش��ϴ� ������ �� ���� ���� �ִٸ�, i�� j�� �ش��ϴ� ���� �־��ְ� ��� �ݺ��Ѵ�.
	 	5, ��������� index i�� ���������� ���� ������ ���� ���� ���� �Ǵ� �˰����̴�.
	 */
	public int[] solution(int n, int[] arr) {
		for(int i = 0; i < n-1; i++) { // �񱳱����� �Ǵ� index�� n���� �� �ʿ䰡 ����.
			int idx = i; // �񱳱����� �Ǵ� index���� �ִ´�.
			
			for(int j = i+1; j < n; j++) { // �񱳰��� i���� 1ū ������ �����ϰ�, n���� ���Ѵ�.
				if(arr[j] < arr[idx]) { // �񱳱����� �Ǵ� ������ �񱳰��� �� �۴ٸ� idx�� �񱳰� index�� �ִ´�.
					idx = j; // �񱳱��ذ��� ����� ������, �񱳱��غ��� �� ���� �񱳰� index�� ����
				}
			}
			
			int tmp = arr[i]; // tmp������ �񱳱��ذ� ����
			arr[i] = arr[idx]; // �񱳱��ذ��� �񱳰� ����
			arr[idx] = tmp; // �񱳰��� �񱳱��ذ� ����
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // �Է¹��� ������ ����
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) { // �迭�� ���� ����
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) { // �������ĵ� �迭 �ϳ��� ���
			System.out.print(x + " ");
		}
	}
}
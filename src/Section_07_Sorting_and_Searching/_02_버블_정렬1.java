package Section_07_Sorting_and_Searching;

import java.util.Scanner; 

public class _02_����_����1 {
	/*

	 */
	public int[] solution(int n, int[] arr) {
		// ���� 5���� ������ 4��° ���ڱ��� ����.(i�� j�ݺ����� ���� �����Ѵ�.)
		// 0,1,2,3
		for(int i = 0; i < n-1; i++) {
			
			/*
			 	���� 5���� ������ 4��° ���ڱ��� ����.
			 	(0,1),(1,2),(2,3),(3,4) ==> ������ index3��, index4�� �� ==> i=0
			 	(0,1),(1,2),(2,3) ==> ������ index2��, index3�� �� ==> i=1
			 	(0,1),(1,2) ==> ������ index1��, index2�� �� ==> i=2
			 	(0,1), ==> ������ index0��, index1�� �� ==> i=3
				i�� 3�̵Ǹ�, j�� 0���� �ѹ��� �ݺ����� ����ȴ�.
			 	==> (����index, ����index)
			 */		
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		} // �ٱ� for�� ��.
		return arr;
	}
	
	public static void main(String[] args) {
		_02_����_����1 T = new _02_����_����1();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // �Է¹��� ������ ����
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) { // �迭�� ���� ����
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) { // �������ĵ� �迭�� �ϳ��� ���
			System.out.print(x + " ");
		}
	}
}
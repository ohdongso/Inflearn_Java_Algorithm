package Section_07_Sorting_and_Searching;

import java.util.Scanner;

public class _04_Least_Recently_Used1 {
	/*
	  	1, ĳ�û�����, �۾����� 2���� �Է¹޴´�.
	  	2, �۾��迭���� �۾���ȣ�� �ϳ��� ������ ĳ�ù迭�� �ִ��� ���Ѵ�.
	  	3, �ִٸ�, hit�� pos�� �۾���ȣ index�� �����Ѵ�.
	 	4, pos�� -1�̸� miss�� ĳ�ù迭�� ���������� 2��°���� �ݺ��ϸ� >������ĭ�� ����ش�.
	 	5, pos�� -1�� �ƴϸ� hit�� pos���� 2��°���� �ݺ��ϸ� >������ĭ�� ����ش�.
	  	6, ���������� (hit, miss)�� ���õ� �۾���ȣ�� 1��°�� ������ �ش�.
	  	7, �� �˰����� hit�� �߻��ϸ� i�� pos���ͽ���, miss�� �߻��ϸ� size-1���� �����ѵ�
	  	   �� ĭ�� ����ִ°� �ľ��ϴ°� �߿��ϴ�.!
	 */
	
	
	// s=size, n=�۾��� ����, arr=�۾��� ó���ϴ� ����
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int [size];
		
		// �۾���ȣ �ϳ��� ���
		for(int x : arr) {
			int pos = -1;
			
			for(int i = 0; i < size; i++) {
				if(x == cache[i]) { // hit(�۾���ȣ��, ĳ�ù迭�� �ִٸ�)
					pos = i;
				}
			} // ���� for�� ��
			
			if(pos == -1) { // miss(�۾���ȣ��, ĳ�ù迭�� ���ٸ�)
				for(int i = size-1; i >= 1; i--) { // ĳ�ù迭 ���������� 2��° �ڸ����� �ݺ��Ѵ�
					cache[i] = cache[i-1]; // �� ĭ�� ����ָ鼭 �����Ѵ�.
				}
				cache[0] = x; // 1��° �ڸ����� miss(�۾���ȣ��, ĳ�ù迭�� ���ٸ�)�� �߻��� �۾���ȣ�� �������ش�.
			} else { // hit(�۾���ȣ��, ĳ�ù迭�� �ִٸ�)
				for(int i = pos; i >= 1; i--) { // ĳ�ù迭���� hit�� �߻��� �ε������� 2��° �ڸ����� �ݺ��Ѵ�.
					cache[i] = cache[i-1]; // �� ĭ�� ����ָ鼭 �����Ѵ�.
				}
				cache[0] = x; // 1��° �ڸ����� hit�� �߻��� �۾���ȣ�� �����Ѵ�.
			}
			
			
		} // �ٱ� for�� ��
		
		return cache;
	}
	
	public static void main(String[] args) {
		_04_Least_Recently_Used1 T = new _04_Least_Recently_Used1();
		Scanner kb = new Scanner(System.in);
		
		int s = kb.nextInt(); // ĳ�� ������
		int n = kb.nextInt(); // �۾�����
		int[] arr= new int[n]; // �۾� ��� �迭 ����
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt(); // �����ȣ ����
		}
		
		for(int x : T.solution(s, n, arr)) {
			System.out.print(x + " ");
		}
	}
}
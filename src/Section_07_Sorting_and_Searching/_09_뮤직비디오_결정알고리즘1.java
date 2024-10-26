package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _09_��������_�����˰���1 {
	/*
	 	1, n(��ü�뷡����), m(��밡���� CD ����), arr(�Է¹��� �뷡 �迭) 3������ �Է¹޴´�.
	 	2, lt�� �뷡�迭�� �ִ밪�� rt�� �뷡�迭�� ������ �������� �ʱ�ȭ �Ѵ�.
	 	3, (lt <= rt) ���������� while���� �ݺ� ��Ű��, mid(�߾Ӱ�) == (lt+rt)/2�� �����ش�.
	 	4, count()�Լ��� �̿���, capacity�� �������� ��� CD������ ���Ѵ�.
	 	5, ��밳�� cnt�� ����Ҽ� �ִ� cd ���� m�����̸� ���� �� �� �ְ�, mid�� �ٿ������鼭 ������ ���� ã�´�. 
	 	   �׸��� answer�� CD�뷮�� �����Ѵ�.
	 	6, ��밳�� cnt�� ����Ҽ� �ִ� cd ���� m�ʰ� �̸� ���� �� �� ����, mid�� �������ָ鼭 �����ȿ� ���� ã�´�.
	 	7, (lt <= rt)�� �������� ���� �� ���� while���� �ݺ��Ǳ� ������ ������ ���� ã�� �� �ִ�.!
	 */
	public int count(int[] arr, int capacity) {
		// ù ��° CD, ���� ���ǰ� �ִ� CD�� �뷮�� Ȯ���ϴ� ����
		int cnt = 1, sum = 0;
		
		for(int x : arr) {
			// CD������ �뷮�� �Ѿ��
			if(sum + x > capacity) {
				cnt++; // cd�߰�
				sum = x; // ���ο� CD�� �뷡 �뷮�� �ʱ�ȭ �����ش�.
			} else {
				sum += x;
			}
		} // for�� ��.
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		// �Է¹��� ������ �ִ밪�� lt�� �ʱⰪ�� �ȴ�.
		// CD ���忡 �ּ��� 1���� ���� �ִ� ����� ���� �ǹ�
		int lt = Arrays.stream(arr).max().getAsInt();
		
		// �Է¹��� ���ڵ��� ���� rt�� �ʱⰪ�� �ȴ�.
		// CD ���忡 ��� ���� ���� �ִ� ����� ���� �ǹ�
		int rt = Arrays.stream(arr).sum();
		
		// �̺а˻�
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // CD ������ �뷮
			
			// ��밡���� CD ���� m���� ���� cd ������ �� ������, rt�� ���ҽ�Ų��.
			// �������� �����°� ������ ���� ã������ ������ �ٿ������� ��
			if(count(arr, mid) <= m) { // �뷮 ���� ���� ������ ���� ã�´�.
				answer = mid;
				rt = mid - 1;
			
			// m���� ���� cd ������ �� ������, lt�� ������Ų��.
			// �������� �����°� ���� �ɼ��� ��� �ٸ� ���� ã�� ��
			} else { // �뷮�� ���� ���� ������ �ش��Ű�� ���� ã�´�.
				// �̰��� answer�� ���� �ϸ� �ȵǴ� ������ ������ ���� ��ü�� �ȵȴ�.
				// answer = mid; 
				lt = mid + 1;
			}		
		} // while�� ��.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_09_��������_�����˰���1 T = new _09_��������_�����˰���1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ��ü �뷡 ����
		int m = kb.nextInt(); // ��밡���� CD ����
		
		int[] arr = new int[n]; // �Է¹��� �뷡 �迭
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for�� ��.
		
		System.out.println(T.solution(n, m, arr));
	}
}
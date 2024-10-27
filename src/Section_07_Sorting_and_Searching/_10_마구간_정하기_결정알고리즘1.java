package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _10_������_���ϱ�_�����˰���1 {
	/*
		* ���� ����� �� ���� �Ÿ��� �ִ밡 �ǰ� ���� �������� ��ġ�ϰ� �ͽ��ϴ�.
		�̸��� ���� �������� �Ÿ��� �ִ�� �ϸ鼭, C������ ���� �������� �� ��ġ�ϰ� �ʹٴ� ���̴�.
		
		�߿��� ����Ʈ�� �̺а˻��ؼ� ��ȿ�� ���� ã�Ҵٸ�, lt�� mid+1 ������ �����ؼ� �ٽ� mid���� �����༭ ������ �ظ� ã�´�.
		�׸��� (lt,rt)�� mid(�������� �Ÿ�)�� ã������ �����̰�, ep�� arr[i]�� ������ ������ �Ÿ��� mid�� ��ȿ���� ���ϱ����� ������
	 */
	public int count(int[] arr, int dist) { // dist�� mid�� �ǹ��ϰ�, mid�� ������������ �Ÿ��� �ǹ��Ѵ�.
		int cnt = 1; // ��ġ�� �� ���� �� = 1���� ��ġ
		int ep = arr[0]; // �ٷ� ���� ���� ��ġ�� �������� ��ǥ, ù ��° ������ ��ǥ ����
		
		for(int i = 1; i < arr.length; i++) {
			// �ι�° ������ ��ǥ���� ù��° ������ ��ǥ�� ������, ���� �����̰Ÿ� mid�̻��̸� ���� ��ġ �� �� �����Ƿ�
			if(arr[i] - ep >= dist) {
				cnt++; // ���� ��ġ�ϸ� �Ѹ��� ����
				ep = arr[i]; // ���� ��ġ�� ������ ��ǥ�� ep�� ����
			} 
		} // for�� ��.
		
		return cnt; // for���� ������, ��ġ�� ���� ������ ��ȯ
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr); // ������ ��ǥ �������� ����
		int lt = 1; // ù ��° ������ ��ǥ
		int rt = arr[n - 1]; // ������ ������ ��ǥ
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // ���� �������� �Ÿ�
			
			// mid�� �ش��ϴ� �Ÿ��� ���� �� ��ġ�Ҽ� �ִ�. mid�� ����������.
			// count�Լ����� ��ȯ�� ��ġ�� ���� �������� c(��ġ�Ǿ�� �� ��ü ��������) �̻��̸� ��ȿ�� ���̴�.
			if(count(arr, mid) >= c) {
				answer = mid; // answer������ mid(�������� �Ÿ�)�� �����Ѵ�.
				lt = mid + 1; // �׸��� �ִ� �Ÿ��� ������� �ϱ⶧���� lt�� ������Ų��.
			} else { // ���̰Ÿ��� �ʹ� �־ ���� �� ��ġ �� �� ����. mid�� �������ѳ�����.
				rt = mid - 1;
			}
		} // while�� ��
		
		return answer;
	}
	
	public static void main(String[] args) {
		_10_������_���ϱ�_�����˰���1 T = new _10_������_���ϱ�_�����˰���1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ��ü ������ ����
		int c = kb.nextInt(); // ��ü �� ���� ��
		
		int[] arr = new int[n]; // ������ ��ǥ�� ���� �� �迭
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for�� ��.
		
		System.out.println(T.solution(n, c, arr));
	}
}
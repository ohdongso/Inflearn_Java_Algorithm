package Section_03_Two_Pointers__Sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
 	1, A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 	2, "A" == ����1, "N" == ����1�� ũ��, "B" == ����2, "M" == ����2�� ũ��
  	3, �� �����͸� ����ؼ� �ذ��ϸ� ȿ�����̴�.(�������� ���� �� �־�� �Ѵ�.)	  	
 */

public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
	/*
	 	1, �ΰ��� �迭�� �������� �������ش�.
	 	2, 2���� ������  �������� ����Ű�� ������ while���� �ݺ���Ų��.
	 	3, �ΰ��� ���� ���� ������ ������ ����Ʈ�� �߰����ش�. �׸��� p1, p2 �����͸� ���� +1 �Ѵ�.
	 	4, b���� ���� ũ��, �������� a������ p1 �����͸� +1 ���ش�.
	 	5, a���� ���� ũ��, �������� b������ p2 �����͸� +1 ���ش�.
	 	6, �ݺ��� ������ answer ��ȯ�ϰ�, ������ش�.
	 */
	
	ArrayList<Integer> answer = new ArrayList<Integer>();
	Arrays.sort(a);
	Arrays.sort(b);
	int p1 = 0, p2 = 0; // p1�� ����A�� ������, p2�� ����B�� ������
	
	while(p1 < n && p2 < m) { // p1�� n���� �۰�, p2�� m���� ������ ==> �� ������ �����Ͱ� �� ��������
		if(a[p1] == b[p2]) { // ������ ��
			answer.add(a[p1++]); // ������ ������ ArrayList�� a[p1]�� ���
			p2++; // p1, p2 2���� �����͸� ���� +1 ���ش�.
		} else if(a[p1] < b[p2]) { // ���� �ʰ�, b[p2]�� ���� ũ��
			p1++; // p1�� �����͸� +1 ���ش�.
		} else { // ���� �ʰ�, a[p1]�� ���� ũ��
			p2++; // p2�� �����͸� +1 ���ش�.
		}
	}
	
	return answer;
}

public static void main(String[] args) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	
	// ���� A
	int n = kb.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++) {
		a[i] = kb.nextInt();
	}
	
	// ���� B
	int m = kb.nextInt();
	int[] b = new int[m];
	for(int i = 0; i < m; i++) {
		b[i] = kb.nextInt();
	}
	
	for(int x : T.solution(n, m, a, b)) {
		System.out.print(x + " ");
	}
}
}
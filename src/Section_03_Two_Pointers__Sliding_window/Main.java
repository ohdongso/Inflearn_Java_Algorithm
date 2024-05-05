package Section_03_Two_Pointers__Sliding_window;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		// �ΰ��� �����ʹ� ù ��° ���� ����Ű�� �־�� �Ѵ�.
		int p1 = 0, p2 = 0;
		
		// p1�̳� p2 ���� �ϳ��� ���������� ���� while���� �����.
		while(p1 < n && p2 < m) {
			if(a[p1] < b[p2]) {
				answer.add(a[p1++]);
			} else {
				 answer.add(b[p2++]);
			}
		} // while�� ��.
		
		while(p1 < n) {
			answer.add(a[p1++]);
		} // while�� ��.
		
		while(p2 < m) {
			answer.add(b[p2++]);
		} // while�� ��.
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		// 1��° �迭
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		
		// 2��° �迭
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
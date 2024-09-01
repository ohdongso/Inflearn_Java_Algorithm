package Section_03_Array;

import java.util.Scanner;

public class _03_����_����_��1 {

	public String solution(int n, int[] a, int[] b) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) { // ���� ���
				answer += "D";
			} else if(a[i] == 1 && b[i] == 3) { // ���� VS �� ==> A�� �̱�� ���
				answer += "A";
			} else if(a[i] == 2 && b[i] == 1) { // ���� VS ���� ==> A�� �̱�� ���
				answer += "A";
			} else if(a[i] == 3 && b[i] == 2) { // �� VS ���� ==> A�� �̱�� ���
				answer += "A";
			} else { // �� �ܿ� ������ ���� B�� �̱��.
				answer += "B";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_03_����_����_��1 T = new _03_����_����_��1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ���� Ƚ�� n
		int[] a = new int[n];
		int[] b = new int[n];
		
		// (a, b)�� �ش��ϴ� ���������� ������ �����Ѵ�.
		for(int i = 0; i < n; i++) { 
			a[i] = kb.nextInt();
		}
		
		for(int i = 0; i < n; i++) { 
			b[i] = kb.nextInt();
		}
		
		for(char x : T.solution(n, a, b).toCharArray()) {
			System.out.println(x);
		}
	}
}
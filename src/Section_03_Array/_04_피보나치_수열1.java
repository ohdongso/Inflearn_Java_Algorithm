package Section_03_Array;

import java.util.Scanner;

public class _04_�Ǻ���ġ_����1 {

	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < n; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_04_�Ǻ���ġ_����1 T = new _04_�Ǻ���ġ_����1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // �Է¹��� ���ڰ����� ���Ѵ�.

		for(int x : T.solution(n)) {
			System.out.print(x + " ");
		}
	}
}
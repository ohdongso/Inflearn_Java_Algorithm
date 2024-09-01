package Section_03_Array;

import java.util.Scanner;

public class _04_피보나치_수열2 {

	public void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		} // for문 끝.
	}
	
	public static void main(String[] args) {
		_04_피보나치_수열2 T = new _04_피보나치_수열2();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 입력받을 숫자개수를 말한다.

		T.solution(n);
	}
}
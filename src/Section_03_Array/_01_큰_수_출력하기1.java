package Section_03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_ū_��_����ϱ�1 {
		
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_01_ū_��_����ϱ�1 T = new _01_ū_��_����ϱ�1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ��� ���ڸ� �Է¹����� �����ϴ� ����
		int[] arr = new int[n]; // ������ ������ �°� �迭����
		
		// ex) ==> (7 3 9 5 6 12)�� �ش��ϴ� ���� �ѹ��� �Է¹����� �ִ�.
		// nextInt�� ������ �������� �ʱ⶧���� ���� �Է¹޴´�.
		for(int i = 0; i < n; i++) { 
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
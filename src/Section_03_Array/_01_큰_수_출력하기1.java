package Section_03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_큰_수_출력하기1 {
		
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
		_01_큰_수_출력하기1 T = new _01_큰_수_출력하기1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 몇개의 숫자를 입력받을지 저장하는 변수
		int[] arr = new int[n]; // 숫자의 개수에 맞게 배열선언
		
		// ex) ==> (7 3 9 5 6 12)에 해당하는 값을 한번에 입력받을수 있다.
		// nextInt는 공백을 포함하지 않기때문에 각각 입력받는다.
		for(int i = 0; i < n; i++) { 
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
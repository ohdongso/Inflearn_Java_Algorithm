package Section_02_Array;

import java.util.Scanner;

public class _02_보이는_학생1 {
	/*
		1, max변수에 index 0에 해당하는 겂을 초기화 시켜준다.
		2, index 1부터 ~ N-1까지 차례로 비교하면서 앞선 값보다 큰 값이이 있으면 제일 좌측에서 볼수 있기때문에
		   +1 해주면서 for문을 한번만 돈다.
		3, 가장 중요한건 앞서 비교된 값들보다 index에 해당하는 비교 값이 크면 +1 해주는 알고리즘이다.
	*/
	public int solution(int n, int[] arr) {
		// 첫 번째 사람은 무조건 보이기 때문에 1로 초기화 한다.
		// 첫 사람의 값을 max에 넣어준다.
		int answer = 1, max = arr[0];
		
		// index 0을 max변수에 초기값으로 넣는다.
		// index 1부터 비교하는데 max보다 i index에 해당하는 값이 크다면
		// 선생님이 볼수 있기 때문에 answer를 +1해준다.
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_보이는_학생1 T = new _02_보이는_학생1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 몇개의 숫자를 입력받을지 저장하는 변수
		int[] arr = new int[n]; // 숫자의 개수에 맞게 배열선언
		
		
		// ex) ==> (7 3 9 5 6 12)에 해당하는 값을 한번에 입력받을수 있다.
		// nextInt는 공백을 포함하지 않기때문에 각각 입력받는다.
		for(int i = 0; i < n; i++) { 
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, arr));
	}
}
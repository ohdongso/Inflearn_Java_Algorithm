package Section_02_Array;

import java.util.Scanner;

public class _08_등수구하기1 {
	/*
		1,국어 점수 배열을 입력받는다.
		2,index i에 해당하는 학생의 등수를 구해서 정답 배열에 담아주면 된다.
		3,index i부터 비교해서 자기보다 큰 값이 있으면 cnt를 +1해서 등수를 높여준다.
		4,동일한 점수가 있을경우 자기보다 큰 값 숫자가 같기때문에 동일한 등수가 부여되고
		  다른 숫자가 동일한 숫자를 비교했을경우 전부 자기보다 값이 크기 때문에 cnt가 동일한 숫자만큼 반복되서
		  자동으로 순위가 매겨진다. 
	*/
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) { // 등수를 구해줄 기준이 되는 학생
			int cnt = 1; // cnt는 j 반복문이 돌고나면 1로 초기화 되어야 한다.
			for(int j = 0; j < n; j++) { // 기준이 되면 학생과 비교될 학생
				if(arr[j] > arr[i]) { // 기준학생보다 비교될 학생 점수가 더 높으면
					cnt++; // 기준학생 등수를 +1해준다.
				}
			}
			answer[i] = cnt; // 최종적으로 기준학생 등수를 배열에 저장해준다.
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_08_등수구하기1 T = new _08_등수구하기1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		// n개에 맞는 숫자를 공백을 기준으로 한번에 배열에 입력받을수 있다.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
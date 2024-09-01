package Section_03_Array;

import java.util.Scanner;

public class _09_격자판_최대합1 {
	/*
		1, 5*5 2차원배열선언
		2, 행,열,X대각선 값중 가장 큰 값을 출력하면 된다.
	*/
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2; // sum1은 각 행의 합, sum2는 각 열의 합
		
		for(int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for(int j = 0; j < n; j++) {
				sum1 += arr[i][j]; // i행의 각 j열의 합
				sum2 += arr[j][i]; // i열의 각 j행의 합 
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = sum2 = 0;		
		for(int i = 0; i < n; i++) {
			sum1 += arr[i][i]; // 행과 열이 같은경우 ==> (↘)
			sum2 += arr[i][n-i-1]; // 행은 1씩 증가하고 열은 1씩 감소해야 한다. ==> (↙)
		}
		
		// answer에는 이미 행과 열의 합중 가장 큰수가 answer에 저장 돼 있다.
		// 두 대각선 X를 최종적으로 비교하고 출력하면 된다.
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		_09_격자판_최대합1 T = new _09_격자판_최대합1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		// 2중 for문으로 2차원 배열에 숫자를 한번에 저장 할 수 있다.(아주편리하다.)
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}
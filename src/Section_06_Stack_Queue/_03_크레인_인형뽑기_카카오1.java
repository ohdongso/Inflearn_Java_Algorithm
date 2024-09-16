package Section_06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack; 

public class _03_크레인_인형뽑기_카카오1 {
	/*
	 	
	 */
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int pos : moves) { // 크레인의 위치 == 열의 위치
			for(int i = 0; i < board.length; i++) { // 2차원 배열의 행 크기 == [행][열]
				if(board[i][pos - 1] != 0) { // 인형 발견!
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0; // 인형을 꺼냈기 때문에 0으로 저장
					
					// 스택이 비어있지않고, 꺼낸 인형과 스택의 최상단 데이터가 같으면
					if(!stack.isEmpty() && tmp == stack.peek()) { 
						answer += 2; // 인형이 2개가 사라지기 때문에 +2
						stack.pop(); // 그리고 스택의 최상단 데이터 삭제
					} else { // 스택이 비어있지 않고, 꺼낸 인형과 스택의 최상단 데이터가 다르면 push
						stack.push(tmp);
					}
					break; // 인형을 발견하면 for문이 멈춰야 한다.
				} 
			} // 안쪽 for문 끝.
		} // 바깥쪽 for문 끝.
		return answer;
	}
	
	public static void main(String[] args) {
		_03_크레인_인형뽑기_카카오1 T = new _03_크레인_인형뽑기_카카오1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n]; // 2차원 배열 선언 ==> board
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt(); // 2차원배열에 공백 문자열 한번에 입력
			}
		}
		
		int m = kb.nextInt(); // 움직이는 횟수
		int[] moves = new int[m]; // 열 좌표가 저장된 배열
		
		for(int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(board, moves));
	}
}
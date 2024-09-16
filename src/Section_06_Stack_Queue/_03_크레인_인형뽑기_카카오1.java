package Section_06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack; 

public class _03_ũ����_�����̱�_īī��1 {
	/*
	 	
	 */
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int pos : moves) { // ũ������ ��ġ == ���� ��ġ
			for(int i = 0; i < board.length; i++) { // 2���� �迭�� �� ũ�� == [��][��]
				if(board[i][pos - 1] != 0) { // ���� �߰�!
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0; // ������ ���±� ������ 0���� ����
					
					// ������ ��������ʰ�, ���� ������ ������ �ֻ�� �����Ͱ� ������
					if(!stack.isEmpty() && tmp == stack.peek()) { 
						answer += 2; // ������ 2���� ������� ������ +2
						stack.pop(); // �׸��� ������ �ֻ�� ������ ����
					} else { // ������ ������� �ʰ�, ���� ������ ������ �ֻ�� �����Ͱ� �ٸ��� push
						stack.push(tmp);
					}
					break; // ������ �߰��ϸ� for���� ����� �Ѵ�.
				} 
			} // ���� for�� ��.
		} // �ٱ��� for�� ��.
		return answer;
	}
	
	public static void main(String[] args) {
		_03_ũ����_�����̱�_īī��1 T = new _03_ũ����_�����̱�_īī��1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n]; // 2���� �迭 ���� ==> board
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt(); // 2�����迭�� ���� ���ڿ� �ѹ��� �Է�
			}
		}
		
		int m = kb.nextInt(); // �����̴� Ƚ��
		int[] moves = new int[m]; // �� ��ǥ�� ����� �迭
		
		for(int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(board, moves));
	}
}
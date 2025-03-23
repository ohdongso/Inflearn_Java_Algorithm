package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _10_¹Ì·ÎÅ½»ö_DFS {
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board;
	static int answer = 0;
	
	public void DFS(int x, int y) {
		if(x == 7 && y == 7) {
			answer++;
		} else {
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					DFS(nx, ny);
					board[nx][ny] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {	
		_10_¹Ì·ÎÅ½»ö_DFS T = new _10_¹Ì·ÎÅ½»ö_DFS();
		Scanner kb = new Scanner(System.in);
		
		board = new int[8][8];
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		board[1][1] = 1; // Ãâ¹ßÁ¡
		T.DFS(1, 1);
		System.out.print(answer);
	}
}









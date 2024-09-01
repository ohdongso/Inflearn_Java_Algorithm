package Section_03_Array;

import java.util.Scanner;

public class _10_봉우리1 {
	/*
		1, N*N 2차원배열선언, 각 격자에는 그 지역의 높이가 쓰여있다.
		2, 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역이다.
		3, 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성해라.
		4, 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
		   배열크기를 넓혀서 가장자리를 구해주는게 아니라, 
		   아래 조건을 if문에 줘서 index 범위를 벗어나면 비교를 멈추고 k를 증감하고 비교를 이어나간다.
		   nx >= 0 && nx < n && ny >= 0 && ny < n
		5, 행렬에 해당하는 숫자의 (상,하,좌,우)를 비교하기 위해서 dx, dy 배열을 사용한다. ==> 한쪽고정 다른한쪽 증감
	*/
	
	// dx와 dy를 조합해서 상하좌우 index를 나타낼 변수
	//         {좌, 상, 우, 하}
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					
					int nx = i + dx[k]; // 행 좌표
					int ny = j + dy[k]; // 열 좌표
					// 현재숫자보다 4방향(좌, 상, 우, 하) 숫자가 더 크다면 봉우리가 아니다.
					if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				} // k문 for문 끝.
				if(flag) {
					answer++;
				}
			} // j문 for문 끝.
		} // i문 for문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_10_봉우리1 T = new _10_봉우리1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		// 행과열에 공백이 있는 숫자를 한번에 입력받아 배열에 저장 할 수 있다.
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}
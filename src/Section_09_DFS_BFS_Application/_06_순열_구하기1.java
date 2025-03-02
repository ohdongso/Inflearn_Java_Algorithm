package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _06_순열_구하기1 {
	
	/*
		문제 : N개의 자연수가 주어지면 이 중 M개를 뽑아 "일렬로 나열하는 방법을 모두 출력"합니다.
		3 2
		3 6 9
		3 6
		3 9
		6 3
		6 9
		9 3
		9 6
	 */
	static int[] pm, ch, arr; // pm:순열의결과, ch:체크배열, arr:입력된숫자
	static int n, m;
	public void DFS(int L) {
		if(L == m) { // 순열이 하나 완성된것
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for(int i = 0; i < n; i++) { // 입력받은 숫자의 개수만큼 반복한다.
				if(ch[i] == 0) { // 체크배열에서 index에 해당하는 값이 사용되지 않았을 때
					ch[i] = 1; // 체크 해준다.
					pm[L] = arr[i]; // 순열의 결과 배열에 입력받은 숫자를 넣는다.
					DFS(L+1);
					ch[i] = 0; // 체크를해제 해준다.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		_06_순열_구하기1 T = new _06_순열_구하기1();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 숫자의 개수
		m = kb.nextInt(); // 몇 개를 뽑을지
		
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		ch = new int[n]; // 숫자개수만큼 잡아줘야 한다.
		pm = new int[m];
		T.DFS(0);
	}
}









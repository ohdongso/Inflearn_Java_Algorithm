package Section_09_DFS_BFS_Application;

import java.util.Scanner;

public class _01_합이_같은_부분집합_DFS_아마존_인터뷰1 {
	
	/*
		1, 두 부분집홥의 원소의 합이 서로 같은 경우가 존재하면 "YES"를 출력하고, 그렇지 않으면 "NO를" 출력하는 프로그램 작성
		
	 */
	
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	/*
		0, 0, arr
	 */
	public void DFS(int L, int sum, int[] arr) {
		if(flag) { // flag가 true면, 재귀함수 종료
			return;
		}
		
		/*
			원소 누적합이 > 원소의 총합이 / 2보다 크면 재귀함수 종료
			sum이 total/2 보다 크면 YES가 나올수가 없다.
		*/
		if(sum > total / 2) {
			return;
		}
		
		// n은 원소개수로 6이다. L은 레벨을 뜻한다.
		if(L == n) {
			if((total - sum) == sum) { // 6, 16에서 true가 된다.
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L+1, sum + arr[L], arr);
			
			System.out.println(L);
			System.out.println(sum);
			
			DFS(L+1, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		
		_01_합이_같은_부분집합_DFS_아마존_인터뷰1 T = new _01_합이_같은_부분집합_DFS_아마존_인터뷰1();
		
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // n은 원소의 개수
		
		int[] arr = new int[n]; // { 1, 3, 5, 6, 7, 10 }
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i]; // 배열 원소의 총합(32)
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
		
	}
}




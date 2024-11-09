package Section_07_Sorting_and_Searching;

public class _12_재귀함수를_이용한_이진수_출력1 {
	/*
		1, DFS(11) > DFS(n/2)
		2, DFS(5) > DFS(n/2)
		3, DFS(2) > DFS(n/2)
		4, DFS(1) > DFS(n/2)
		5, DFS(0) > 종료
		6, Stack의 상단부터 출력(5, 4, 3, 2, 1)
		
		1, DFS(1)로 돌아와서 DFS(n/2)의 다음라인인 System.out.print(n % 2 + " ");를 출력한다. ==> 1
		2, DFS(2)로 돌아와서 " ==> 0
		3, DFS(5)로 돌아와서 " ==> 1
		4, DFS(11)로 돌아와서 " ==> 1
		5, 1011을 출력		
	 */
	public void DFS(int n) {
		if(n == 0) {
			return;
		} else {
			DFS(n/2);
			System.out.print(n % 2 + " ");
		}
	}
	
	public static void main(String[] args) {
		_12_재귀함수를_이용한_이진수_출력1 T = new _12_재귀함수를_이용한_이진수_출력1();
		T.DFS(11);		
	}
}
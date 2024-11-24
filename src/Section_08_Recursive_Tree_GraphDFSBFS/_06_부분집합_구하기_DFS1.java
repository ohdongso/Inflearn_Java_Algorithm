package Section_08_Recursive_Tree_GraphDFSBFS;

class _06_부분집합_구하기_DFS1 {
	
	/*
  		1, DFS(1) > 1을 부분집합으로 사용하는지? > n이 4가 되면 종착점이다
  			- ch배열에서 index 1번째를 1로 변경
  			- DFS(2)를 호출
  		2, DFS(2) > 2를 부분집합으로 사용하는지?
  			- ch배열에서 index 2번째를 1로 변경
	 		- DFS(2)를 호출
	 	3, DFS(3) > 3를 부분집합으로 사용하는지?
	 		- ch배열에서 index 3번째를 1로 변경
	 		- DFS(4)을 호출
	 	4,  DFS(4) > n이 4가 되면 종착점이다
	 		- ch배열에서 1로 체크되어 있는 index를 체크하고 출력하면 된다. > 1,2,3 출력
	 		- DFS(4)는 pop 된다.
	 	5, DFS(3) > ch[L] = 0; 라인으로 가서 다음로직을 실행한다.
	 		- ch[3]에 해당하는 값을 0으로 변경한다. > 1, 2, 0
	 		- 다시 DFS(L+1)구문을 통해, DFS(3)의 오른쪽 DFS(4)가 종착점을 확인한다.
	 		- (L == n + 1) 조건이 true가 되므로 > 1,2 출력
	 		- DFS(3)은 pop 된다.
	 	6, DFS(2) > ch[L] = 0; 라인으로 가서 다음로직을 실행한다.
	 		- ch[2]에 해당하는 값을 0으로 변경한다. > 1, 0, 0
	 		- 다시 DFS(L+1)구문을 통해, DFS(2)의 오른쪽 DFS(3)이 종착점을 확인한다.
	 			- DFS(3)은 다시 ch[L]=1; 구문을 통해 INDEX 3번지의 값을 1로 변경한다. > 1,0,1
	 				- DFS(4)로 다시 와서 종착점인지 확인하고 출력한다 > 1,0,1 > 1,3	 	
	 */
	
	static int n; // 집합원소 개수
	static int[] ch; // 체크배열
	public void DFS(int L) {
		if(L == n + 1) { // 종착점
			String tmp = "";
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) {
					tmp += (i + " ");
				}
			}
			if(tmp.length() > 0) {
				System.out.println(tmp);
			}
		} else { // 두갈래로 뻗어 나간다
			ch[L] = 1; // 원소를 사용한다
			DFS(L + 1); // 왼쪽
			ch[L] = 0; // 원소를 사용안한다
			DFS(L + 1); // 오른쪽
		}
	}
	
	public static void main(String[] args) {
		_06_부분집합_구하기_DFS1 T = new _06_부분집합_구하기_DFS1();
		n = 3;
		ch = new int[n + 1];
		T.DFS(1);
	} // main 끝.
}
package Section_07_Sorting_and_Searching;

import Section_08_Recursive_Tree_GraphDFSBFS._02_재귀함수를_이용한_이진수_출력1;

public class Main {
	
	public void DFS(int n) {
		if(n == 0) {
			return;
		} else {
			DFS(n/2);
			System.out.print(n % 2 + " ");
		}
	}
	
	public static void main(String[] args) {
		_02_재귀함수를_이용한_이진수_출력1 T = new _02_재귀함수를_이용한_이진수_출력1();
		T.DFS(11);		
	}
}
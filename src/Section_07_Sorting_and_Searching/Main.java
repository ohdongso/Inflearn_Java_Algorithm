package Section_07_Sorting_and_Searching;

import Section_08_Recursive_Tree_GraphDFSBFS._02_����Լ���_�̿���_������_���1;

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
		_02_����Լ���_�̿���_������_���1 T = new _02_����Լ���_�̿���_������_���1();
		T.DFS(11);		
	}
}
package Section_07_Sorting_and_Searching;



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
		_12_����Լ���_�̿���_������_���1 T = new _12_����Լ���_�̿���_������_���1();
		T.DFS(11);		
	}
}
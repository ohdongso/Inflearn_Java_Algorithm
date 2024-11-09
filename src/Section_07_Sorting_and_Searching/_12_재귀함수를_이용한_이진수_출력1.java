package Section_07_Sorting_and_Searching;

public class _12_����Լ���_�̿���_������_���1 {
	/*
		1, DFS(11) > DFS(n/2)
		2, DFS(5) > DFS(n/2)
		3, DFS(2) > DFS(n/2)
		4, DFS(1) > DFS(n/2)
		5, DFS(0) > ����
		6, Stack�� ��ܺ��� ���(5, 4, 3, 2, 1)
		
		1, DFS(1)�� ���ƿͼ� DFS(n/2)�� ���������� System.out.print(n % 2 + " ");�� ����Ѵ�. ==> 1
		2, DFS(2)�� ���ƿͼ� " ==> 0
		3, DFS(5)�� ���ƿͼ� " ==> 1
		4, DFS(11)�� ���ƿͼ� " ==> 1
		5, 1011�� ���		
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
		_12_����Լ���_�̿���_������_���1 T = new _12_����Լ���_�̿���_������_���1();
		T.DFS(11);		
	}
}
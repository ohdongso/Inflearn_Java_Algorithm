package Section_07_Sorting_and_Searching;

import java.util.Scanner; 

public class _03_����_����1 {

	public int[] solution(int n, int[] arr) {

		for(int i = 1; i < n; i++) { //  ���� ������ �Ǵ� ��(i)�� 1���� �����Ѵ�. �������� ��ĭ �� �̵�
			int tmp = arr[i], j; // ���� ���� �� ����
			
			// ���� ������ �Ǵ°�(i)���� j=i-1�� �����Ͽ�, �������� ��ĭ�� ���ؼ� �������� �����Ѵ�.
			for(j = i-1; j >= 0; j--) {
				
				// tmp���� i���� ���� �� �ְ�, j���� ���Ͽ� j���� ��ũ�ٸ�
				if(arr[j] > tmp) {
					// j+1��ġ�� j���� �����Ͽ� ��ĭ �ڷ� �Ű��ش�.
					arr[j+1] = arr[j];
				// tmp���� i���� ���� �� �ְ�, i���� ���Ͽ� j���� �� �۴ٸ� �ݺ����� �����ϰ�
				} else {
					break;
				}
			}
			
			// j+1��ġ�� tmp�� �ִ´�.
			arr[j+1] = tmp;
			
			// * j���� tmp���� ������ j+1��ġ�� tmp�� �ڸ��� �ȴٴ� ���̴�.
		} // �ٱ� for�� ��.
		
		return arr;
	}
	
	public static void main(String[] args) {
		_03_����_����1 T = new _03_����_����1();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // �Է¹��� ������ ����
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) { // �迭�� ���� ����
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) { // ���� ���ĵ� �迭�� �ϳ��� ���
			System.out.print(x + " ");
		}
	}
}
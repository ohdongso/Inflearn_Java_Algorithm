package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class _04_����_�κм���1 {
	/*
	 	1, �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� �˰���
	 	2, "N" == ���ڰ���, "M" == Ư������
	 	3, �������͸� ����ؼ� �ذ��ϸ� ȿ�����̴�.
	 */
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) { // ����
			sum += arr[rt]; // ���ϰ�
			if(sum == m) { // Ȯ��(lt~rt������ ��.)
				answer++;
			}
			
			// lt~rt ���� m�̻��̸�
			// sum�� ���� m������ ũ��ų� ���⶧����, sum�� m���� �۾��� �� ���� while���� �ݺ��Ѵ�.
			// rt�� n���� ����, ���� lt���� ����������(rt)�� ���� sum�̶� ���ų� ũ�� ������ lt�� >>> +1 ���� �ʿ䰡 ��� ������.
			while(sum >= m) { 
				 sum -= arr[lt++]; // sum���� ���� lt���� ���� lt index�� +1 ���ش�.
				 if(sum == m) { // lt~rt ���� m�̸� answer�� +1 ���ش�.
					 answer++;
				 }
			} // while�� ��.
		} // for�� ��.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_04_����_�κм���1 T = new _04_����_�κм���1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ��� ������ ������
		int m = kb.nextInt(); // �κ� ������ ��
		
		int[] arr = new int[n]; // �Է¹��� �迭
		
		for(int i = 0; i < n; i++) { // ������ ���� �迭
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, m, arr));
	}
}
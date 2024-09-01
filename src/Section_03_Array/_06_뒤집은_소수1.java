package Section_03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_������_�Ҽ�1 {
	public boolean isPrime(int num) {
		// num tmp�� ������ �ڿ�����, 1230�̸� 321�� ����� ������.
		if(num == 1) { // 1�� �Ҽ��� �ƴϴ�. false��ȯ
			return false;
		}
		
		// 2 ~ ������ ���� �� ���� �ݺ�, 1�� �ڱ��ڽ��� �Ҽ��� �� �� ���⶧���� ���� �������� �ʴ´�.
		for(int i = 2; i < num; i++) {
			// �Ҽ��� 1�� �ڱ��ڽ��� ������ ����� ������ �ʴ� ����, �ٸ� ���ڷ� ������ �������� 0�̶��
			// �� ���� �Ҽ��� �ƴϴ�. �׷��� ������ false�� ��ȯ�Ѵ�.
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		// �Է¹��� �ڿ��� ������ŭ �ݺ��Ѵ�.
		// 32 55 62 20 250 370 200 30 100 ==> 9��
		for(int i = 0; i < n; i++) { 
			int tmp = arr[i]; // ������ �Է� ���� �ڿ����� �ǹ�
			int res = 0; // ������ ���ڸ� ���ϱ� ���� ���������� ������ ����
			while(tmp > 0) { // tmp�� % 10 ���Ŀ� / 10���� ���ڸ��� ������Ų��. 0���� Ŭ������ �ݺ�
				int t = tmp % 10; // �����ڸ��� �����༭ ���� t�� ��´�.
				res = res * 10 + t; // ���� �˰����� ����Ѵ�. res�� ������ ���ڰ� ���������� ������ ������.
				tmp = tmp / 10; // �����ڸ��� ���ؼ� ���� ������� ������ �������� �����ڸ��� �����Ѵ�.
			}
			// ������ ���ڸ� �Ҽ����� �Ǵ��ϱ� ���ؼ� isPrime�Լ��� ȣ���ѵ� �Ҽ��̸� answer����Ʈ�� �߰����ش�.
			if(isPrime(res)) {
				answer.add(res);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_������_�Ҽ�1 T = new _06_������_�Ҽ�1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		// (32 55 62 20 250 370 200 30 100) ���ڵ��� �ѹ��� �Է¹��� �� �ִ�.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
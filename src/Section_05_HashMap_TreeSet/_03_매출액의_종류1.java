package Section_05_HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _03_�������_����1 {
	// lt, rt 2���� ��ǥ�� �̿��� "�����̵� ������"�� "��������"�� ����ؼ�, 
	// map��(key,value)�� Ȱ���� ������ �ذ��Ѵ�.
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>(); // ������ ��� ArrayList
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>(); // ī��Ʈ ���� ArrayList
		
		// ���� 3�� ����(0 ~ 2), ���ڿ� �ش��ϴ� count�� ���ش�.
		// 20, 12 
		//  2,  1
		for(int i = 0; i < k - 1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		
		int lt = 0;
		for(int rt = k - 1; rt < n; rt++) { // lt��rt ������ 4ĭ ���� �ϸ鼭 �����̵� �����츦 �����ϸ�, lt��rt�� �̿��� �������͸� ����Ѵ�.
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt]) - 1); // lt�� �ش��ϴ� ���ڸ� -1���ش� ==> index�� 1�������ؾ� �ϱ� ������
			if(HM.get(arr[lt]) == 0) { // lt�� �ش��ϴ� ���ڰ� -1�� �� �� 0�̵Ǹ�, arr���� �������ش�.
				HM.remove(arr[lt]);
			}
			lt++; // lt�� 1���� ��Ų��.
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		_03_�������_����1 T = new _03_�������_����1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // �Է¹޴� ���� ����
		int k = kb.nextInt(); // ���ӵǴ� ��¥
		int[] arr= new int[n]; // �Է¹��� ���� ������ ����
		for(int i = 0; i < n; i++) { // ������ �������� �Է� ���� �迭�� ����ش�.
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}
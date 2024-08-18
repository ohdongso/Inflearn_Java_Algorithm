package Section_04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class _04_���_�Ƴ��׷�_ã��1 {
	/*
	 	
	 */
	public int solution(String a, String b) { // a:��ü���ڿ�, b:�Ƴ��׷����ڿ�
		int answer = 0;
		
		// ��ü���ڿ�a���� �����̵� ������ (key, value)�� ����Ǵ� �ؽ���
		HashMap<Character, Integer> am = new HashMap<Character, Integer>();
		
		// �Ƴ��׷� �ؽ���
		HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
		
		/*
		 	�Ƴ��׷� ���ڿ��� �ϳ��� �߶�ͼ� bm �ؽ��ʿ� {key(����), value(����)} ���·� �����Ѵ�.
		 	ó�� ���� ���� �� ���� 0�̹Ƿ�, 0�� ��� 1�� ġȯ�ؼ� �����Ѵ�.
		 */
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0) + 1);
		}	
		int L = b.length() - 1; // �Ƴ��׷� ���ڿ� ��ü���̿��� -1�� ���̸� L�� �����Ѵ�.
		for(int i = 0; i < L; i++) { // ���� (0~1), 2�� �ݺ�
			// (b,a)�� am �ؽ��ʿ� �����ϰ�, value���� 1���ؼ� �����Ѵ�.
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		}
		
		int lt = 0;
		for(int rt = L; rt < a.length(); rt++) { // rt�� �̹� 2���� ���� �� �ֱ� ������ index 2���� �����Ѵ�.(2~8)
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if(am.equals(bm)) { // Hash���� (key,value)�� ���� ��, equals()�� ���ϸ� ������ �޶� �����ش�.
				answer++; // a���ڿ����� �����̵� �����찡, �Ƴ��׷� ���ڿ��� ���ٸ� answer++;
			}
			// �����̵� �����츦 �������� ��ĭ �̵��ؾ� �Ǳ� ������, ���� lt index�� key�� value�� -1���ش�.
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1); 
			if(am.get(a.charAt(lt)) == 0) { // -1 �� ���� 0�̸�, am���ڿ� �ؽ��ʿ��� lt�� �ش��ϴ� (key,value)����
				am.remove(a.charAt(lt));
			}
			lt++; // �׸��� lt�� �������� ��ĭ �Ű� �ش� �˰����� �ݺ��Ѵ�.
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_04_���_�Ƴ��׷�_ã��1 T = new _04_���_�Ƴ��׷�_ã��1();
		Scanner kb = new Scanner(System.in);
		String a = kb.next(); // ��ü���ڿ�
		String b = kb.next(); // �Ƴ��׷� ���ڿ�
		System.out.print(T.solution(a, b));
	}
}
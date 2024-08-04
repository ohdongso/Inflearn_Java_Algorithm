package Section_04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class _02_�Ƴ��׷�_�ؽ�1 {
	
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : s1.toCharArray()) { // ù ��° ���ڿ��� map�� key�� �°� ī���� ���ִ� ����.
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x : s2.toCharArray()) {
			// map�� �ش��ϴ� Ű���߿� x�� ���ԵǾ� ���� �ʰų�, 
			// map�� �ش��ϴ� Ű ���� ���ҽ�ų���� �ߴµ� �̹� 0�̶� ���� ��ų�� ������ ������ ���� �ʱ� ������ �����Ų��.
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_�Ƴ��׷�_�ؽ�1 T = new _02_�Ƴ��׷�_�ؽ�1();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(T.solution(a, b));
	}
}
package Section_04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class _01_�б�_ȸ��_�ؽ�1 {
	public char solution(int n, String s) {
		char answer = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : s.toCharArray()) { // ABC.... ���ڿ��� �ϳ��� ©�� char�� ��ȯ�Ѵ�.
			/*
			 	x�� �ش��ϴ� key���� ������ ���ʿ� 0���� �����ϰ�, ��� +1�� �������ش�.
			 	��������� key�� �ش��ϴ� ���ĺ� �κ���, �ߺ��Ǽ� ������ +1�ȴ�.
			 */
			map.put(x, map.getOrDefault(x, 0) + 1);
		} // for�� ��.
		
		/*
		for(char x : map.keySet()) {
			System.out.println(x);
			System.out.println(map.get(key));
		}
		*/
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		_01_�б�_ȸ��_�ؽ�1 T = new _01_�б�_ȸ��_�ؽ�1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
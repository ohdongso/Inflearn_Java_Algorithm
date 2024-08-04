package Section_04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class _02_아나그램_해쉬1 {
	
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : s1.toCharArray()) { // 첫 번째 문자열을 map의 key에 맞게 카운팅 해주는 구문.
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x : s2.toCharArray()) {
			// map에 해당하는 키값중에 x가 포함되어 있지 않거나, 
			// map에 해당하는 키 값을 감소시킬려고 했는데 이미 0이라서 감소 시킬수 없으면 개수가 맞지 않기 때문에 종료시킨다.
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_02_아나그램_해쉬1 T = new _02_아나그램_해쉬1();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(T.solution(a, b));
	}
}
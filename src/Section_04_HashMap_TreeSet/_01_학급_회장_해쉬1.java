package Section_04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class _01_학급_회장_해쉬1 {
	public char solution(int n, String s) {
		char answer = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : s.toCharArray()) { // ABC.... 문자열을 하나씩 짤라서 char로 반환한다.
			/*
			 	x에 해당하는 key값이 없으면 최초에 0으로 세팅하고, 계속 +1을 누적해준다.
			 	결과적으로 key에 해당하는 알파벳 부분이, 중복되서 나오면 +1된다.
			 */
			map.put(x, map.getOrDefault(x, 0) + 1);
		} // for문 끝.
		
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
		_01_학급_회장_해쉬1 T = new _01_학급_회장_해쉬1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
package Section_04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class _04_모든_아나그램_찾기1 {
	/*
	 	
	 */
	public int solution(String a, String b) { // a:전체문자열, b:아나그램문자열
		int answer = 0;
		
		// 전체문자열a에서 슬라이딩 윈도우 (key, value)가 저장되는 해쉬맵
		HashMap<Character, Integer> am = new HashMap<Character, Integer>();
		
		// 아나그램 해쉬맵
		HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
		
		/*
		 	아나그램 문자열을 하나씩 잘라와서 bm 해쉬맵에 {key(문자), value(숫자)} 형태로 저장한다.
		 	처음 값이 저장 될 때는 0이므로, 0일 경우 1로 치환해서 저장한다.
		 */
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0) + 1);
		}	
		int L = b.length() - 1; // 아나그램 문자열 전체길이에서 -1한 길이를 L에 저장한다.
		for(int i = 0; i < L; i++) { // 최초 (0~1), 2번 반복
			// (b,a)를 am 해쉬맵에 저장하고, value값을 1로해서 저장한다.
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		}
		
		int lt = 0;
		for(int rt = L; rt < a.length(); rt++) { // rt는 이미 2개가 저장 돼 있기 때문에 index 2부터 시작한다.(2~8)
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if(am.equals(bm)) { // Hash맵의 (key,value)를 비교할 때, equals()로 비교하면 순서가 달라도 비교해준다.
				answer++; // a문자열에서 슬라이딩 윈도우가, 아나그램 문자열과 같다면 answer++;
			}
			// 슬라이딩 윈도우를 우측으로 한칸 이동해야 되기 때문에, 현재 lt index에 key의 value를 -1해준다.
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1); 
			if(am.get(a.charAt(lt)) == 0) { // -1 한 값이 0이면, am문자열 해쉬맵에서 lt에 해당하는 (key,value)삭제
				am.remove(a.charAt(lt));
			}
			lt++; // 그리고 lt를 우측으로 한칸 옮겨 해당 알고리즘을 반복한다.
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_04_모든_아나그램_찾기1 T = new _04_모든_아나그램_찾기1();
		Scanner kb = new Scanner(System.in);
		String a = kb.next(); // 전체문자열
		String b = kb.next(); // 아나그램 문자열
		System.out.print(T.solution(a, b));
	}
}
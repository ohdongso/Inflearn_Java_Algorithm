package Section_06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; 

public class _07_교육과정_설계1 {
	/*
		1, need:필수과목, plan:현수가 작성한 과목계획서
	 	2, 
	 */
	public String solution(String need, String plan) {
		String answer = "YES";
		
		Queue<Character> Q = new LinkedList<>();
		
		for(char x : need.toCharArray()) {
			Q.offer(x); // 큐에 필수과목 세팅
		}
		
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) { // 계획서상 과목이 필수과목에 있으면
				if(x != Q.poll()) { // 계획서상 과목이 필수과목의 처음이 아니면
					return "NO";
				}
			}		
		}
		
		if(!Q.isEmpty()) { // 필수과목 중 이수하지 않은 과목이 있다면
			return "NO";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_07_교육과정_설계1 T = new _07_교육과정_설계1();
		
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next(); // 필수과목
		String b = kb.next(); // 현수가 작성한 과목계획표
		
		System.out.println(T.solution(a, b));
	}
}
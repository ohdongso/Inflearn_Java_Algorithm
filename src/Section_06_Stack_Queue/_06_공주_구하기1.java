package Section_06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; 

public class _06_공주_구하기1 {
	/*
	 	1, 마지막 2개가 남았을 때, (4,7) > (7,4) > (4,7) > 
	 	3번째 왕자에 해당하는 4를 poll하고 한명남은 7번 왕자를 반환한다.
	 */
	public int solution(int n, int k) {
		int answer = 0;
		
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) { // 1~n까지 왕자번호를 큐에 삽입
			Q.offer(i);
		}
		
		while(!Q.isEmpty()) { // 큐가 비어 있지 않으면
			
			for(int i = 1; i < k; i++) { // 큐에서 자리가 3-1까지 완자를 이동시키는 구문
				Q.offer(Q.poll()); // 제일 앞에 숫자를 꺼내서, 제일 뒤에 삽입
			}
			
			Q.poll(); // 큐에서 자리가 3인 왕자를 제외시킨다.
			
			if(Q.size() == 1) { // 큐에 왕자가 한명 남으면, 꺼내서 answer에 담고 반환
				answer = Q.poll();
			}
			
		} // while문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_공주_구하기1 T = new _06_공주_구하기1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 왕자의 수
		int k = kb.nextInt(); // 제외 될 번호
		
		System.out.println(T.solution(n, k));
	}
}
package Section_06_Stack_Queue;

import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner; 

class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) { // 생성자
		this.id = id;
		this.priority = priority;
	}
} // Person 클래스 끝.

public class _08_응급실1 {
	/*
		
	 */
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Queue<Person> Q = new LinkedList<>();
		
		// 큐에 환자index와 위험도를 저장한다.
		for(int i = 0; i < n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) { // 큐가 비어있지 않을경우에 while문 반복
			Person tmp = Q.poll(); // 제일 앞의 환자를 꺼낸다.
			
			for(Person x : Q) { // 제일 앞의 환자를 꺼내고 나머지 환자를 하나씩 꺼낸다.
				if(x.priority > tmp.priority) { // 꺼낸 환자보다 x환자의 위험도가 더 높다면
					Q.offer(tmp); // 제일 앞에서 꺼낸 환자를 제일 뒤로 넣는다.
					tmp = null; // tmp초기화
					break; // for문 종료
				}
			}
			
			// tmp가 null이 아니라는 말은 꺼낸 환자가 위험도가 제일 높기때문에 
			// "진료를 받는다는 의미다"
			if(tmp != null) {
				answer++;
				if(tmp.id == m) { // tmp의 id(대기순번)가 m이면 현재 진료순서(answer)인를 반환한다.
					return answer;
				}
			}
		} // while문 끝.

		return answer;
	}

	public static void main(String[] args) {
		_08_응급실1 T = new _08_응급실1();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // n은 환자의 "총명수"를 의미
		int m = kb.nextInt(); // m은 n중 몇번째 "대기환자"를 의미
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt(); // 환자의 위험도를 입력 받은 배열
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}
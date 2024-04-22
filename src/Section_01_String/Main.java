package Section_01_String;

import java.util.Scanner;

public class Main {
	
	
	// 매개변수로 (teachermode, e) 2개의 값이 넘어 왔다.
	public int[] solution(String s, char t) {
		// teachermod == s.length == 10
		int[] answer = new int[s.length()];
		
		// 각 문자가 자기의 좌측 e와 떨어진 거리를 구하는 것, (진행방향 ->)
		// 진행방향이 -> 일때 t와 같은 알파벳을 찾아 p를 0으로 초기화 해주기 때문에 1000이 들어가도 상관없다. 
		int p = 1000;
		for(int i = 0; i < s.length(); i++) { // 0~9
			// p가 0으로 초기화된것은 t와 index에 해당하는 알파벳이 같다는 말이고 이제부터 비교가 시작된다.
			// 그리고 두번째로 p가 0으로 초기화 된것은, t가 배열에서 2번째 나왔다는 말이고 다시 거리비교한다.
			if(s.charAt(i) == t) { // t와 index에 해당하는 문자형이 같으면 p = 0;
				p = 0;
				// answer[i]에 0으로 초기화된다.(t와 answer[i]값이 같은경우)
				answer[i] = p;
			} else {
				// answer[i]에 0초기화 되고 (i+1, p+1)되면서 t로부터 떨어진 answer[i]값을 구할수 있다.
				// answer[i]와 t와 값이 같으면 다시 p를 초기화 하고 answer[i]에 0을 입력후 거리를 비교한다.
				p++;
				answer[i] = p;
			}
		}
		
		// 각 문자가 자기의 우측 e와 떨어진 거리를 구하는 것, (진행방향 <-)
		p = 1000;
		for(int i = s.length()-1; i >= 0; i--) { // 9~0
			// p가 0으로 초기화된것은 t와 index에 해당하는 알파벳이 같다는 말이고 이제부터 비교가 시작된다.
			// 그리고 두번째로 p가 0으로 초기화 된것은, t가 배열에서 2번째 나왔다는 말이고 다시 거리비교한다.
			if(s.charAt(i) == t) {
				p = 0;
				// answer[i]에 0으로 초기화된다.(t와 answer[i]값이 같은경우)
				answer[i] = p;
			} else {
				// answer[i]에 0초기화 되고 (i-1, p+1)되면서 t로부터 떨어진 answer[i]값을 구할수 있다.
				// answer[i]와 t와 값이 같으면 다시 p를 초기화 하고 answer[i]에 0을 입력후 거리를 비교한다.
				p++;
				
				// 진행방향 ->에서 저장된 t와의 거리 값과, 진행방향 <-에서 저장된 t와의 거리값(p)
				// 중 작은 값을 answer[i]에 저장한다.
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); // 문자열 입력받는다. ==> teachermode
		char c = kb.next().charAt(0); // 문자열 입력받는다. ==> e
		
		for(int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}
	}
}
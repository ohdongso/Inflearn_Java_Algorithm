package Section_02_Array;

import java.util.Scanner;

public class _05_소수_에라토스테니스_체1 {
	// 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
	// 2 <= N <= 200,000 시간이 주어지면 무작정 풀면 통과못한다. 시간 신경써야 한다.
	
	public int solution(int n) {
		int answer = 0;
		
		// N번호와 INDEX번호를 맞춰주기 위해서 +1 해준다.
		// 초기에는 0으로 초기화 된다.
		int[] ch = new int[n + 1]; 
		
		// 특정숫자가 소수이면 answer을 +1 해준다. 그리고 특정숫자부터 그 수의 배수에 해당하면 배열에서 0에서 1로 변경한다.
		for(int i = 2; i <= n; i++) { // 2~20
			
			// 2에 해당하는 ch[2] == 0 이면 소수이고, 배수를 0에서 1로 변경
			// 3에 해당하는 ch[3] == 0 이면 소수이고, 배수를 0에서 3으로 변경
			// 4에 해당하는 ch[4] == 0 이면 소수이고, ch[4] == 1이면, 이미 소수였던 수의 배수이므로 소수가 아니다.
			// 이 과정을 순차적으로 하면, i에 해당하는 숫자가 소수인지 아닌지 구별하는 구문이 필요가 없네.
			// ch[i] == 0(소수이고, 배수는 소수가 아니다.), ch[i] == 1(소수가 아니다) 
			if(ch[i] == 0) {
				answer++;
				
				// j의 시작값은 ch[i] == 0인 i값으로 초기화해서 시작한다.
				// j의 끝값은 n으로 마지막까지 비교한다.
				// j의 증가는 i배수가 되어야 하기 때문에, j+i를 통해 배수를 구해준다.
				// j의 배수에 해당하는 index를 0에서 1로 변경한다.
				for(int  j = i; j <= n; j= j+i) {
					ch[j] = 1;
				}
			}
		}
		
		// 신기한게 배열에서 일단 소수를 찾아주는 구문자체가 필요없고 i에 해당하는 배열이 값이 0이면
		// 그 수의 배수에 해당하는 index를 1로 변경해주기만 하면 되는게 신기하네 효율적이다.! good
		return answer;
	}
	
	public static void main(String[] args) {
		_05_소수_에라토스테니스_체1 T = new _05_소수_에라토스테니스_체1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
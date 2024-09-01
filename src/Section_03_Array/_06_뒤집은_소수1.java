package Section_03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_뒤집은_소수1 {
	public boolean isPrime(int num) {
		// num tmp를 반전한 자연수로, 1230이면 321이 저장된 변수다.
		if(num == 1) { // 1은 소수가 아니다. false반환
			return false;
		}
		
		// 2 ~ 반전된 숫자 전 까지 반복, 1과 자기자신은 소수가 될 수 없기때문에 굳이 비교해주지 않는다.
		for(int i = 2; i < num; i++) {
			// 소수는 1과 자기자신을 제외한 약수를 가지지 않는 수로, 다른 숫자로 나눠서 나머지가 0이라면
			// 그 수는 소수가 아니다. 그렇기 때문에 false를 반환한다.
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		// 입력받은 자연수 개수만큼 반복한다.
		// 32 55 62 20 250 370 200 30 100 ==> 9번
		for(int i = 0; i < n; i++) { 
			int tmp = arr[i]; // 각각의 입력 받은 자연수를 의미
			int res = 0; // 뒤집힌 숫자를 구하기 위해 순차적으로 누적할 변수
			while(tmp > 0) { // tmp는 % 10 이후에 / 10으로 한자리씩 삭제시킨다. 0보다 클때까지 반복
				int t = tmp % 10; // 일의자리를 구해줘서 변수 t에 담는다.
				res = res * 10 + t; // 반전 알고리즘을 사용한다. res는 반전된 숫자가 순차적으로 누적될 변수다.
				tmp = tmp / 10; // 일의자리를 구해서 반전 시켜줬기 때문에 원래값은 일의자리를 삭제한다.
			}
			// 반전된 숫자를 소수인지 판단하기 위해서 isPrime함수를 호출한뒤 소수이면 answer리스트에 추가해준다.
			if(isPrime(res)) {
				answer.add(res);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_뒤집은_소수1 T = new _06_뒤집은_소수1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		// (32 55 62 20 250 370 200 30 100) 숫자들을 한번에 입력받을 수 있다.
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
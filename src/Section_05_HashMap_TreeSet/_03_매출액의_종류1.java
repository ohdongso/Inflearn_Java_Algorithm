package Section_05_HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _03_매출액의_종류1 {
	// lt, rt 2개의 좌표를 이용해 "슬라이딩 윈도우"와 "투포인터"를 사용해서, 
	// map의(key,value)를 활용해 문제를 해결한다.
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>(); // 정답이 담길 ArrayList
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>(); // 카운트 해줄 ArrayList
		
		// 최초 3개 세팅(0 ~ 2), 숫자에 해당하는 count를 해준다.
		// 20, 12 
		//  2,  1
		for(int i = 0; i < k - 1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		
		int lt = 0;
		for(int rt = k - 1; rt < n; rt++) { // lt와rt 간격을 4칸 유지 하면서 슬라이딩 윈도우를 유지하며, lt와rt를 이용해 투포인터를 사용한다.
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt]) - 1); // lt에 해당하는 숫자를 -1해준다 ==> index가 1이증가해야 하기 때문에
			if(HM.get(arr[lt]) == 0) { // lt에 해당하는 숫자가 -1을 한 뒤 0이되면, arr에서 삭제해준다.
				HM.remove(arr[lt]);
			}
			lt++; // lt를 1증가 시킨다.
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		_03_매출액의_종류1 T = new _03_매출액의_종류1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 입력받는 수의 개수
		int k = kb.nextInt(); // 연속되는 날짜
		int[] arr= new int[n]; // 입력받은 수를 저장할 변수
		for(int i = 0; i < n; i++) { // 공백을 기준으로 입력 값을 배열에 담아준다.
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}
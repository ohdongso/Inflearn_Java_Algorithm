package Section_01_String;

import java.util.Scanner;

public class _06_중복문자제거1 {
	
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
//			index에 해당하는 알파벳, 현재 알파벳에 해당하는 index, str문자열에서 index에 해당하는 알파벳의 처음 index위치
//			System.out.println(str.charAt(i) + " " +  i + " " + str.indexOf(str.charAt(i)));
		
            // 현재 알파벳의 위치가 최초 알파벳의 index와 똑 같다면 누적
			// 그렇지 안으면 중복문자기 때문에 누적하지 않는다.
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		} // for문 끝.
		
		return answer;
	}
	
	public static void main(String[] args) {
		_06_중복문자제거1 T = new _06_중복문자제거1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));		
	}
}
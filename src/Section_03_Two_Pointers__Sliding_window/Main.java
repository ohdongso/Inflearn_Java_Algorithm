package Section_03_Two_Pointers__Sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
 	1, A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 	2, "A" == 집합1, "N" == 집합1의 크기, "B" == 집합2, "M" == 집합2의 크기
  	3, 투 포인터를 사용해서 해결하면 효율적이다.(오름차순 정렬 돼 있어야 한다.)	  	
 */

public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
	/*
	 	1, 두개의 배열을 오름차순 정렬해준다.
	 	2, 2개의 포인터  마지막을 가리키기 전까지 while문을 반복시킨다.
	 	3, 두개의 집합 값이 같으면 교집합 리스트에 추가해준다. 그리고 p1, p2 포인터를 전부 +1 한다.
	 	4, b집합 값이 크면, 작은값쪽 a집합의 p1 포인터를 +1 해준다.
	 	5, a집합 값이 크면, 작은값쪽 b집합의 p2 포인터를 +1 해준다.
	 	6, 반복이 끝나면 answer 반환하고, 출력해준다.
	 */
	
	ArrayList<Integer> answer = new ArrayList<Integer>();
	Arrays.sort(a);
	Arrays.sort(b);
	int p1 = 0, p2 = 0; // p1은 집합A의 포인터, p2는 집합B의 포인터
	
	while(p1 < n && p2 < m) { // p1이 n보다 작고, p2가 m보다 작으면 ==> 두 집합의 포인터가 안 끝났으면
		if(a[p1] == b[p2]) { // 같은지 비교
			answer.add(a[p1++]); // 같으면 교집합 ArrayList에 a[p1]을 담고
			p2++; // p1, p2 2개의 포인터를 각각 +1 해준다.
		} else if(a[p1] < b[p2]) { // 같지 않고, b[p2]의 값이 크면
			p1++; // p1의 포인터를 +1 해준다.
		} else { // 같지 않고, a[p1]의 값이 크면
			p2++; // p2의 포인터를 +1 해준다.
		}
	}
	
	return answer;
}

public static void main(String[] args) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	
	// 집합 A
	int n = kb.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++) {
		a[i] = kb.nextInt();
	}
	
	// 집합 B
	int m = kb.nextInt();
	int[] b = new int[m];
	for(int i = 0; i < m; i++) {
		b[i] = kb.nextInt();
	}
	
	for(int x : T.solution(n, m, a, b)) {
		System.out.print(x + " ");
	}
}
}
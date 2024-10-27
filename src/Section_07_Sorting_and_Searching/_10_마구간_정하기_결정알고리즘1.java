package Section_07_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class _10_마구간_정하기_결정알고리즘1 {
	/*
		* 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
		이말은 말과 말사이의 거리를 최대로 하면서, C마리의 말을 마구간에 다 배치하고 싶다는 뜻이다.
		
		중요한 포인트가 이분검색해서 유효한 값을 찾았다면, lt를 mid+1 값으로 저장해서 다시 mid값을 구해줘서 최적의 해를 찾는다.
		그리고 (lt,rt)는 mid(말사이의 거리)를 찾기위한 변수이고, ep와 arr[i]는 마구간 사이의 거리에 mid가 유효한지 비교하기위한 변수다
	 */
	public int count(int[] arr, int dist) { // dist는 mid를 의미하고, mid는 말과말사이의 거리를 의미한다.
		int cnt = 1; // 배치된 말 마리 수 = 1마리 배치
		int ep = arr[0]; // 바로 전에 말을 배치한 마구간의 좌표, 첫 번째 마구간 좌표 저장
		
		for(int i = 1; i < arr.length; i++) {
			// 두번째 마구간 좌표에서 첫번째 마구간 좌표를 뺀것이, 말과 말사이거리 mid이상이면 말이 배치 될 수 있으므로
			if(arr[i] - ep >= dist) {
				cnt++; // 말을 배치하며 한마리 증가
				ep = arr[i]; // 말이 배치된 마구간 좌표를 ep에 저장
			} 
		} // for문 끝.
		
		return cnt; // for문이 끝나면, 배치된 말의 마리수 반환
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr); // 마구간 좌표 오름차순 정렬
		int lt = 1; // 첫 번째 마구간 좌표
		int rt = arr[n - 1]; // 마지막 마구간 좌표
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // 말과 말사이의 거리
			
			// mid에 해당하는 거리로 말을 다 배치할수 있다. mid를 좁혀나간다.
			// count함수에서 반환된 배치된 말의 마리수가 c(배치되어야 할 전체 말마리수) 이상이면 유효한 값이다.
			if(count(arr, mid) >= c) {
				answer = mid; // answer변수에 mid(말사이의 거리)를 저장한다.
				lt = mid + 1; // 그리고 최대 거리를 구해줘야 하기때문에 lt를 증가시킨다.
			} else { // 사이거리가 너무 멀어서 말을 다 배치 할 수 없다. mid를 증가시켜나간다.
				rt = mid - 1;
			}
		} // while문 끝
		
		return answer;
	}
	
	public static void main(String[] args) {
		_10_마구간_정하기_결정알고리즘1 T = new _10_마구간_정하기_결정알고리즘1();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 전체 마구간 개수
		int c = kb.nextInt(); // 전체 말 마리 수
		
		int[] arr = new int[n]; // 마구간 좌표가 저장 될 배열
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		} // for문 끝.
		
		System.out.println(T.solution(n, c, arr));
	}
}
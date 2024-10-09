package Section_07_Sorting_and_Searching;

import java.util.Scanner; 

public class _03_삽입_정렬1 {

	public int[] solution(int n, int[] arr) {

		for(int i = 1; i < n; i++) { //  정렬 기준이 되는 값(i)는 1부터 시작한다. 우측으로 한칸 씩 이동
			int tmp = arr[i], j; // 정렬 기준 값 저장
			
			// 정렬 기준이 되는값(i)에서 j=i-1로 시작하여, 좌측으로 한칸씩 비교해서 오름차순 정렬한다.
			for(j = i-1; j >= 0; j--) {
				
				// tmp에는 i값이 저장 돼 있고, j값과 비교하여 j값이 더크다면
				if(arr[j] > tmp) {
					// j+1위치에 j값을 저장하여 한칸 뒤로 옮겨준다.
					arr[j+1] = arr[j];
				// tmp에는 i값이 저장 돼 있고, i값과 비교하여 j값이 더 작다면 반복문을 종료하고
				} else {
					break;
				}
			}
			
			// j+1위치에 tmp를 넣는다.
			arr[j+1] = tmp;
			
			// * j값이 tmp보다 작으면 j+1위치가 tmp의 자리가 된다는 점이다.
		} // 바깥 for문 끝.
		
		return arr;
	}
	
	public static void main(String[] args) {
		_03_삽입_정렬1 T = new _03_삽입_정렬1();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 입력받을 숫자의 개수
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) { // 배열에 숫자 저장
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) { // 삽입 정렬된 배열을 하나씩 출력
			System.out.print(x + " ");
		}
	}
}
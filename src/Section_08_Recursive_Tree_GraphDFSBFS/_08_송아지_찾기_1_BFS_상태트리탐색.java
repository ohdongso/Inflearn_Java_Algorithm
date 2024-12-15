package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class _08_송아지_찾기_1_BFS_상태트리탐색 {
	
	/*
		1, 5에서 움직일수 있는 경우를 트리로 뻗는다. ==> Level(0)
		2, (6, 4, 10)에서 움직일수 있는 경우를 트리로 뻗는다. ==> Level(1)
		3, 뻗어진 가지에서 움직일수 있는 경우를 트리로 뻗는다. 그리고 중복된 값은 제거, 조건을 만족하지 않으면 큐에 넣지 않는다. ==> Level(2)
		4, 이미 있는값은 또 볼 필요가 없다. 14가 발견되면 정지한다. 5 > -1 > +5 > +5 ==> Level(3)
		5, Level이 점핑 숫자이다.
	 */
	
	int answer = 0; // 최소 횟수 카운팅
	int[] dis = {1, -1, 5}; // 송아지가 움직일 수 있는 경우
	int[] ch; // 체크 배열(한번 방문된건 넣지 않는다.)
	
	Queue<Integer> Q = new LinkedList<Integer>();
	
	public int BFS(int s, int e) {
		ch = new int[10001]; // 현수와 송아지가 움직일수 있는 좌표상의 필드 1~10000
		
		ch[s] = 1; // 출발 지점(현수시작위치)
		Q.offer(s);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size(); // 각 레벨마다 len 개수만큼 노드가 들어가 있다.
			
			for(int i = 0; i < len; i++) { // 각 레벨 전체 탐색
				int x = Q.poll();
				for(int j = 0; j < 3; j++) { // 자식 노드 값을 구해주고 다시 큐에 넣는다.
					int nx = x + dis[j];
					
					if(nx == e) { // nx에서 3가지 경우에수를 할때는 자식 노드이기 때문에 현재노드의 + 1을 해준다.
						return L + 1;
					}
					
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) { // 참이면 아직 자식노드 값이 나오지 않은 것
						ch[nx] = 1; // index값은 노드의 데이터 이므로 상태값만 1로 변경해준다.
						Q.offer(nx); // 점프로 변경된 자식노드의 값을 큐에 저장
					}
				}
			}
			L++; // 레벨 증가
		} // while문 끝
		
		return 0;
	}
	
	public static void main(String[] args) {
		_08_송아지_찾기_1_BFS_상태트리탐색 T = new _08_송아지_찾기_1_BFS_상태트리탐색();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt(); // 현수의 위치 5
		int e = kb.nextInt(); // 송아지의 위치 14
		System.out.println(T.BFS(s, e));
		
	} // main 끝.
}
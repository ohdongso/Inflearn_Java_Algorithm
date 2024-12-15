package Section_08_Recursive_Tree_GraphDFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class _08_�۾���_ã��_1_BFS_����Ʈ��Ž�� {
	
	/*
		1, 5���� �����ϼ� �ִ� ��츦 Ʈ���� ���´�. ==> Level(0)
		2, (6, 4, 10)���� �����ϼ� �ִ� ��츦 Ʈ���� ���´�. ==> Level(1)
		3, ������ �������� �����ϼ� �ִ� ��츦 Ʈ���� ���´�. �׸��� �ߺ��� ���� ����, ������ �������� ������ ť�� ���� �ʴ´�. ==> Level(2)
		4, �̹� �ִ°��� �� �� �ʿ䰡 ����. 14�� �߰ߵǸ� �����Ѵ�. 5 > -1 > +5 > +5 ==> Level(3)
		5, Level�� ���� �����̴�.
	 */
	
	int answer = 0; // �ּ� Ƚ�� ī����
	int[] dis = {1, -1, 5}; // �۾����� ������ �� �ִ� ���
	int[] ch; // üũ �迭(�ѹ� �湮�Ȱ� ���� �ʴ´�.)
	
	Queue<Integer> Q = new LinkedList<Integer>();
	
	public int BFS(int s, int e) {
		ch = new int[10001]; // ������ �۾����� �����ϼ� �ִ� ��ǥ���� �ʵ� 1~10000
		
		ch[s] = 1; // ��� ����(����������ġ)
		Q.offer(s);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size(); // �� �������� len ������ŭ ��尡 �� �ִ�.
			
			for(int i = 0; i < len; i++) { // �� ���� ��ü Ž��
				int x = Q.poll();
				for(int j = 0; j < 3; j++) { // �ڽ� ��� ���� �����ְ� �ٽ� ť�� �ִ´�.
					int nx = x + dis[j];
					
					if(nx == e) { // nx���� 3���� ��쿡���� �Ҷ��� �ڽ� ����̱� ������ �������� + 1�� ���ش�.
						return L + 1;
					}
					
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) { // ���̸� ���� �ڽĳ�� ���� ������ ���� ��
						ch[nx] = 1; // index���� ����� ������ �̹Ƿ� ���°��� 1�� �������ش�.
						Q.offer(nx); // ������ ����� �ڽĳ���� ���� ť�� ����
					}
				}
			}
			L++; // ���� ����
		} // while�� ��
		
		return 0;
	}
	
	public static void main(String[] args) {
		_08_�۾���_ã��_1_BFS_����Ʈ��Ž�� T = new _08_�۾���_ã��_1_BFS_����Ʈ��Ž��();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt(); // ������ ��ġ 5
		int e = kb.nextInt(); // �۾����� ��ġ 14
		System.out.println(T.BFS(s, e));
		
	} // main ��.
}
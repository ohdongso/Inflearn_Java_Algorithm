package Section_09_DFS_BFS_Application;

import java.util.ArrayList;
import java.util.Scanner;

class pOINT5 {
	public int x, y;
	pOINT5(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<pOINT5> hs, pz;
	
	public void DFS(int L, int s) {
		if(L == m) {
			
			int sum = 0;
			for(pOINT5 h : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
				}
				sum += dis;
			}
			
			answer = Math.min(answer, sum);

			/*
			for(int x : combi) {
				System.out.print(x + " ");
			}
			System.out.println();
			*/
			
		} else {
			for(int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) {
					hs.add(new pOINT5(i, j));
				} else if(tmp == 2) {
					pz.add(new pOINT5(i, j));
				}
			}
		}
		
		len = pz.size();
		combi = new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
		
	}
}
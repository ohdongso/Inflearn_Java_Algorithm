package Section_10_Greedy_Algorithm;

import java.util.*;

class Body1 implements Comparable<Body1> {
	public int h, w;
	Body1(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body1 o) {
		return o.h-this.h;
	}
}

public class Main {
	
	public int solution(ArrayList<Body1> arr, int n) {
		int cnt = 0; // 선발되는 인원 수
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Body1 ob : arr) {
			// System.out.println(ob.h + ", " + ob.w);
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body1> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body1(h, w));
		}
		System.out.println(T.solution(arr, n));
		
	}
}
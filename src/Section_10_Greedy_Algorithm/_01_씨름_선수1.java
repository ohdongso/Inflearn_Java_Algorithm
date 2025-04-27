package Section_10_Greedy_Algorithm;

import java.util.*;

class Body implements Comparable<Body> {
	public int h, w;
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h-this.h;
	}
}

public class _01_씨름_선수1 {
	
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0; // 선발되는 인원 수
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Body ob : arr) {
			// System.out.println(ob.h + ", " + ob.w);
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		_01_씨름_선수1 T = new _01_씨름_선수1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body(h, w));
		}
		System.out.println(T.solution(arr, n));
		
	}
}








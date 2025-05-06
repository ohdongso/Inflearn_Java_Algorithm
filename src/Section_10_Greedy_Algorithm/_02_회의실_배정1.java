package Section_10_Greedy_Algorithm;

import java.util.*;

class Time implements Comparable<Time> {
	public int s, e;
	Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) {
			return this.s-o.s;
		} else {
			return this.e-o.e;
		}
	}
}

public class _02_회의실_배정1 {
	
	public int solution(ArrayList<Time> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		for(Time ob : arr) {
			if(ob.s >= et) {
				cnt++;
				et = ob.e;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		_02_회의실_배정1 T = new _02_회의실_배정1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(T.solution(arr, n));
	}
}








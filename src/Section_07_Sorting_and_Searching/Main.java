package Section_07_Sorting_and_Searching;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;

class Point1 implements Comparable<Point>{
	public int x, y;
	
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		// 오름차순정렬(this.y - o.y), 내림차순정렬(o.y - this.y)
		// this.y를 기준으로 오름차순 정렬하기 위해서는 this.y - o.x(비교할값)가 음수가 나와야 한다.
		if(this.x ==  o.x) { // x값이 같으면 y값을 정렬한다.
			return this.y - o.y;
		} else { // x값이 다르면 x값을 정렬한다.
			return this.x - o.x;
		}	
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // 좌표의 개수를 입력받음.
		ArrayList<Point> arr = new ArrayList<Point>();
				
		for(int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		
		Collections.sort(arr);
		for(Point o : arr) {
			System.out.println(o.x + " " + o.y);
		}
	}
}
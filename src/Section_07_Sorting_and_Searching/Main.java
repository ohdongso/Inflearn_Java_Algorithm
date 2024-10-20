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
		// ������������(this.y - o.y), ������������(o.y - this.y)
		// this.y�� �������� �������� �����ϱ� ���ؼ��� this.y - o.x(���Ұ�)�� ������ ���;� �Ѵ�.
		if(this.x ==  o.x) { // x���� ������ y���� �����Ѵ�.
			return this.y - o.y;
		} else { // x���� �ٸ��� x���� �����Ѵ�.
			return this.x - o.x;
		}	
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // ��ǥ�� ������ �Է¹���.
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
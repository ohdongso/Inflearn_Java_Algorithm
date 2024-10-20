
package Section_07_Sorting_and_Searching;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
		(this.x�� this.y)�� ���ı����� �Ǵ� ��ǥ�̴�. (o.x, o.y)�º񱳵Ǵ� ��ǥ�� �ǹ��Ѵ�.
		���⼭ this.x - o.x�� ���� ������ ������ this.x�� �������� �������� ���ĵȴ�.
		�Ǵ� o.x - this.x �� ���� ������ ������ this.x�� �������� �������� ���ĵȴ�.
		
		�� Ư¡
		- this.N�� ���� �տ� ������ (o.x�� ���̳ʽ��� ����) ������ ������ "�������� ����" > this.x - o.x = "����"
		- this.N�� ���� �ڿ� ������ (o.x�� ���̳ʽ��� ����) ������ ������ "�������� ����" > o.x - this.x = "����"
		- this.N�� �տ� ��ġ(��������) - o.x, o.x - this.N�� �ڿ� ��ġ(��������)
		- ���� �Ϳ��� ū���� �A�ٰ� �����ϸ� �ȴ�. 
		  ex) o.x�� �۰� this.x�� ũ�� ������ o.x - this.x�� ���� ������ �����ָ� this.x�� �������� ���ĵȴ�.
		  ex) this.x�� �۰� o.x�� ũ�� ������ this.x - o.x�� ���� ������ �����ָ� this.x�� �������� ���ĵȴ�.
	 */
	
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

public class _07_��ǥ_����1 {
	
	public static void main(String[] args) {
		_07_��ǥ_����1 T = new _07_��ǥ_����1();
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

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
		(this.x와 this.y)는 정렬기준이 되는 좌표이다. (o.x, o.y)는비교되는 자표를 의미한다.
		여기서 this.x - o.x한 값이 음수가 나오면 this.x를 기준으로 오름차순 정렬된다.
		또는 o.x - this.x 한 값이 음수가 나오면 this.x를 기준으로 내림차순 정렬된다.
		
		● 특징
		- this.N의 값이 앞에 있을때 (o.x와 마이너스한 값이) 음수가 나오면 "오름차순 정렬" > this.x - o.x = "음수"
		- this.N의 값이 뒤에 있을때 (o.x와 마이너스한 값이) 음수가 나오면 "내림차순 정렬" > o.x - this.x = "음수"
		- this.N이 앞에 위치(오름차순) - o.x, o.x - this.N이 뒤에 위치(내림차순)
		- 작은 것에서 큰것을 뺸다고 생각하면 된다. 
		  ex) o.x가 작고 this.x가 크기 때문에 o.x - this.x를 빼는 수식을 적어주면 this.x가 내림차순 정렬된다.
		  ex) this.x가 작고 o.x가 크기 때문에 this.x - o.x를 빼는 수식을 적어주면 this.x가 오름차순 정렬된다.
	 */
	
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

public class _07_좌표_정리1 {
	
	public static void main(String[] args) {
		_07_좌표_정리1 T = new _07_좌표_정리1();
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
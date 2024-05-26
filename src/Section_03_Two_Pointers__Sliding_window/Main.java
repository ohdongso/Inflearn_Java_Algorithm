package Section_03_Two_Pointers__Sliding_window;

import java.util.Scanner;

public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) { // ����
			sum += arr[rt]; // ���ϰ�
			if(sum == m) { // Ȯ��(lt~rt������ ��.)
				answer++;
			}
			
			while(sum >= m) { // lt~rt ���� m�̻��̸�
				 sum -= arr[lt++]; // sum���� ���� lt���� ���� lt index�� +1 ���ش�.
				 if(sum == m) { // lt~rt ���� m�̸� answer�� +1 ���ش�.
					 answer++;
				 }
			} // while�� ��.
		} // for�� ��.
		
		
		return answer;
	}
	

public static void main(String[] args) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	
	int n = kb.nextInt();
	int m = kb.nextInt();
	
	int[] arr = new int[n];
	
	for(int i = 0; i < n; i++) {
		arr[i] = kb.nextInt();
	}
	
	System.out.print(T.solution(n, m, arr));
}
}
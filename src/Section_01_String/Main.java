package Section_01_String;

import java.util.Scanner;

public class Main {
	
	
	// �Ű������� (teachermode, e) 2���� ���� �Ѿ� �Դ�.
	public int[] solution(String s, char t) {
		// teachermod == s.length == 10
		int[] answer = new int[s.length()];
		
		// �� ���ڰ� �ڱ��� ���� e�� ������ �Ÿ��� ���ϴ� ��, (������� ->)
		// ��������� -> �϶� t�� ���� ���ĺ��� ã�� p�� 0���� �ʱ�ȭ ���ֱ� ������ 1000�� ���� �������. 
		int p = 1000;
		for(int i = 0; i < s.length(); i++) { // 0~9
			// p�� 0���� �ʱ�ȭ�Ȱ��� t�� index�� �ش��ϴ� ���ĺ��� ���ٴ� ���̰� �������� �񱳰� ���۵ȴ�.
			// �׸��� �ι�°�� p�� 0���� �ʱ�ȭ �Ȱ���, t�� �迭���� 2��° ���Դٴ� ���̰� �ٽ� �Ÿ����Ѵ�.
			if(s.charAt(i) == t) { // t�� index�� �ش��ϴ� �������� ������ p = 0;
				p = 0;
				// answer[i]�� 0���� �ʱ�ȭ�ȴ�.(t�� answer[i]���� �������)
				answer[i] = p;
			} else {
				// answer[i]�� 0�ʱ�ȭ �ǰ� (i+1, p+1)�Ǹ鼭 t�κ��� ������ answer[i]���� ���Ҽ� �ִ�.
				// answer[i]�� t�� ���� ������ �ٽ� p�� �ʱ�ȭ �ϰ� answer[i]�� 0�� �Է��� �Ÿ��� ���Ѵ�.
				p++;
				answer[i] = p;
			}
		}
		
		// �� ���ڰ� �ڱ��� ���� e�� ������ �Ÿ��� ���ϴ� ��, (������� <-)
		p = 1000;
		for(int i = s.length()-1; i >= 0; i--) { // 9~0
			// p�� 0���� �ʱ�ȭ�Ȱ��� t�� index�� �ش��ϴ� ���ĺ��� ���ٴ� ���̰� �������� �񱳰� ���۵ȴ�.
			// �׸��� �ι�°�� p�� 0���� �ʱ�ȭ �Ȱ���, t�� �迭���� 2��° ���Դٴ� ���̰� �ٽ� �Ÿ����Ѵ�.
			if(s.charAt(i) == t) {
				p = 0;
				// answer[i]�� 0���� �ʱ�ȭ�ȴ�.(t�� answer[i]���� �������)
				answer[i] = p;
			} else {
				// answer[i]�� 0�ʱ�ȭ �ǰ� (i-1, p+1)�Ǹ鼭 t�κ��� ������ answer[i]���� ���Ҽ� �ִ�.
				// answer[i]�� t�� ���� ������ �ٽ� p�� �ʱ�ȭ �ϰ� answer[i]�� 0�� �Է��� �Ÿ��� ���Ѵ�.
				p++;
				
				// ������� ->���� ����� t���� �Ÿ� ����, ������� <-���� ����� t���� �Ÿ���(p)
				// �� ���� ���� answer[i]�� �����Ѵ�.
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); // ���ڿ� �Է¹޴´�. ==> teachermode
		char c = kb.next().charAt(0); // ���ڿ� �Է¹޴´�. ==> e
		
		for(int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}
	}
}
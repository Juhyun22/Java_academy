package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		// do-while ��: ������ �����̾ �ѹ��� �����Ѵ�.
		int i = 0; // 0 ~ 2 : 3��
		do {
			System.out.println("�ȳ� " + i);
			i++;
		} while (i < -50);
		
		// 0 ~ 4: 5��
		i = 0;
		while (i < 5) {
			System.out.println("���Ϲ�" + i);
			i++;
		}
		
		// for (�ʱ��; ����; ������) { }
		// 0 ~ 4: 5��
		for (int j = 0; j < 5; j++) {
			System.out.println("for�� " + j);
		}
		
		// 1 ~ 5: 5��
		for (int j = 1; j <= 5 ; j++) {
			System.out.println("���� " + j);
		}
		
		// 5 ~ 1: 5��
		for (int j = 5; j >= 1; j--) {
			System.out.println("����� " + j);
		}
		
		// 1+2+3+...+10 �հ�
		int sum = 0;
		for(int j = 1; j <= 10 ; j++) {
			sum += j;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}






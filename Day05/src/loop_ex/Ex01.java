package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		
//		System.out.println("�ȳ�");
//		System.out.println("�ȳ�");
//		System.out.println("�ȳ�");

		
		// while �ݺ����� �̿��ؼ� "�ȳ�" 3�� ���
		int i = 0; // ī������ �ϱ� ���� ����  i j k
		while (i < 3) {
			System.out.println("�ȳ� " + i); // 0 1 2
			i = i + 1;
		}
		
		// 0 ~ 4: 5��
		i = 0;
		while (i < 5) {
			System.out.println("Hello worls! " + i);
			// i = i + 1;
			// i += 1; // ���� ���� ������
			++i; // ���� ������(����)
			
			// i++; // ���� ������(����)
			
		}
		
		// ++i��     i++ ������
		int number = 1;
		System.out.println("number: " + number); // ���: 1
		System.out.println("++number: " + (++number)); // ���: 2
		
		// ���� ���� �����ڴ� �����ٿ��� +1�� ����ȴ�.
		System.out.println("number++: " + (number++)); // ���: 2
		System.out.println("number: " + number); // ���: 3
		
		// 1 ~ 5: 5��
		i = 1;
		while (i <= 5) {
			System.out.println("�ڵ��� " + i);
			i++;
		}
		
		// 5 ~ 0: 6��
		i = 5;
		while(i >= 0) {
			System.out.println("��ǻ�� " + i);
			i--;
		}
		
		// 1+2+3+4+.....+10 �հ� ���ϱ�
		i = 1;
		int sum = 0;
		while (i <= 10) { // 1 2 3 4 5 6 7 8 9 10
			sum = sum + i; // sum += i;
			i++;
		}
		
		System.out.println("��: " + sum);
	}

}








package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// �ݺ��� - for��
		// 4. 1 ~ 100 ���̿� 7�� ��� ������ ���ϼ���.
		int count = 0;
		for (int i = 7; i <= 100; i += 7) { // �ڵ� ���̱� �߿�!
			count++;
		}
		
		System.out.println("7�� ����� ����: " + count);
		
		
		
		// 5. ������
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: " );
		int number = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
		
		scan.close();
		
	}

}

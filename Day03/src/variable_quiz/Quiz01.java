package variable_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. ��� ������
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("�Է�1 : ");
//		int number1 = scan.nextInt();
//		
//		System.out.print("�Է�2 : ");
//		int number2 = scan.nextInt();
//		
//		int quotient = number1 / number2;
//		int remainder = number1 % number2;
//		
//		System.out.println("��:" + quotient + ", ������:" + remainder);
		
		
		// 2. ��ü (swap �˰���)
//		System.out.print("x : ");
//		int x = scan.nextInt();
//		
//		System.out.print("y : ");
//		int y = scan.nextInt();
//		
//		int temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println("x�� " + x + "�̰�, y�� " + y + " �Դϴ�.");
//		
		
		
		// 3. �� ��ȯ (1�� ���� ���� �ٲٸ� ��)
//		System.out.print("��: ");
//		int seconds = scan.nextInt();
//		
//		// ��, ��
//		int min = seconds / 60;
//		int sec = seconds % 60;
//		
//		System.out.println(min + "�� " + sec + "��");
		
		
		// 4. �ڸ��� �ɰ���
//		System.out.print("�Է� : ");
//		int number = scan.nextInt(); // 1234
//		
//		// 1234 / 1000 => 1.234  ��:1  ������:234
//		// 234 / 100   => 2.34    ��:2  ������:34
//		// 34 / 10     => 3.4      ��:3  ������:4
//		
//		int q = number / 1000; // q = 1
//		int r = number % 1000; // r = 234
//		System.out.println(q); // ���: 1
//		
//		q = r / 100; // q = 2
//		r = r % 100; // r = 34
//		System.out.println(q); // ���: 2
//		
//		q = r / 10; // q = 3
//		r = r % 10; // r = 4
//		System.out.println(q); // ���: 3
//		System.out.println(r);

		
		// 5. �ڸ��� �ɰ��� �� ���ϱ�
		System.out.print("�Է� : ");
		int number = scan.nextInt(); // 1234
		
		// 1234 / 1000 => 1.234  ��:1  ������:234
		// 234 / 100   => 2.34    ��:2  ������:34
		// 34 / 10     => 3.4      ��:3  ������:4
		
		int q = number / 1000; // 1
		int r = number % 1000; // 234
		int sum = q; // �հ�: 1
		
		q = r / 100; // 2
		r = r % 100; // 34
		sum = sum + q; // �հ�: 1 + 2 = 3
		
		q = r / 10; // 3
		r = r % 10; // 4
		sum = sum + q + r; // �հ�: 3 + 3 + 4 = 10
		
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		
		scan.close();
	}

}









package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		// 1. ���� ��� �Ǻ���
//		System.out.print("������ �Է� �ϼ��� : ");
//		int number = scan.nextInt();
//		
//		if (number > 0) {
//			System.out.println("����Դϴ�.");
//		} else if(number < 0) {
//			System.out.println("�����Դϴ�.");
//		} else {
//			System.out.println("0�Դϴ�.");
//		}
//		
		
//		// 2. ���� ���
//		// ������ �Է� �ް� 90 ���̻��̸� A, 80�� �̻� B, 70�� �̻� C, 60�� �̻� D, �׿� F�� ����ϼ���
//		System.out.print("������ �Է� �ϼ��� : ");
//		int score = scan.nextInt();
//		
//		if (score >= 90) { // 90�� �̻�
//			System.out.println("A");
//		} else if (score >= 80) { // 80 ~ 89�� �̻�
//			System.out.println("B");
//		} else if (score >= 70) { // 70 ~ 79�� �̻�
//			System.out.println("C");
//		} else if (score >= 60) { // 60 ~ 69�� �̻�
//			System.out.println("D");
//		} else {                  // 59 ���� 
//			System.out.println("F");
//		}
//		
		// 3. �񸸵� ���ϱ�
		System.out.print("bmi ��ġ�� �Է��ϼ��� : ");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) { // 10 ����
			System.out.println("����");
		} else if (bmi <= 20) { // 11 ~ 20 
			System.out.println("��ü��");
		} else { // 21 ~ 
			System.out.println("��");
		}
		
		
		scan.close();
	}

}

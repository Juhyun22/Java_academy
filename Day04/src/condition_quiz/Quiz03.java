package condition_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		// 1. ��� �հ� ���ϱ�
//		System.out.print("�� ������ �Է��ϼ��� : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		
//		double avg = (score1 + score2) / 2.0;
//		if (avg >= 70) {
//			System.out.println("�հ�");
//		} else {
//			System.out.println("���հ�");
//		}
		
		
//		// 2. ū �� ���ϱ�
//		System.out.print("�� ���� ���� �Է��ϼ��� : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		
//		if (num1 > num2) { // num1�� num2���� �� ŭ
//			if (num1 > num3) { // (num2 ����) num1�� num3���� ŭ 
//				System.out.println(num1);
//			}
//			else {			   // (num2 ����) num3�� num1���� ŭ
//				System.out.println(num3);
//			}
//		} else {
//			if (num2 > num3) { // (num1 ����) num2�� num3���� ŭ
//				System.out.println(num2);
//			}
//		}
//		
//		int max = a;
//		if (b > max) {
//			max = b;
//		} 
//		
//		if (c > max) {
//			max = c;
//		}
//		
//		System.out.println(max);
//		
		
		
//		// 3. ���� ���� �հ� ����
//		System.out.print("����1 : ");
//		int score1 = scan.nextInt(); 
//		System.out.print("����2 : ");
//		int score2 = scan.nextInt();
//		
//		double avg = (score1 + score2) / 2.0;
//		
//		if(score1 <= 50 || score2 <= 50) {
//			if (avg >= 60) {
//				System.out.println("�հ�");
//			} else {
//				System.out.println("���հ�");
//			}
//		} else {
//			System.out.println("����");
//		}
//		
//		
		
		// 4. ���� ���ϱ�
		System.out.print("���� : ");
		int year = scan.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		
		
		
//		// 5. ������
//		System.out.print("�� ���¸� �Է��ϼ��� : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		
//		int sum = num1 + num2 + num3 + num4;
//		
//		switch (sum) {
//		case 1:
//			System.out.println("��");
//			break;
//		case 2:
//			System.out.println("��");
//			break;
//		case 3:
//			System.out.println("��");
//			break;
//		case 4:
//			System.out.println("��");
//			break;
//		default:
//			System.out.println("��");
//		}
//		
		scan.close();
	}

}

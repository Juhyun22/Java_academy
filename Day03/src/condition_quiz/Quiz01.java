package condition_quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
////		1. ���� ��
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		int number = scan.nextInt();
//		
//		boolean condition = number > 10;
//		
//		if(condition) {
//			System.out.println("10���� Ů�ϴ�.");
//		}
//		if(number < 10) {
//			System.out.println("10���� �۽��ϴ�.");
//		}
//		if(number == 10) {
//			System.out.println("10�� �����ϴ�.");
//		}
//		
		
////		2. �� ��	
//		System.out.print("�� ���� ���� �Է��ϼ��� : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if(a > b) {
//			System.out.println(a + "�� �� Ů�ϴ�.");
//		}
//		
//		if(a < b) {
//			System.out.println(b + "�� �� Ů�ϴ�.");
//		}
//		
//		if(a == b) {
//			System.out.println(a + "��" + b + "�� �����ϴ�.");
//		}
		
////		3. ���� �հ�
//		System.out.print("������ �Է��ϼ��� : ");
//		int score = scan.nextInt();
//		
//		if(score >= 70) {
//			System.out.println("�հ��Դϴ�.");
//		}
//		if(score < 70) {
//			System.out.println("���հ��Դϴ�.");
//		}
//		
// 		4. Ȧ¦ �˻�
		System.out.print("���� �Է��ϼ��� : ");
		int sniff = scan.nextInt();
		
		boolean isEven = sniff % 2 == 0;
		
		// ¦��: 2�� ������ �������� ��
		if(!isEven) {
			System.out.println("Ȧ��");
		}
		// Ȧ��: 2�� ������ �������� �ʴ� ��
		if(isEven) {
			System.out.println("¦��");
		}
		
		scan.close();
	}
	
}

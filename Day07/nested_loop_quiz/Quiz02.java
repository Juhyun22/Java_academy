package nested_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
//		1. 2�� ���� �Լ�
		System.out.print("�������� ���� ���ڸ� �Է��ϼ���: ");
		int number = scan.nextInt();
		System.out.println(number + "�� ������ " + getSquared(number) + "�̴�.");
		System.out.println();
		
//		2. ��� ���ϱ� �Լ�
		System.out.print("������ �Է��ϼ���: ");
		int sc1 = scan.nextInt();
		int sc2 = scan.nextInt();
		int sc3 = scan.nextInt();
		int sc4 = scan.nextInt();
		System.out.println("����� " + getAverage(sc1, sc2, sc3, sc4));
		System.out.println();
		
//		3. ��� ������ ��� �Լ�
		System.out.print("���ڿ� ���� ���� �Է��ϼ���: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
		System.out.println();
		
//		4. Ȧ¦ �Լ�
		System.out.print("���ڸ� �Է��ϼ���: ");
		int even = scan.nextInt();
		System.out.println(evenOrOdd(even));
		System.out.println();
		
		scan.close();
	}
	
	// 1�� �޼ҵ�
	public static int getSquared(int x) {
		return x * x;
	}
	
	// 2�� �޼ҵ�
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4)/ 4.0;
		return result;
	}

	// 3�� �޼ҵ�
	public static void printQuotientRemainder(int number1, int number2) {
		System.out.println("��: " + (number1 / number2));
		System.out.println("������: " + (number1 % number2));
	}
	
	// 4. ¦������ �޼ҵ�
	public static boolean evenOrOdd(int even) {
		if (even % 2 == 0) {
			return true;
		} 
		// return false;
		
		
		// ���� ������, ���� ���ǹ� = ������ if-else ���ٷ� ǥ��
		return even % 2 == 0 ? true : false;
	}
}

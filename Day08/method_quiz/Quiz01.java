package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. �� ���ϱ�. ��, 100�� ������ �ߴ�
//		System.out.print("���� �Է��ϼ���: ");
//		int number = scan.nextInt();
//		
//		System.out.println(getSumUntil100(number));
		
		// 2. �ּڰ� 
//		System.out.print("���� 5���� �Է��ϼ���: ");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int n5 = scan.nextInt();
//		
//		printMin(n1, n2, n3, n4, n5);
		
		// 3. �Ҽ�
		System.out.print("���� �Է��ϼ���: ");
		int number = scan.nextInt();
		
		isPrimeNumber(number);
		
		scan.close();
		
	}
	
	// 1. �� ���ϱ�
	public static int getSumUntil100(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
				return sum;   // break;
			}
		}
		return sum;
	}
	
	// 2. �ּҰ�
	public static void printMin(int n1, int n2, int n3, int n4, int n5) {
		int min = n1;
		if (min > n2) {
			min = n2;
		}
		if (min > n3) {
			min = n3;
		}
		if (min > n4) {
			min = n4;
		}
		if (min > n5) {
			min = n5;
		}
		System.out.println("�ּҰ��� " + min);
	}
	
	// 3. �Ҽ�
	public static boolean isPrimeNumber(int number) {
		// ���ڰ� 10�� ��� 2 3 4 ... 9�� �������
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;   // �ϳ��� ������ �������� �Ҽ��� �ƴϴ�.
			}
		}
		return true;  // number�� 2�� ��� �ݺ����� ���� �ʱ� ������ �� or �ѹ��� ����������� �ʴ� �� 
	}
}






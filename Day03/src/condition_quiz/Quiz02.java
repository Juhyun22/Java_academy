package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. �� ���� �հ�
		System.out.print("�� ������ �Է��ϼ��� : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		boolean score = score1 >= 70 && score2 >= 70;
		
		if(score) {
			System.out.println("�հ��Դϴ�.");
		}
		
//		2. ����� ���ϱ�
//		���� �Է� �޾Ƽ� 2�� 3�� ��������� �Ǻ��ϼ���.
//		�����: ����Ǵ� ���
//		�Է� ����
//
//		���� �Է��ϼ��� : 12
//		��� ����
//
//		2�� 3�� ������Դϴ�.
		System.out.print("���� �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		if(number % 2 == 0 && number % 3 == 0) {
			System.out.println("2 dhk ");
		}
		
		
		
		
	
		scan.close();
	}

}

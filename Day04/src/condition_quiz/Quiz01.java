package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1. �� ���� �հ�
//		�� ���� ������ �Է� �޾Ƽ� �� ���� ��ΰ� 70�� �̻��̸� �հ��Դϴٸ� ����ϼ���.
//		System.out.print("�� ���� ������ �Է��ϼ���: ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		
//		if(score1 >= 70 && score2 >= 70) {
//			System.out.println("�հ��Դϴ�.");
//		}
		
//		// 2. ����� ���ϱ�
//		// ���� �Է� �޾Ƽ� 2�� 3�� ��������� �Ǻ��ϼ���.
//		System.out.print("���� �Է��ϼ���: ");
//		int number = scan.nextInt();
//		if(number % 2 == 0 && number % 3 == 0) {
//			System.out.println("2�� 3�� �������Դϴ�.");
//		}
		
		// 3. ��ȿ�� üũ(validation check)
		System.out.print("1 ~ 10 ������ ���� �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		// number�� 1���� �۰ų� �Ǵ� 10���� ū ��
		if(number < 1 || number > 10) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		scan.close();
	}

}

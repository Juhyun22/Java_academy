package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����: ");
		int year = scan.nextInt();
		
		// 4�� ���������� ����
		
		// 4-1. ��ȿ������ ���
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("����");
				} else {
				System.out.println("���");
				}
			} else {
			System.out.println("����");
			}
		} else {
			System.out.println("���");
		}
		
		// 4-2. if -else if- else
		if (year % 400 == 0) {
			System.out.println("����");
		} else if (year % 100 == 0) {
			System.out.println("���");
		} else if (year % 4 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		
		// 4-3. �� ������
		// 4�� ������ �������� �׸��� 100���� ������ �������� �ʴ� ������ �����̴�.
		// �Ǵ� 
		// 400���� ������ �������� ������ ������ �����̴�.
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		
		
		// 5. ������ 
		System.out.print("�� ���¸� �Է��ϼ��� : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		
		switch (sum) {
		case 1: 
			System.out.println("��");
			break;
		case 2: 
			System.out.println("��");
			break;
		case 3: 
			System.out.println("��");
			break;
		case 4: 
			System.out.println("��");
			break;
		default: 
			System.out.println("��");
		}
		
		scan.close();
		
	}

}








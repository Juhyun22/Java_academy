package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
////		1. �ݺ� ���
//		System.out.print("Ƚ���� �Է��ϼ��� : ");
//		int number = scan.nextInt();
//		
//		int i = 0;
//      while (i < count) {
//			System.out.println("ȭ����!!!");
//			i = i + 1;
//      }
//		while (number > 0) {
//			System.out.println("ȭ����!!!");
//			number--;
//		}
		
////		2. ī��Ʈ �ٿ� "�߻�"
//		System.out.print("ī��Ʈ �ٿ� ���� �Է��ϼ��� : ");
//		int number = scan.nextInt();
//		
//		while (number >= 0) {
//			System.out.println(number);
//			number--;
//		}
//		
//		System.out.println("�߻�");
//		
		
////		3. �ݺ� �Է�
//		int i = 0;
//		
//		while (i < 5) {
//			System.out.print("���� �Է��ϼ���: ");
//			int number = scan.nextInt();
//			System.out.println("��� : " + number);
//			i++;
//		}
//		
	
//		4. ������
		//System.out.print("���� �Է��ϼ��� : ");
		int mul = 3; //scan.nextInt();
		int number = 1; // 1 ~ 9
	
		while (number < 10) {
			System.out.println(mul + " X " + number + " = " + (mul*number));
			number++;
		}
		
		scan.close();
	}

}

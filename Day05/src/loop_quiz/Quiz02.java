package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		1. �ݺ� ���
		for (int i = 35; i <= 40 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // �ٹٲ�
		
		
		
//		2. ī��Ʈ �ٿ� ���
		for(int j = 5; j >= -5; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		
		
//		3. Ư�� ���� ���ϱ�
		// 3-1.
		for (int k = 1; k <= 50; k++) { // 1 ~ 50 
			if (k % 3 == 0) {
				System.out.print(k + " ");
			}
		}
		System.out.println();
		
		
		// 3-2.
		for (int n = 3; n <= 50; n += 3) { // 3 6 9 12 
			System.out.print(n + " ");
		}
		System.out.println();
		
		// ���⵵ (BigO) ���� �ڵ� �ۼ��ض�ФФ̤Ф�
		
//		4. ���� ����
		int count = 0;
		
		for(int l = 1; l <= 100; l++) {
			if (l % 7 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
//		5. ������
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܼ��� �Է��ϼ��� : ");
		int mul = scan.nextInt();

		for (int m = 1; m < 10; m++) {
			System.out.println(mul + " X " + m + " = " + (mul*m));
		}
		
		scan.close();
		
	}

}

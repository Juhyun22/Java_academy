package testing;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		int number = scan.nextInt();
		
//		2. ���� �ﰢ�� ����ϱ�
//		�ﰢ���� ũ�⸦ ��Ÿ���� ���� ���� 3 <= n <= 99�� �Է¹ް� ���� �ﰢ���� ����ϼ���.
//		�Է� ����
//
//		���� �ﰢ���� ũ�⸦ �Է��ϼ���: 3
//		��� ����
//
//		1
//		2 4
//		3 5 6
		int temp = 0;
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					System.out.print((i + 1) + " ");
					temp = i + 1;
				} else {
					temp = temp + number - j;
					System.out.print(temp + " ");
				}
				
			}
			System.out.println();
		}
		
		scan.close();
	}

}

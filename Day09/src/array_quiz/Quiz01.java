package array_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. �迭  �� ����
//		int[] numbers = {3, 5, 2, 10, 39};
//		System.out.print("������ �ε����� ���� �Է��ϼ���: ");
//		int index = scan.nextInt();  // 2
//		int value = scan.nextInt();  // 16
//		
//		numbers[index] = value;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		// 2. ���� ä��
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		int score = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				score += 100 / scores.length;
			}
		}
		
		System.out.println(score + "��");
		
		// 3. �ӱ� ���
//		���� �ñ� : 8500��
//		�ָ�(��,��) �ñ� : 9500��
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int wage = 0;
		for (int i = 0; i < works.length; i++) {
			if (i < 5) {  // ����
				wage += works[i] * 8500;
			} else {  // �ָ�
				wage += works[i] * 9500;
			}
		}
		System.out.println("�����ϰ� �� �ӱ��� " + wage + "��");
		
		// 4. �迭 �� ���� - ¦���� ����
		int[] evens = new int[5];
		
//		for (int i = 0; i < evens.length; ) {
//			System.out.print("���� �Է��ϼ��� : ");
//			int number = scan.nextInt();
//			if (number % 2 == 0) {
//				evens[i] = number;
//				i++;
//			}
//		}
		
		int i = 0;
		while (i < evens.length) {
			System.out.print("���� �Է��ϼ��� : ");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				evens[i] = number;
				i++;
			}
		}
		
		for (int j = 0; j < evens.length; j++) {
			System.out.print(evens[j] + " ");
		}
		System.out.println();
		
		
		scan.close();
		
		
	}

}








package array_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		1. �迭 �� ����
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("������ index�� ���� �Է��ϼ��� : ");
		int ind = scan.nextInt();
		int num = scan.nextInt();
		
		numbers[ind] = num;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		2. ���� ä��
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		int count = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				count++;
			}
		}
		
		System.out.println(count*10 + "��");
		
//		3. �ӱ� ���
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int count1 = 0;
		int count2 = 0;
		int money = 0;
		
		for (int i = 0; i < works.length; i++) {
			if (i < 5) {
				count1 += works[i];
			} else {
				count2 += works[i];
			}
		}
		
		money += count1 * 8500;
		money += count2 * 9500;
		
		System.out.println("�����ϰ� �� �ӱ��� " + money + "��");
		
//		4. �迭 �� ����
//		���̰� 5�� int �迭�� �����.
//		���� ��� �Է� �����鼭, �Է� ���� ���� ¦�� �϶���, �迭�� �����Ѵ�.
//		�迭�� �������� �Է��� �ߴ��ϰ�, ����� ������ ����Ѵ�.
//		�Է� ����
//
//		���� �Է��ϼ��� : 34
//		���� �Է��ϼ��� : 65
//		���� �Է��ϼ��� : 23
//		���� �Է��ϼ��� : 74
//		���� �Է��ϼ��� : 2
//		���� �Է��ϼ��� : 74
//		���� �Է��ϼ��� : 57
//		���� �Է��ϼ��� : 68
//		��� ����
//
//		34 74 2 74 68
		
		int[] make= new int[5];
		int indNum = 0;
		
		while (indNum < make.length) {
			System.out.print("���� �Է��ϼ��� : ");
			int getNum = scan.nextInt();
			
			if (getNum % 2 == 0) {
				make[indNum] = getNum;
				indNum++;
			}
			
		}
		
		for (int i = 0; i < make.length; i++) {
			System.out.print(make[i] + " ");
		}
		System.out.println();

		scan.close();
	
		
	}

}

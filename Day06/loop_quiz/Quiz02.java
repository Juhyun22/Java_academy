package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		1. ���� �Է�
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� �Է��ϼ��� : ");
			int number = scan.nextInt();
			if (number == 0) {
				System.out.println("��");
				break;
			} 
		}
		

//		2. 3�� ����� �� ���ϱ�
		int sum = 0;
		for (int i = 3; i <= 50; i++) {   // 3 4 5 6.... 50
			// ��ŵ: 3�� ����� �ƴ� �� 
			if (i % 3 != 0) { 
				continue;
			} 
			
			// �� ���ϱ� -> 3�� ���
			sum += i;
		}
		System.out.println(sum);
		
		scan.close();
		
		
		
	}
	


}






package loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. �� ���ϱ�
//		System.out.print("���� �Է��ϼ��� : ");
//		int enter = scan.nextInt();
//		
//		int suum = 0;
//		for (int i = 1; i <= enter; i++) {
//			suum += i;
//		}
//		
//		System.out.println(suum);
//		
		
//		2. ���丮��
//		while (true) {
//			System.out.print("���� �Է��ϼ��� : ");
//			int facNum = scan.nextInt();
//		
//			if (facNum <= 10) {
//				int facSum = 1;
//				for (int f = 2; f <= facNum; f++) {
//					facSum *= f; // 1 * 1 * 2 * 3 
//				}
//				System.out.println(facSum);
//				break;
//			} else {
//				System.out.println("10������ ���� �Է����ּ���.");
//				continue;
//			}
//		}
		
//		3. ��� ���ϱ�
		// �߻��� ����.
		
		System.out.print("���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			// ��� : number % i == 0 => ���
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		scan.close();
	}

}

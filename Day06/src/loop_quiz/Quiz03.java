package loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. 합 구하기
//		System.out.print("수를 입력하세요 : ");
//		int enter = scan.nextInt();
//		
//		int suum = 0;
//		for (int i = 1; i <= enter; i++) {
//			suum += i;
//		}
//		
//		System.out.println(suum);
//		
		
//		2. 팩토리얼
//		while (true) {
//			System.out.print("수를 입력하세요 : ");
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
//				System.out.println("10이하의 수를 입력해주세요.");
//				continue;
//			}
//		}
		
//		3. 약수 구하기
		// 발상을 못함.
		
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			// 약수 : number % i == 0 => 출력
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		scan.close();
	}

}

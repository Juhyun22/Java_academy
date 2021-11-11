package nested_loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1. 합 구하기
		System.out.print("수를 입력하세요: ");
		int number = scan.nextInt();
		System.out.println(allSums(number));
		System.out.println();
		
//		2. 최소값
		while (true) {
			System.out.print("5개의 수를 입력하세요 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			int num4 = scan.nextInt();
			int num5 = scan.nextInt();
			if(num1 <= 1000 && num2 <= 1000 && num3 <= 1000 && num4 <= 1000 && num5 <= 1000) {
				getMin(num1, num2, num3, num4, num5);
				break;
			} else {
				System.out.println("입력 가능한 최대값은 1000입니다.");
				continue;
			}
		}
		
			
		scan.close();
	}

	// 1번 메소드
	public static int allSums(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
			if (sum > 100) {
				return sum;
			}
		}
		return sum;
	}
	
	// 2번 메소드
	public static void getMin(int num1, int num2, int num3, int num4, int num5) {
		int min = num1;
		if (min > num2) {
			min = num2;
		}
		if (min > num3) {
			min = num3;
		}
		if (min > num4) {
			min = num4;
		}
		if (min > num5) {
			min = num5;
		}
		
		System.out.println("최소값은 " + min);
	}
	
	
	
	
	
}

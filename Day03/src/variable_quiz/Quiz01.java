package variable_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 몫과 나머지
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("입력1 : ");
//		int number1 = scan.nextInt();
//		
//		System.out.print("입력2 : ");
//		int number2 = scan.nextInt();
//		
//		int quotient = number1 / number2;
//		int remainder = number1 % number2;
//		
//		System.out.println("몫:" + quotient + ", 나머지:" + remainder);
		
		
		// 2. 교체 (swap 알고리즘)
//		System.out.print("x : ");
//		int x = scan.nextInt();
//		
//		System.out.print("y : ");
//		int y = scan.nextInt();
//		
//		int temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println("x는 " + x + "이고, y는 " + y + " 입니다.");
//		
		
		
		// 3. 초 변환 (1번 문제 조금 바꾸면 댐)
//		System.out.print("초: ");
//		int seconds = scan.nextInt();
//		
//		// 분, 초
//		int min = seconds / 60;
//		int sec = seconds % 60;
//		
//		System.out.println(min + "분 " + sec + "초");
		
		
		// 4. 자리수 쪼개기
//		System.out.print("입력 : ");
//		int number = scan.nextInt(); // 1234
//		
//		// 1234 / 1000 => 1.234  몫:1  나머지:234
//		// 234 / 100   => 2.34    몫:2  나머지:34
//		// 34 / 10     => 3.4      몫:3  나머지:4
//		
//		int q = number / 1000; // q = 1
//		int r = number % 1000; // r = 234
//		System.out.println(q); // 출력: 1
//		
//		q = r / 100; // q = 2
//		r = r % 100; // r = 34
//		System.out.println(q); // 출력: 2
//		
//		q = r / 10; // q = 3
//		r = r % 10; // r = 4
//		System.out.println(q); // 출력: 3
//		System.out.println(r);

		
		// 5. 자리수 쪼개고 합 구하기
		System.out.print("입력 : ");
		int number = scan.nextInt(); // 1234
		
		// 1234 / 1000 => 1.234  몫:1  나머지:234
		// 234 / 100   => 2.34    몫:2  나머지:34
		// 34 / 10     => 3.4      몫:3  나머지:4
		
		int q = number / 1000; // 1
		int r = number % 1000; // 234
		int sum = q; // 합계: 1
		
		q = r / 100; // 2
		r = r % 100; // 34
		sum = sum + q; // 합계: 1 + 2 = 3
		
		q = r / 10; // 3
		r = r % 10; // 4
		sum = sum + q + r; // 합계: 3 + 3 + 4 = 10
		
		System.out.println("합계는 " + sum + "입니다.");
		
		scan.close();
	}

}









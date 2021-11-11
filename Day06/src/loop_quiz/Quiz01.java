package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 반복문 - for문
		// 4. 1 ~ 100 사이에 7의 배수 갯수를 구하세요.
		int count = 0;
		for (int i = 7; i <= 100; i += 7) { // 코드 줄이기 중요!
			count++;
		}
		
		System.out.println("7의 배수의 개수: " + count);
		
		
		
		// 5. 구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("변수를 입력하세요: " );
		int number = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
		
		scan.close();
		
	}

}

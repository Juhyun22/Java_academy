package nested_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
//		1. 2의 제곱 함수
		System.out.print("제곱값을 구할 숫자를 입력하세요: ");
		int number = scan.nextInt();
		System.out.println(number + "의 제곱은 " + getSquared(number) + "이다.");
		System.out.println();
		
//		2. 평균 구하기 함수
		System.out.print("점수를 입력하세요: ");
		int sc1 = scan.nextInt();
		int sc2 = scan.nextInt();
		int sc3 = scan.nextInt();
		int sc4 = scan.nextInt();
		System.out.println("평균은 " + getAverage(sc1, sc2, sc3, sc4));
		System.out.println();
		
//		3. 몫과 나머지 출력 함수
		System.out.print("숫자와 나눌 수를 입력하세요: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
		System.out.println();
		
//		4. 홀짝 함수
		System.out.print("숫자를 입력하세요: ");
		int even = scan.nextInt();
		System.out.println(evenOrOdd(even));
		System.out.println();
		
		scan.close();
	}
	
	// 1번 메소드
	public static int getSquared(int x) {
		return x * x;
	}
	
	// 2번 메소드
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4)/ 4.0;
		return result;
	}

	// 3번 메소드
	public static void printQuotientRemainder(int number1, int number2) {
		System.out.println("몫: " + (number1 / number2));
		System.out.println("나머지: " + (number1 % number2));
	}
	
	// 4. 짝수인지 메소드
	public static boolean evenOrOdd(int even) {
		if (even % 2 == 0) {
			return true;
		} 
		// return false;
		
		
		// 삼항 연산자, 삼항 조건문 = 간단한 if-else 한줄로 표현
		return even % 2 == 0 ? true : false;
	}
}

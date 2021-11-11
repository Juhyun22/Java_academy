package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. 두 점수 합격
		System.out.print("두 점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		boolean score = score1 >= 70 && score2 >= 70;
		
		if(score) {
			System.out.println("합격입니다.");
		}
		
//		2. 공배수 구하기
//		수를 입력 받아서 2와 3의 공배수인지 판별하세요.
//		공배수: 공통되는 배수
//		입력 예시
//
//		수를 입력하세요 : 12
//		출력 예시
//
//		2와 3의 공배수입니다.
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		
		if(number % 2 == 0 && number % 3 == 0) {
			System.out.println("2 dhk ");
		}
		
		
		
		
	
		scan.close();
	}

}

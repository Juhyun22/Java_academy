package condition_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		// 1. 평균 합격 구하기
//		System.out.print("두 점수를 입력하세요 : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		
//		double avg = (score1 + score2) / 2.0;
//		if (avg >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		
//		// 2. 큰 값 구하기
//		System.out.print("세 개의 수를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		
//		if (num1 > num2) { // num1이 num2보다 더 큼
//			if (num1 > num3) { // (num2 제외) num1이 num3보다 큼 
//				System.out.println(num1);
//			}
//			else {			   // (num2 제외) num3이 num1보다 큼
//				System.out.println(num3);
//			}
//		} else {
//			if (num2 > num3) { // (num1 제외) num2가 num3보다 큼
//				System.out.println(num2);
//			}
//		}
//		
//		int max = a;
//		if (b > max) {
//			max = b;
//		} 
//		
//		if (c > max) {
//			max = c;
//		}
//		
//		System.out.println(max);
//		
		
		
//		// 3. 과락 포함 합격 여부
//		System.out.print("점수1 : ");
//		int score1 = scan.nextInt(); 
//		System.out.print("점수2 : ");
//		int score2 = scan.nextInt();
//		
//		double avg = (score1 + score2) / 2.0;
//		
//		if(score1 <= 50 || score2 <= 50) {
//			if (avg >= 60) {
//				System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}
//		} else {
//			System.out.println("과락");
//		}
//		
//		
		
		// 4. 윤년 구하기
		System.out.print("연도 : ");
		int year = scan.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		
		
//		// 5. 윷놀이
//		System.out.print("윷 상태를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		
//		int sum = num1 + num2 + num3 + num4;
//		
//		switch (sum) {
//		case 1:
//			System.out.println("도");
//			break;
//		case 2:
//			System.out.println("개");
//			break;
//		case 3:
//			System.out.println("걸");
//			break;
//		case 4:
//			System.out.println("윷");
//			break;
//		default:
//			System.out.println("도");
//		}
//		
		scan.close();
	}

}

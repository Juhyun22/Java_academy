package array_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열  값 변경
//		int[] numbers = {3, 5, 2, 10, 39};
//		System.out.print("변경할 인덱스와 값을 입력하세요: ");
//		int index = scan.nextInt();  // 2
//		int value = scan.nextInt();  // 16
//		
//		numbers[index] = value;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		// 2. 점수 채점
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		int score = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				score += 100 / scores.length;
			}
		}
		
		System.out.println(score + "점");
		
		// 3. 임금 계산
//		평일 시급 : 8500원
//		주말(토,일) 시급 : 9500원
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int wage = 0;
		for (int i = 0; i < works.length; i++) {
			if (i < 5) {  // 평일
				wage += works[i] * 8500;
			} else {  // 주말
				wage += works[i] * 9500;
			}
		}
		System.out.println("일주일간 총 임금은 " + wage + "원");
		
		// 4. 배열 값 변경 - 짝수만 저장
		int[] evens = new int[5];
		
//		for (int i = 0; i < evens.length; ) {
//			System.out.print("수를 입력하세요 : ");
//			int number = scan.nextInt();
//			if (number % 2 == 0) {
//				evens[i] = number;
//				i++;
//			}
//		}
		
		int i = 0;
		while (i < evens.length) {
			System.out.print("수를 입력하세요 : ");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				evens[i] = number;
				i++;
			}
		}
		
		for (int j = 0; j < evens.length; j++) {
			System.out.print(evens[j] + " ");
		}
		System.out.println();
		
		
		scan.close();
		
		
	}

}








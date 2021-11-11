package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
////		1. 반복 출력
//		System.out.print("횟수를 입력하세요 : ");
//		int number = scan.nextInt();
//		
//		int i = 0;
//      while (i < count) {
//			System.out.println("화이팅!!!");
//			i = i + 1;
//      }
//		while (number > 0) {
//			System.out.println("화이팅!!!");
//			number--;
//		}
		
////		2. 카운트 다운 "발사"
//		System.out.print("카운트 다운 수를 입력하세요 : ");
//		int number = scan.nextInt();
//		
//		while (number >= 0) {
//			System.out.println(number);
//			number--;
//		}
//		
//		System.out.println("발사");
//		
		
////		3. 반복 입력
//		int i = 0;
//		
//		while (i < 5) {
//			System.out.print("수를 입력하세요: ");
//			int number = scan.nextInt();
//			System.out.println("출력 : " + number);
//			i++;
//		}
//		
	
//		4. 구구단
		//System.out.print("수를 입력하세요 : ");
		int mul = 3; //scan.nextInt();
		int number = 1; // 1 ~ 9
	
		while (number < 10) {
			System.out.println(mul + " X " + number + " = " + (mul*number));
			number++;
		}
		
		scan.close();
	}

}

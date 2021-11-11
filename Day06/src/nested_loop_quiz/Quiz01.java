package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {
//		1. 주사위 문제
//		for (int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6; j++) {
//				System.out.print("(" + i + ", " + j + ")");
//			}
//			System.out.println();
//		}
//		System.out.println("주사위 끝!");
//		System.out.println();
//		
		
//		2. 구구단
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " X " + j + " = " + (i * j));
//			}
//		}
//		System.out.println("구구단 끝!");
//		System.out.println();
		
//		3. 별찍기
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
		
		
//		4. 거꾸로 된 삼각형
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		5. 피라미드
//		아래 형태처럼 *을 출력하세요.
//		출력 예시
//
//		    *        1개  빈칸: 4개
//		   ***       3개  빈칸: 3개
//		  *****      5개  빈칸: 2개
//		 *******     7개  빈칸: 1개
//		*********    9개  빈칸: 0개
		// 빈칸 네개
		// 한번 찍고
		// 빈칸 세개
		// 세개 찍거
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < 10; j = j + 2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
		
}



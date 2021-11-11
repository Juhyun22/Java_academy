package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		1. 반복 출력
		for (int i = 35; i <= 40 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		
		
//		2. 카운트 다운 출력
		for(int j = 5; j >= -5; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		
		
//		3. 특정 조건 구하기
		// 3-1.
		for (int k = 1; k <= 50; k++) { // 1 ~ 50 
			if (k % 3 == 0) {
				System.out.print(k + " ");
			}
		}
		System.out.println();
		
		
		// 3-2.
		for (int n = 3; n <= 50; n += 3) { // 3 6 9 12 
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 복잡도 (BigO) 낮은 코드 작성해라ㅠㅠㅜㅠㅠ
		
//		4. 갯수 세기
		int count = 0;
		
		for(int l = 1; l <= 100; l++) {
			if (l % 7 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
//		5. 구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int mul = scan.nextInt();

		for (int m = 1; m < 10; m++) {
			System.out.println(mul + " X " + m + " = " + (mul*m));
		}
		
		scan.close();
		
	}

}

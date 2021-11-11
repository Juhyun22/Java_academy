package testing;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int number = scan.nextInt();
		
//		2. 숫자 삼각형 출력하기
//		삼각형의 크기를 나타내는 양의 정수 3 <= n <= 99를 입력받고 숫자 삼각형을 출력하세요.
//		입력 예시
//
//		숫자 삼각형의 크기를 입력하세요: 3
//		출력 예시
//
//		1
//		2 4
//		3 5 6
		int temp = 0;
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					System.out.print((i + 1) + " ");
					temp = i + 1;
				} else {
					temp = temp + number - j;
					System.out.print(temp + " ");
				}
				
			}
			System.out.println();
		}
		
		scan.close();
	}

}

package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도: ");
		int year = scan.nextInt();
		
		// 4로 나누어지면 윤년
		
		// 4-1. 비효율적인 방법
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("윤년");
				} else {
				System.out.println("평년");
				}
			} else {
			System.out.println("윤년");
			}
		} else {
			System.out.println("평년");
		}
		
		// 4-2. if -else if- else
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 100 == 0) {
			System.out.println("평년");
		} else if (year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		// 4-3. 논리 연산자
		// 4로 나누어 떨어지고 그리고 100으로 나누어 떨어지지 않는 연도는 윤년이다.
		// 또는 
		// 400으로 나누어 떨어지는 연도는 무조건 윤년이다.
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		
		// 5. 윷놀이 
		System.out.print("윷 상태를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		
		switch (sum) {
		case 1: 
			System.out.println("도");
			break;
		case 2: 
			System.out.println("개");
			break;
		case 3: 
			System.out.println("걸");
			break;
		case 4: 
			System.out.println("윷");
			break;
		default: 
			System.out.println("모");
		}
		
		scan.close();
		
	}

}








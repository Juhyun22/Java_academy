package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 합 구하기. 단, 100이 넘으면 중단
//		System.out.print("수를 입력하세요: ");
//		int number = scan.nextInt();
//		
//		System.out.println(getSumUntil100(number));
		
		// 2. 최솟값 
//		System.out.print("숫자 5개를 입력하세요: ");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int n5 = scan.nextInt();
//		
//		printMin(n1, n2, n3, n4, n5);
		
		// 3. 소수
		System.out.print("수를 입력하세요: ");
		int number = scan.nextInt();
		
		isPrimeNumber(number);
		
		scan.close();
		
	}
	
	// 1. 합 구하기
	public static int getSumUntil100(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
				return sum;   // break;
			}
		}
		return sum;
	}
	
	// 2. 최소값
	public static void printMin(int n1, int n2, int n3, int n4, int n5) {
		int min = n1;
		if (min > n2) {
			min = n2;
		}
		if (min > n3) {
			min = n3;
		}
		if (min > n4) {
			min = n4;
		}
		if (min > n5) {
			min = n5;
		}
		System.out.println("최소값은 " + min);
	}
	
	// 3. 소수
	public static boolean isPrimeNumber(int number) {
		// 숫자가 10일 경우 2 3 4 ... 9로 나누어본다
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;   // 하나라도 나누어 떨어지면 소수가 아니다.
			}
		}
		return true;  // number가 2인 경우 반복문을 들어가지 않기 때문에 참 or 한번도 나누어떨어지지 않는 수 
	}
}






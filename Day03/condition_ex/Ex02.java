package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		
		// 10 <= number <= 40 : number가 10 이상이고 40 이하이다.
		// (그리고, AND) => 둘 다 만족
		if(number >= 10 && number <= 40) {
			System.out.println("number가 10이상이고 40이하이다.");
		}
		
		// number < 10 또는 number > 40 : number가 10보다 작거나 40보다 크다.
		// (또는, OR) => 둘 중 하나만 만족해도 만족
		if(number < 10 || number > 40) {
			System.out.println("number가 10보다 작거나 40보다 크다.");
		}
		
		// 걸음 수, 몸무게
		System.out.print("걸은 수와 몸무게를 입력해주세요: ");
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		// 만약에 걸은 수가 10000보를 초과하면서 몸무게가 60키로 이하이면 "치킨"
		if(walk > 10000 && weight <= 60) {
			System.out.println("둘 다 만족하니 치킨먹자!!");
		}
		
		// 만약에 걸은 수가 10000보를 초과하거나 몸무게가 60키로 이하이면 "치킨"
		if(walk > 10000 || weight <= 60) {
			System.out.println("하나라도 만족하니 치킨 먹자!!");
		}
		
		
		
		scan.close();
	}

}

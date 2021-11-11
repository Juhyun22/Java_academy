package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 : ");
		int weight = scan.nextInt();
		
//		// 몸무게가 60키로 이하이면 치킨, 아니면 샐러드
//		// if - else
//		if(weight <= 70) {
//			System.out.println("치킨");
//		} else {
//			System.out.println("샐러드");
//		}
//		
		// if - else if - else
		if (weight <= 70) { // 70 이하
			System.out.println("치킨");
		} else if (weight <= 75) { // 71 ~ 75 이하
			System.out.println("닭가슴살");
		} else if (weight <= 80) { // 76 ~ 80 이하
			System.out.println("샐러드");
		} else { // 80키로 초과
			System.out.println("굶자");
		}
		
		
		scan.close();
	}

}

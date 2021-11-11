package variable_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1. 마우스 올리고 import
		// 2. ctrl + 1
		// 3. ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		
		System.out.print("육개장 가격을 입력하세요: ");
		int noodleCup = scan.nextInt(); // 숫자를 입력받고 noodleCup 변수에 저장한다.
		System.out.println("육개장 가격은 " + noodleCup +"원");
		
		System.out.print("육개장 개수를 입력하세요: ");
		int count = scan.nextInt();
		// 육개장 n개의 가격은 oo원.
		System.out.println("육개장 " + count + "개의 가격은 " + (noodleCup * count) + "원");
		
		scan.close();
		
	}

}

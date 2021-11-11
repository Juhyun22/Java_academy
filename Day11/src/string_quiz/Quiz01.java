package string_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1. 문자열 입력
//		System.out.print("ID를 입력하세요: ");
//		String id = scan.next();
//		
//		System.out.println("Welcome! " + id);
//		
		
		// 2. e의 개수 찾기
		System.out.print("단어를 입력하세요: ");
		String word = scan.next(); // elephant
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'e') {  // char
				count++;
			}
		}
		
		System.out.println("e의 개수는 " + count + "개 입니다.");
		
		scan.close();
	}

}

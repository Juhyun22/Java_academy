package string_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String word = scan.next(); // 단어만! 입력
		System.out.println(word);
		
		scan.nextLine(); // next()에서 받은 엔터를 날려버린다.
		
		String sentence = scan.nextLine(); // 문장
		System.out.println(sentence);
		
		scan.close();
	}

}

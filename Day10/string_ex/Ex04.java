package string_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է�: ");
		String word = scan.next(); // �ܾ! �Է�
		System.out.println(word);
		
		scan.nextLine(); // next()���� ���� ���͸� ����������.
		
		String sentence = scan.nextLine(); // ����
		System.out.println(sentence);
		
		scan.close();
	}

}

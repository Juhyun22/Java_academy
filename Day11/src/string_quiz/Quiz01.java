package string_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1. ���ڿ� �Է�
//		System.out.print("ID�� �Է��ϼ���: ");
//		String id = scan.next();
//		
//		System.out.println("Welcome! " + id);
//		
		
		// 2. e�� ���� ã��
		System.out.print("�ܾ �Է��ϼ���: ");
		String word = scan.next(); // elephant
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'e') {  // char
				count++;
			}
		}
		
		System.out.println("e�� ������ " + count + "�� �Դϴ�.");
		
		scan.close();
	}

}

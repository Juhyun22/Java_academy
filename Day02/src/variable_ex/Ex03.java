package variable_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1. ���콺 �ø��� import
		// 2. ctrl + 1
		// 3. ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��ϼ���: ");
		int noodleCup = scan.nextInt(); // ���ڸ� �Է¹ް� noodleCup ������ �����Ѵ�.
		System.out.println("������ ������ " + noodleCup +"��");
		
		System.out.print("������ ������ �Է��ϼ���: ");
		int count = scan.nextInt();
		// ������ n���� ������ oo��.
		System.out.println("������ " + count + "���� ������ " + (noodleCup * count) + "��");
		
		scan.close();
		
	}

}

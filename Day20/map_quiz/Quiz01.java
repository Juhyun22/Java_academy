package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// �ڷᱸ�� Ȱ�� �߰�����2 - ���� ����
		// List �Է�, ���, �����ϱ�
		Scanner scan = new Scanner(System.in);
		List<String> fruits = new ArrayList<>(); // []

		while (true) {
			System.out.println("1:�Է� / 2:��� / 3:���� / 4:����");
			int number = scan.nextInt();

			if (number == 1) {
				// �Է�
				System.out.print("���� �̸��� �Է��ϼ��� : ");
				String fruit = scan.next();
				String result = fruits.add(fruit) ? "�Է� ����" : "�Է� ����";
				System.out.println(result);
			} else if (number == 2) {
				// ���
				if (fruits.isEmpty()) {
					System.out.println("����ֽ��ϴ�.");
					continue;
				}
				
				Iterator<String> iter = fruits.iterator();
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}
//				for (String fruit : fruits) {
//					System.out.println(fruit);
//				}
			} else if (number == 3) {
				// ����
				System.out.println("������ ���� �̸��� �Է����ּ��� : ");
				String delFruit = scan.next();
				System.out.println(fruits.remove(delFruit) ? "���� ����" : "���� ����");
			} else if (number == 4) {
				// ����
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		scan.close();
	}

}

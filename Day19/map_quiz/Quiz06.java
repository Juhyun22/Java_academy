package map_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		while (true) {
			System.out.println("1:�Է� / 2:��� / 3:����  / 4:����");
			int num = scan.nextInt();

			if (num == 1) {
				// �Է�
				System.out.print("���� �̸��� �Է��ϼ���: ");
				String fruit = scan.next();
				list.add(fruit);
				System.out.println("�Է� ����");
			} else if (num == 2) {
				// ���
				if (list.isEmpty()) {
					System.out.println("����ֽ��ϴ�.");
				} else {
					for (String fruit : list) {
						System.out.println(fruit);
					}
				}
			} else if (num == 3) {
				// ����
				System.out.print("������ ���� �̸��� �Է��ϼ���: ");
				String fruit = scan.next();
				list.remove(fruit);
				System.out.println("���� ����");
			} else if (num == 4) {
				// ��
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}

		scan.close();

	}

}

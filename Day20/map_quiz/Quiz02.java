package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Person> personList = new ArrayList<>();

		while (true) {
			System.out.println("1:�Է� / 2:��� / 3:���� / 4:����");
			int number = scan.nextInt();

			if (number == 1) {
				System.out.println("�̸��� �Է����ּ���.");
				String name = scan.next();
				System.out.println("��������� �Է����ּ���.");
				int birth = scan.nextInt();

				Person personClass = new Person(name, birth);
				System.out.println(personList.add(personClass) ? "����" : "����");
			} else if (number == 2) {
				if (personList.isEmpty()) {
					System.out.println("����ֽ��ϴ�.");
					continue;
				}
				// �� �ȵ� �κ�
				// Person�� toString�� �������̵��ϸ� ����� ������ ���ڰ� ��µȴ�.
				System.out.println(personList);
			} else if (number == 3) {
				System.out.println("������ ����� �Է��ϼ��� : ");
				String delName = scan.next();

				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					Person name = iter.next();
					if (name.getName().equals(delName)) {
						// personList.remove(name);
						iter.remove(); // �׶��� �̸��� ���� ���� ����
					} else {
						System.out.println("���� ����");
					}
				}
			} else if (number == 4) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}

		scan.close();
	}

}

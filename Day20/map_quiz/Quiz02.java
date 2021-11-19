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
			System.out.println("1:입력 / 2:출력 / 3:삭제 / 4:종료");
			int number = scan.nextInt();

			if (number == 1) {
				System.out.println("이름을 입력해주세요.");
				String name = scan.next();
				System.out.println("생년월일을 입력해주세요.");
				int birth = scan.nextInt();

				Person personClass = new Person(name, birth);
				System.out.println(personList.add(personClass) ? "성공" : "실패");
			} else if (number == 2) {
				if (personList.isEmpty()) {
					System.out.println("비어있습니다.");
					continue;
				}
				// 잘 안된 부분
				// Person의 toString을 오버라이드하면 사람의 정보가 예쁘게 출력된다.
				System.out.println(personList);
			} else if (number == 3) {
				System.out.println("삭제할 사람을 입력하세요 : ");
				String delName = scan.next();

				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					Person name = iter.next();
					if (name.getName().equals(delName)) {
						// personList.remove(name);
						iter.remove(); // 그때의 이름이 같은 정보 삭제
					} else {
						System.out.println("삭제 실패");
					}
				}
			} else if (number == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}

		scan.close();
	}

}

package map_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		while (true) {
			System.out.println("1:입력 / 2:출력 / 3:삭제  / 4:종료");
			int num = scan.nextInt();

			if (num == 1) {
				// 입력
				System.out.print("과일 이름을 입력하세요: ");
				String fruit = scan.next();
				list.add(fruit);
				System.out.println("입력 성공");
			} else if (num == 2) {
				// 출력
				if (list.isEmpty()) {
					System.out.println("비어있습니다.");
				} else {
					for (String fruit : list) {
						System.out.println(fruit);
					}
				}
			} else if (num == 3) {
				// 삭제
				System.out.print("삭제할 과일 이름을 입력하세요: ");
				String fruit = scan.next();
				list.remove(fruit);
				System.out.println("삭제 성공");
			} else if (num == 4) {
				// 끝
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		scan.close();

	}

}

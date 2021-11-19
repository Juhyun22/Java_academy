package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 자료구조 활용 추가문제2 - 과일 저장
		// List 입력, 출력, 삭제하기
		Scanner scan = new Scanner(System.in);
		List<String> fruits = new ArrayList<>(); // []

		while (true) {
			System.out.println("1:입력 / 2:출력 / 3:삭제 / 4:종료");
			int number = scan.nextInt();

			if (number == 1) {
				// 입력
				System.out.print("과일 이름을 입력하세요 : ");
				String fruit = scan.next();
				String result = fruits.add(fruit) ? "입력 성공" : "입력 실패";
				System.out.println(result);
			} else if (number == 2) {
				// 출력
				if (fruits.isEmpty()) {
					System.out.println("비어있습니다.");
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
				// 삭제
				System.out.println("삭제할 과일 이름을 입력해주세요 : ");
				String delFruit = scan.next();
				System.out.println(fruits.remove(delFruit) ? "삭제 성공" : "삭제 실패");
			} else if (number == 4) {
				// 종료
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		scan.close();
	}

}

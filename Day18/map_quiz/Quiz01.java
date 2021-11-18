package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
//		1. 자료 입력
		Map<String, Integer> scores = new HashMap<>();
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		System.out.println(scores);
		
//		2. 값 수정
		// scores.put("사회", 85);
		scores.put("사회", scores.get("사회") + 5);
		System.out.println(scores);
		
//		3. 값 찾기
		Scanner scan = new Scanner(System.in);

		System.out.print("조회할 과목명을 입력하세요 : ");
		String subject = scan.next();
		if (scores.containsKey(subject)) {
			// 과목명에 해당하는 값 출력
			System.out.println(subject + " : " +scores.get(subject));
		} else {
			System.out.println("자료 없음");
		}
		scan.close();
		
//		4. 값 찾기
//		90점 이상의 모든 과목을 출력하세요.
//		출력 예시
//
//		국어 과학 영어 
		Iterator<String> iter = scores.keySet().iterator();
		while (iter.hasNext()) {
			String subjectt = iter.next();
			int score = scores.get(subjectt);
			if (score >= 90) {
				System.out.print(subjectt + " ");
			}
		}
		System.out.println();
		
//		5. 값 확인
		// 100점 이상이면 출력
		while (iter.hasNext()) {
			String subjectt = iter.next();
			int score = scores.get(subjectt);
			if (score == 100) {
				System.out.println("수상 가능");
				break;
			}
		}
		System.out.println("넘어감");
		
		if (scores.containsValue(100)) {
			System.out.println("수상 가능");
		} else {
			System.out.println("해당 없음");
		}
	}

}

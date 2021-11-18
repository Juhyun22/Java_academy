package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
//		1. 체조 경기 평균 점수
		List<Integer> scores = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		
		scores.sort(Comparator.naturalOrder()); // 오름차순 정렬
		
		int sum = 0;
		for (int i = 1; i < scores.size() - 1; i++) {
			sum += scores.get(i);
		}
		
		double average = (double)sum / (scores.size() - 2);
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);
		
//		2. 회원 추가하기
//		회원관리 리스트를 만든다.
//
//		[우솝, 루피, 상디, 나미, 로빈]
//		새로 입력할 이름을 기존 리스트에 추가한다.
//		만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//		(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
//
//		보람
//		루피
//		쵸파
//		로빈
//		루피
//		출력 예시
//
//		[우솝, 루피, 상디, 나미, 로빈, 보람, 루피1, 쵸파, 로빈1, 루피2]
		List<String> members = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> newMembers = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피"));
		
		for (int i = 0; i < members.size(); i++) {
			for (int j = 0; j < newMembers.size(); j++) {
				if (members.contains(newMembers.get(j))) {
					System.out.print(newMembers.get(j) + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println(members);
		
	}

}

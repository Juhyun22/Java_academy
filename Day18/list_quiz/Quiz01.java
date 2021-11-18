package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		// 2. 회원 추가하기
		// 1) 새로운 이름에 숫자들을 붙이고, 마지막에 names에 모두 addAll한다.
		// 기준이 되는 이름으로 돌리고 있어서 add를 하면 오류가 뜸. 복잡해져서
		List<String> names = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> newNames = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피"));

		for (int i = 0; i < names.size(); i++) { // 기존 이름, 기준
			int count = 0;
			for (int j = 0; j < newNames.size(); j++) { // 새로 추가할 이름
				if (names.get(i).equals(newNames.get(j))) {
					count++;
					newNames.set(j, newNames.get(j) + count);
				}
			}
		}
		names.addAll(newNames);
		System.out.println("1번째 방법: " + names);

		// 2) 새 이름들 기준으로 반복문으로 돌면서 names(기존 리스트)에 있는지 확인하고
		// 없으면: names에 추가
		// 있으면: 숫자를 붙혀서 names에 추가
		List<String> names1 = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> newNames1 = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피"));
		int count1 = 1;
		for (int i = 0; i < newNames1.size(); i++) { // 새로 추가할 이름들
			if (names1.contains(newNames1.get(i))) { // 동명이인이 있는 경우 / 숫자가 있는 애들이 있냐??
				String name1 = newNames1.get(i) + count1; // 동명이인인 경우 숫자를 붙힌다
				// 숫자를 붙힌 이름도 있는지 확인
				if (names1.contains(name1)) {
					count1++;
					i--; // 머무르게 하기
					continue; // 다시 숫자 있는지 없는지 확인
				}
				names1.add(name1);
				count1 = 1; // 저장 후 count1을 1로 초기화 
			} else {
				// 동명이인이 없는 경우 바로 저장
				names1.add(newNames1.get(i));
			}
		}
		System.out.println("2번째 방법: " + names1);

		// 3) 2)번과 같은 방법 다른 풀이
		List<String> members = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> newMembers = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피"));
		for(int i = 0; i < newMembers.size(); i++) {
			String newMember = newMembers.get(i);
			Integer count = 1;
			while(members.contains(newMember)) {
				newMember = newMembers.get(i) + count;
				count++;
			}
			members.add(newMember);
		}
		
		System.out.println("3번째 방법: " + members);
	} // main

} // class

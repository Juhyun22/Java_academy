package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Quiz05 {
	public static void main(String[] args) {
		Map<String, String> myCharacter = new HashMap<>();
		myCharacter.put("닉네임", "마로비아나");
		myCharacter.put("직업", "마법사");
		myCharacter.put("서버", "B");
		myCharacter.put("레벨", "38");

		// [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
		List<Map<String, String>> charaters = new ArrayList<>();
		Map<String, String> character1 = new HashMap<>();
		character1.put("닉네임", "사자고양이");
		character1.put("직업", "전사");
		character1.put("서버", "A");
		character1.put("레벨", "11");
		charaters.add(character1);

		Map<String, String> character2 = new HashMap<>();
		character2.put("닉네임", "하구루");
		character2.put("직업", "마법사");
		character2.put("서버", "B");
		character2.put("레벨", "46");
		charaters.add(character2);

		Map<String, String> character3 = new HashMap<>();
		character3.put("닉네임", "바다");
		character3.put("직업", "힐러");
		character3.put("서버", "B");
		character3.put("레벨", "23");
		charaters.add(character3);

		Map<String, String> character4 = new HashMap<>();
		character4.put("닉네임", "초보");
		character4.put("직업", "힐러");
		character4.put("서버", "A");
		character4.put("레벨", "4");
		charaters.add(character4);

		Map<String, String> character5 = new HashMap<>();
		character5.put("닉네임", "린다G");
		character5.put("직업", "힐러");
		character5.put("서버", "B");
		character5.put("레벨", "84");
		charaters.add(character5);

		// TODO: 구현 by me
		int i = 0;
		int level = 0;
		String name = "";
		while (i < charaters.size()) {
			Map<String, String> eachCharacter = charaters.get(i);
			int tempL = Integer.valueOf(eachCharacter.get("레벨"));
			String tempN = eachCharacter.get("닉네임");
			
			if (eachCharacter.get("서버").equals(myCharacter.get("서버"))) {
				if (eachCharacter.get("직업").equals("힐러")) {
					System.out.println(eachCharacter);
					if (level < tempL) {
						level = tempL;
						name = tempN;
					}
				}
			}
			i++;
		}
		System.out.println("레벨이 더 높은 사람은 : " + name);
		System.out.println();
		
		
		// 구현 by teacher
		Map<String, String> maxCharacter = null;
		Integer maxLevel = 0;
		Iterator<Map<String, String>> iter = charaters.iterator();
		while (iter.hasNext()) {
			Map<String, String> character = iter.next();
			if (character.get("서버").equals(myCharacter.get("서버"))
					&& character.get("직업").equals("힐러")) {
				
				Integer levell = Integer.valueOf(character.get("레벨"));
				if (levell > maxLevel) {
					maxLevel = levell;
					maxCharacter = character;
				}
				
				// System.out.println(character);
			}
		}
		
		System.out.println(maxCharacter);
		
	} // main
} // class





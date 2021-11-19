package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
//		Map 활용하기
		Map<String, Character> map = new HashMap<>();
		map.put("유재석", 'X');
		map.put("박나래", 'X');
		map.put("이지은", 'X');
		map.put("서장훈", 'X');
		map.put("이광수", 'X');
		
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String name = iter.next(); // key
			if (name.startsWith("이")) {
				map.put(name, 'O');
			}
		}
		
		System.out.println(map);
	}

}

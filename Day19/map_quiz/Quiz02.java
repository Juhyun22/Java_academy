package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
//		Map Ȱ���ϱ�
		Map<String, Character> map = new HashMap<>();
		map.put("���缮", 'X');
		map.put("�ڳ���", 'X');
		map.put("������", 'X');
		map.put("������", 'X');
		map.put("�̱���", 'X');
		
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String name = iter.next(); // key
			if (name.startsWith("��")) {
				map.put(name, 'O');
			}
		}
		
		System.out.println(map);
	}

}

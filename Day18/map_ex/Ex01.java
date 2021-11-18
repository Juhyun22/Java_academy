package map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Map
		// 1. key-value 쌍으로 이루어져 있다.
		// 2. key는 중복되지 않지만, value는 중복이 가능 (주민번호-이름)
		// 3. key를 통해서 value를 아주 빠르게 찾을 수 있다.
		// 4. value로는 key를 찾기 어렵다.
		// key와 value따로 설정 가능
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		System.out.println(map1);
		
		// key로 값 가져오기
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		// 값 수정: 기존에 있는 키에 put을 하면 수정됨
		map1.put("b", 200);
		System.out.println(map1);
		
		// "c"라는 키가 존재하는가?
		System.out.println(map1.containsKey("c")); // true
		 
		// value중에 5가 있는가?
		System.out.println(map1.containsValue(5)); // false
		
		// map의 크기
		System.out.println(map1.size());
		
		// key만 가져오기.. key확보되면 언제든 value를 가지고 올 수 있음.
		Set<String> keys = map1.keySet();
		System.out.println("keys: " + keys);
		
		// value만 가져오기
		Collection<Integer> values = map1.values();
		System.out.println("values: " + values);
		
		// 키로 값 요소 삭제하기
		Integer deletedValue = map1.remove("c");
		System.out.println(deletedValue);
		System.out.println(map1);
		
		// 키와 값으로 삭제하기
		map1.remove("d", 4);
		System.out.println(map1);
		
		// map에 map 추가하기
		Map<String, Integer> map2 = new HashMap<>();
		map2.putAll(map1);
		System.out.println(map2);
	}

}

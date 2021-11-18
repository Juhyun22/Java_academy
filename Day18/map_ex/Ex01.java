package map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Map
		// 1. key-value ������ �̷���� �ִ�.
		// 2. key�� �ߺ����� ������, value�� �ߺ��� ���� (�ֹι�ȣ-�̸�)
		// 3. key�� ���ؼ� value�� ���� ������ ã�� �� �ִ�.
		// 4. value�δ� key�� ã�� ��ƴ�.
		// key�� value���� ���� ����
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		System.out.println(map1);
		
		// key�� �� ��������
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		// �� ����: ������ �ִ� Ű�� put�� �ϸ� ������
		map1.put("b", 200);
		System.out.println(map1);
		
		// "c"��� Ű�� �����ϴ°�?
		System.out.println(map1.containsKey("c")); // true
		 
		// value�߿� 5�� �ִ°�?
		System.out.println(map1.containsValue(5)); // false
		
		// map�� ũ��
		System.out.println(map1.size());
		
		// key�� ��������.. keyȮ���Ǹ� ������ value�� ������ �� �� ����.
		Set<String> keys = map1.keySet();
		System.out.println("keys: " + keys);
		
		// value�� ��������
		Collection<Integer> values = map1.values();
		System.out.println("values: " + values);
		
		// Ű�� �� ��� �����ϱ�
		Integer deletedValue = map1.remove("c");
		System.out.println(deletedValue);
		System.out.println(map1);
		
		// Ű�� ������ �����ϱ�
		map1.remove("d", 4);
		System.out.println(map1);
		
		// map�� map �߰��ϱ�
		Map<String, Integer> map2 = new HashMap<>();
		map2.putAll(map1);
		System.out.println(map2);
	}

}

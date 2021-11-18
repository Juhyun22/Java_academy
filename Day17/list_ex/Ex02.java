package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		
		// 1. index ������� ����ϱ�(�迭)
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i) + " "); // �迭�� [i] => get(i)
			
			// ���࿡ b�� �����ϴ� ������ ����
			if (fruits.get(i).startsWith("b")) {
				fruits.remove(i);
				i--; // ������ �� �� �ѹ� �� ������ ���� i-- ��Ų��.
			}
		}
		System.out.println();
		
		// 2. Iterator ����ϱ� (����Ű�� ��)
		Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {
			String fruit = iter.next(); // next() ȣ�� �� ������ �Һ� �ǹǷ� �ݺ������� �ѹ��� �����ϴ°� ����.
			System.out.print(fruit + " ");
			
			// b�� �����ϴ� ���� ����
			if (fruit.startsWith("b")) {
				iter.remove(); // ����Ʈ���� ���� ������ �ƴϰ� iterator�� remove�� �����ؾ��Ѵ�.
			}
		}
		System.out.println();
		System.out.println(fruits);
		
		// 3. ���� for��
		// money in pocket
		// ��¿�.. �߰��� �����Ϸ��� ���� ������!
		// �ڹ� �������� ������ �ٸ��� ������ �߰��� ���� �������� �� �� 
		for (String fruit :fruits) {
			System.out.print(fruit + " ");
			
			if (fruit.startsWith("b")) {
				fruits.remove(fruit);
			}
		}
		System.out.println();
		System.out.println(fruits);
		
	}

}

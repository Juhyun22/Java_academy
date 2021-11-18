package set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Set
		// 1. �ߺ����� �ʴ´�.
		// 2. �ε��� ����� �ƴϴ�.
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		System.out.println(set1.add(3)); // �ߺ��� ���� ������ �� ����.
		System.out.println(set1);

		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set2.addAll(set1);
		System.out.println(set2);

		// set2�� 10�� �ִ°�?
		System.out.println(set2.contains(10));
		// set2�� 100�� �ִ°�?
		System.out.println(set2.contains(100));
		
		// set2 - set1 ������
		set2.removeAll(set1);
		System.out.println(set2);
		
		// �ݺ������� ����ϱ�
		
		// 1. Iterator
		Iterator<Integer> iter = set1.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 2. ���� for��
		for (Integer element : set1) {
			System.out.print(element + " ");
		}
		System.out.println();
		
	}
}
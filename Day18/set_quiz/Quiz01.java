package set_quiz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		// Q. 1234, 3456 �� ������, ������, �������� ���ϼ���.

		// 1234, 3456 ���� �����Ѵ�.
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

		// �Ʒ� ��ü�� ����� �����Ѵ�.(���� ������ set1�� �� ������ ���� �ʰ� �ϱ� ����)
		Set<Integer> union = new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		System.out.println("������: " + union);

		Set<Integer> difference = new HashSet<>();
		difference.addAll(set1);
		difference.removeAll(set2);
		System.out.println("������ : " + difference);

		Set<Integer> intersection = new HashSet<>();
		intersection.addAll(set1);
		intersection.retainAll(set2);
		System.out.println("������ : " + intersection);
	}

}

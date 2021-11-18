package list_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 9, 1));
		
		// List�� ���� 5�� ����ִ°�?
		boolean containValue = list.contains(5); // ture
		System.out.println(containValue);
		// List�� ���� 7�� ����ִ°�?
		System.out.println(list.contains(7)); // false
		
		// �������� ����
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		// ��������
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		// ����Ʈ�� ����ִ��� Ȯ��
		System.out.println("����Ʈ�� ��� �ִ°�? " + list.isEmpty());
		
		list.clear();
		
		System.out.println("����Ʈ�� ��� �ִ°�? " + list.isEmpty());
	} // main

} // class

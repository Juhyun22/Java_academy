package list_quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
//		1. List �����
		List<Integer> list = new ArrayList<>();
		list.add(3); 
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(5);
		System.out.println("1�� ���� : " + list);
		
//		2. �� �����ϱ�
		list.set(3, 6);
		System.out.println("2�� ���� : " + list);
	
//		3. �� �����ϱ�
//		list.remove(1); // index�� ����
//		// System.out.println(list);
//		list.remove(5);
//		System.out.println("3�� ���� : " + list);
		Integer value = 8; // ������ ����
		list.remove(value);
		// System.out.println("3�� ���� : " + list);
		
		value = 7;
		list.remove(value);
		System.out.println("3�� ���� : " + list);
	}

}

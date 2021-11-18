package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// �迭(Array)
		// 1. ũ�⸦ �̸� �˰� �־�� �Ѵ�. ũ��� �����Ǿ� �ִ�.
		// 2. �߰��� �ִ� ���� ������ ����ִ� ä�� �����ȴ�.
		// 3. index������� ������ �����ϴ�.
		// 4. �⺻ �ڷ���(primitive type), Ŭ���� �ڷ����� ���� �� �ִ�.
		
		// ����Ʈ(List)
		// 1. ũ�Ⱑ �����Ǿ� ���� �ʰ�, �������� �Ҵ�ȴ�.
		// 2. �߰��� �ִ� ���� ���� ������ �������. (�޸� ���� ����.)
		// 3. ���� ������� �����͸� �ٷ� �� �ִ�.
		// 4. Ŭ���� �ڷ����� ���� �� �ִ�. (�⺻ �ڷ��� ���� �� ����)
		// 5. Ÿ�� �������� ������, generic�� �� �� �ִ�.
		
		// java.util.List
		// List �������̽��� ���� ����ü�� ArratList ���
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println("list1 : " + list1);
		System.out.println("list1 : " + list1.toString());
		
		// List Interface �� Linked List ���
		List<Integer> list2 = new LinkedList<>();
		list2.add(2);
		list2.addAll(list1);
		System.out.println("list2 : " + list2);
		
		// ��� �����ϱ�
		// ����� ù��° ���� ����  2 -> 100���� ����
		System.out.println("���� �ִ� �� : " + list2.set(0, 100));
		System.out.println("���� �� list2 : " + list2);
		
		// ��� �����ϱ�
		Integer deletedNumber = list2.remove(1); // index 1 ��ġ�� �� ����
		System.out.println("������ �� : " + deletedNumber);
		System.out.println("���� �� list2 : " + list2);
		
		Integer number = 100;
		list2.remove(number); // ������ ����(Object)
		System.out.println(list2);
		
		// Integer.valueOf(i) // Integer return
		// Integer.parseInt() // int return 
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("abc");
		strList1.add("qwe");
		System.out.println(strList1);
		
		strList1.remove(1);
		strList1.remove("abc");
		System.out.println(strList1);
		
		System.out.println(list1);
		list1.clear(); // ��� ��� �����ϱ�
		System.out.println(list1);
	} // main

} // class








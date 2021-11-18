package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
//		1. List �����
		// List<Integer> lists = Arrays.asList(20, 3, 5, 84, 17); // ���� �ȵ� ����
		List<Integer> lists = new ArrayList<>(Arrays.asList(20, 3, 5, 84, 17));
		System.out.println(lists);
		
//		2. �ּҰ� ���ϱ�
		int min = lists.get(0);
		for (int i = 1; i < lists.size(); i++) {
			min = min < lists.get(i) ? min : lists.get(i);
		}
		System.out.println("�ּҰ�: " + min);
		
		
//		3. �հ� ���ϱ�
		int sum = 0;
		Iterator<Integer> itor = lists.iterator();
		while (itor.hasNext()) {
//			Integer list = itor.next();
//			sum += list;
			sum += itor.next();
		}
		System.out.println("�� : " + sum);
	}

}

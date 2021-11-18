package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
//		1. �ڷ� �Է�
		Map<String, Integer> scores = new HashMap<>();
		scores.put("����", 90);
		scores.put("����", 85);
		scores.put("����", 90);
		scores.put("��ȸ", 80);
		scores.put("����", 100);
		System.out.println(scores);
		
//		2. �� ����
		// scores.put("��ȸ", 85);
		scores.put("��ȸ", scores.get("��ȸ") + 5);
		System.out.println(scores);
		
//		3. �� ã��
		Scanner scan = new Scanner(System.in);

		System.out.print("��ȸ�� ������� �Է��ϼ��� : ");
		String subject = scan.next();
		if (scores.containsKey(subject)) {
			// ����� �ش��ϴ� �� ���
			System.out.println(subject + " : " +scores.get(subject));
		} else {
			System.out.println("�ڷ� ����");
		}
		scan.close();
		
//		4. �� ã��
//		90�� �̻��� ��� ������ ����ϼ���.
//		��� ����
//
//		���� ���� ���� 
		Iterator<String> iter = scores.keySet().iterator();
		while (iter.hasNext()) {
			String subjectt = iter.next();
			int score = scores.get(subjectt);
			if (score >= 90) {
				System.out.print(subjectt + " ");
			}
		}
		System.out.println();
		
//		5. �� Ȯ��
		// 100�� �̻��̸� ���
		while (iter.hasNext()) {
			String subjectt = iter.next();
			int score = scores.get(subjectt);
			if (score == 100) {
				System.out.println("���� ����");
				break;
			}
		}
		System.out.println("�Ѿ");
		
		if (scores.containsValue(100)) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ش� ����");
		}
	}

}

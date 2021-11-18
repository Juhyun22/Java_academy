package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
//		1. ü�� ��� ��� ����
		List<Integer> scores = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		
		scores.sort(Comparator.naturalOrder()); // �������� ����
		
		int sum = 0;
		for (int i = 1; i < scores.size() - 1; i++) {
			sum += scores.get(i);
		}
		
		double average = (double)sum / (scores.size() - 2);
		System.out.println("�ְ����� �������� ������ ��� ������ " + average);
		
//		2. ȸ�� �߰��ϱ�
//		ȸ������ ����Ʈ�� �����.
//
//		[���, ����, ���, ����, �κ�]
//		���� �Է��� �̸��� ���� ����Ʈ�� �߰��Ѵ�.
//		���� ���������� ���� ��� ȸ���� �ڿ� ���ڸ� ���δ�.
//		(���� �Է��� �̸����� �ٸ� ����Ʈ�� �־�ΰ� �����ϱ�)
//
//		����
//		����
//		����
//		�κ�
//		����
//		��� ����
//
//		[���, ����, ���, ����, �κ�, ����, ����1, ����, �κ�1, ����2]
		List<String> members = new ArrayList<>(Arrays.asList("���", "����", "���", "����", "�κ�"));
		List<String> newMembers = new ArrayList<>(Arrays.asList("����", "����", "����", "�κ�", "����"));
		
		for (int i = 0; i < members.size(); i++) {
			for (int j = 0; j < newMembers.size(); j++) {
				if (members.contains(newMembers.get(j))) {
					System.out.print(newMembers.get(j) + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println(members);
		
	}

}

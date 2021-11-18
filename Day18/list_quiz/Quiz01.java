package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		// 2. ȸ�� �߰��ϱ�
		// 1) ���ο� �̸��� ���ڵ��� ���̰�, �������� names�� ��� addAll�Ѵ�.
		// ������ �Ǵ� �̸����� ������ �־ add�� �ϸ� ������ ��. ����������
		List<String> names = new ArrayList<>(Arrays.asList("���", "����", "���", "����", "�κ�"));
		List<String> newNames = new ArrayList<>(Arrays.asList("����", "����", "����", "�κ�", "����"));

		for (int i = 0; i < names.size(); i++) { // ���� �̸�, ����
			int count = 0;
			for (int j = 0; j < newNames.size(); j++) { // ���� �߰��� �̸�
				if (names.get(i).equals(newNames.get(j))) {
					count++;
					newNames.set(j, newNames.get(j) + count);
				}
			}
		}
		names.addAll(newNames);
		System.out.println("1��° ���: " + names);

		// 2) �� �̸��� �������� �ݺ������� ���鼭 names(���� ����Ʈ)�� �ִ��� Ȯ���ϰ�
		// ������: names�� �߰�
		// ������: ���ڸ� ������ names�� �߰�
		List<String> names1 = new ArrayList<>(Arrays.asList("���", "����", "���", "����", "�κ�"));
		List<String> newNames1 = new ArrayList<>(Arrays.asList("����", "����", "����", "�κ�", "����"));
		int count1 = 1;
		for (int i = 0; i < newNames1.size(); i++) { // ���� �߰��� �̸���
			if (names1.contains(newNames1.get(i))) { // ���������� �ִ� ��� / ���ڰ� �ִ� �ֵ��� �ֳ�??
				String name1 = newNames1.get(i) + count1; // ���������� ��� ���ڸ� ������
				// ���ڸ� ���� �̸��� �ִ��� Ȯ��
				if (names1.contains(name1)) {
					count1++;
					i--; // �ӹ����� �ϱ�
					continue; // �ٽ� ���� �ִ��� ������ Ȯ��
				}
				names1.add(name1);
				count1 = 1; // ���� �� count1�� 1�� �ʱ�ȭ 
			} else {
				// ���������� ���� ��� �ٷ� ����
				names1.add(newNames1.get(i));
			}
		}
		System.out.println("2��° ���: " + names1);

		// 3) 2)���� ���� ��� �ٸ� Ǯ��
		List<String> members = new ArrayList<>(Arrays.asList("���", "����", "���", "����", "�κ�"));
		List<String> newMembers = new ArrayList<>(Arrays.asList("����", "����", "����", "�κ�", "����"));
		for(int i = 0; i < newMembers.size(); i++) {
			String newMember = newMembers.get(i);
			Integer count = 1;
			while(members.contains(newMember)) {
				newMember = newMembers.get(i) + count;
				count++;
			}
			members.add(newMember);
		}
		
		System.out.println("3��° ���: " + members);
	} // main

} // class

package string_quiz;

// import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		// 1. ���ڿ� �˻�
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		
//		int count = 0;
//		for (int i = 0; i < files.length; i++) {
//			if (files[i].endsWith("jpg")) {
//				count++;
//			}
//		}
//		
//		System.out.println("jpg ������ ����: " + count + "��");
//		
//		
//		// 2. �� �ܾ� ����
//		String[] quizWord = {"�¸�" , "���", "��ǻ��", "��Ʈ��"};
//		String[] answerWord = {"victory", "love", "computer", "notebook"};
//		int score = 0;
//		
//		for (int i = 0; i < quizWord.length; i++) {
//			System.out.print((i + 1) + ". " + quizWord[i] + "��(��) ����� �Է��ϼ���: ");
//			String answer = scan.next();
//			
//			if (answer.equals(answerWord[i])) {
//				score += 100 / quizWord.length;
//			}
//		}
//		System.out.println("����: " + score);
//		
//		scan.close();
		
		// 3. ���������� ���� ��
		String memberStr = "������:�۰�ȣ:���켺:�̹���:�۰�ȣ:�̹���:�̹���:������:�̺���:������";
		String[] names = memberStr.split(":");
		int sameCount = 0;
		
		for (int i = 0; i < names.length; i++) {  	// ������ �Ǵ� �̸���
			String name = names[i];  // ���� �̸�
			boolean isSame = false;
			
			if (names[i].equals("-")) {  // ������������ üũ�Ǽ� -�� ��� skip
				continue;
			}
			
			for (int j = i + 1; j < names.length; j++) {  // �񱳵Ǵ� �̸���
				if (name.equals(names[j])) {
					isSame = true;
					names[j] = "-";
				}
			}
			
			if (isSame) { // ��: ���� �̸��� ���ؼ� ���������� ���� �־���.
				sameCount++;
			}
		}
		System.out.println("�������� ���� ��: " + sameCount);
		
	} // main

} // class









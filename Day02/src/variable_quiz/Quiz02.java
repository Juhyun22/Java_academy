package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
//		1. ���� ���
		int score1 = 90;
		int score2 = 80;
		
		char gradeA = 'A';
		char gradeB = 'B';
		
		float total1 = 4.0f;
		float total2 = 3.0f;
		
		System.out.println("���� ������ " + score1 + "�� �̻��̸� '" + gradeA + 
				"'�����̰� ������ " + total1 + "�Դϴ�.");
		System.out.println("���� ������ " + score2 + "�� �̻��̸� '" + gradeB + 
				"'�����̰� ������ " + total2 + "�Դϴ�.");
		System.out.println();
		
		
//		2. �Ǽ� ����
		int number1 = 33;
		double number2 = 35.325;
		
		// double c_number1 = Double.valueOf(number1);
		double sum;
		sum = number1 * number2;
		
		System.out.println("�� ���� �� : " + sum);
		System.out.println();
		
		
//		3. ��¥ ���ϱ�
		int time = 943;
		int date = time / 24; // ���� ��
		int theTime = time % 24; // ���� ������
		
		System.out.println(time + "�ð��� " + date + "�� " + theTime + "�ð� �Դϴ�.");
		System.out.println();
		
		
//		4. ���� ���� ���ϱ�
		int row = 8; // width
		int column = 9; // height
		int res = row * column; // rectangleArea, triangle
		// ��� �ÿ� �Ҽ��� ���� Ȯ���� ������ �Ҽ����� double�� �� �ָ� ����!!
		System.out.println("�簢���� ����: " + res);
		res = res / 2;
		System.out.println("�ﰢ���� ����: " + res);
		System.out.println();
		
	}

}






package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �� ������ ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Ը� �Է��ϼ���: ");
		int weight = scan.nextInt();
		
		// ���࿡ �����԰� 55Ű�� �̸��̸� "ġŲ"
		if(weight < 55) {
			System.out.println("ġŲ ����!");
		}
		
		// ���࿡ �����԰� 100Ű�� �̻��̸� "���̾�Ʈ ����"
		if(weight >= 100) {
			System.out.println("���̾�Ʈ ����!");
		}
		
		// ���࿡ �����԰� 50Ű�� �̸� "����� �����Դ� 50kg �̱���."
		if(weight == 50) {
			System.out.println("����� �����Դ� 50kg �̱���.");
		}
		
		// ���࿡ �����԰� 75kg�� �ƴϸ� "����� �����Դ� 75kg�� �ƴմϴ�."
		if(weight != 75) {
			System.out.println("����� �����Դ� 75kg�� �ƴմϴ�.");
		}
		
		// �� ���� �� �Է¹ް� ��
		System.out.print("�� ���� ���� �Է��ϼ���:");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		// number1�� number2���� ũ��
		if(number1 > number2) {
			System.out.println(number1 + "�� " + number2 + "���� ũ��.");
		}
		
		// number1�� number2�� ����
		if(number1 == number2) {
			System.out.println(number1 + "�� " + number2 + "�� ����.");
		}
		
		scan.close();
	}

}

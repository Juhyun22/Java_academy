package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int number = scan.nextInt();
		
		// 10 <= number <= 40 : number�� 10 �̻��̰� 40 �����̴�.
		// (�׸���, AND) => �� �� ����
		if(number >= 10 && number <= 40) {
			System.out.println("number�� 10�̻��̰� 40�����̴�.");
		}
		
		// number < 10 �Ǵ� number > 40 : number�� 10���� �۰ų� 40���� ũ��.
		// (�Ǵ�, OR) => �� �� �ϳ��� �����ص� ����
		if(number < 10 || number > 40) {
			System.out.println("number�� 10���� �۰ų� 40���� ũ��.");
		}
		
		// ���� ��, ������
		System.out.print("���� ���� �����Ը� �Է����ּ���: ");
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		// ���࿡ ���� ���� 10000���� �ʰ��ϸ鼭 �����԰� 60Ű�� �����̸� "ġŲ"
		if(walk > 10000 && weight <= 60) {
			System.out.println("�� �� �����ϴ� ġŲ����!!");
		}
		
		// ���࿡ ���� ���� 10000���� �ʰ��ϰų� �����԰� 60Ű�� �����̸� "ġŲ"
		if(walk > 10000 || weight <= 60) {
			System.out.println("�ϳ��� �����ϴ� ġŲ ����!!");
		}
		
		
		
		scan.close();
	}

}

package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		int weight = scan.nextInt();
		
//		// �����԰� 60Ű�� �����̸� ġŲ, �ƴϸ� ������
//		// if - else
//		if(weight <= 70) {
//			System.out.println("ġŲ");
//		} else {
//			System.out.println("������");
//		}
//		
		// if - else if - else
		if (weight <= 70) { // 70 ����
			System.out.println("ġŲ");
		} else if (weight <= 75) { // 71 ~ 75 ����
			System.out.println("�߰�����");
		} else if (weight <= 80) { // 76 ~ 80 ����
			System.out.println("������");
		} else { // 80Ű�� �ʰ�
			System.out.println("����");
		}
		
		
		scan.close();
	}

}

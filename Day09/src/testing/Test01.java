package testing;

public class Test01 {

	public static void main(String[] args) {
//		1. �𷡽ð� ����ϱ�
//		�𷡽ð��� ũ�⸦ ��Ÿ���� Ȧ���� ����(3 <= n < 99)�� �Է¹ް� �𷡽ð� ����� ����ϼ���.
//		�Է� ����
//
//		�𷡽ð� ũ�⸦ �Է��ϼ���: 3
//		��� ����
//
//		*+*
//		-*-
//		*+*
		int number = 3;
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number / 2; j++) {
				System.out.print("-");
			}
			
			
			
			System.out.println();
		}
	}

}

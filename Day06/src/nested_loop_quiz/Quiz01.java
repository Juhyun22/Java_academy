package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {
//		1. �ֻ��� ����
//		for (int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6; j++) {
//				System.out.print("(" + i + ", " + j + ")");
//			}
//			System.out.println();
//		}
//		System.out.println("�ֻ��� ��!");
//		System.out.println();
//		
		
//		2. ������
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " X " + j + " = " + (i * j));
//			}
//		}
//		System.out.println("������ ��!");
//		System.out.println();
		
//		3. �����
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
		
		
//		4. �Ųٷ� �� �ﰢ��
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		5. �Ƕ�̵�
//		�Ʒ� ����ó�� *�� ����ϼ���.
//		��� ����
//
//		    *        1��  ��ĭ: 4��
//		   ***       3��  ��ĭ: 3��
//		  *****      5��  ��ĭ: 2��
//		 *******     7��  ��ĭ: 1��
//		*********    9��  ��ĭ: 0��
		// ��ĭ �װ�
		// �ѹ� ���
		// ��ĭ ����
		// ���� ���
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < 10; j = j + 2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
		
}



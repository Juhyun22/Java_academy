package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * ��ø�ݺ��� : �ݺ��� �ȿ� �ݺ���
		 * 	�ٱ��� �ݺ��� : õõ�� ����. ��Ʈ(��)
		 *  ���� �ݺ��� : ���� ����. ����Ʈ Ƚ��(��)
		 */
		
		// ����Ʈ 10ȸ
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("����Ʈ " + i + "ȸ");
//		}
//		
		// ����Ʈ 3��Ʈ 10ȸ
		for (int i = 1; i <= 3; i++) { // 1 2 3 
			for (int j = 1; j <= 10; j++) { // 1 2 3 ... 10
				System.out.println("����Ʈ " + i + "��Ʈ°, " + j +"ȸ");
			}
		}
		
		
		// ����¥�� �� 5�� ���
		// *****
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
		
		
		// ����¥�� �� 5��, 3�� ���
		// *****
		// *****
		// *****
		for (int i = 0; i < 3; i++) { // 0 1 2 => 3��
			for (int j = 0; j < 5; j++) { // 0 1 2 3 4 => 5�� (���� ����)
				System.out.print("*");
			}
			System.out.println(); // �� ���� ������ ������ �ٹٲ�
		}
		
		
		
		
		
	}

}

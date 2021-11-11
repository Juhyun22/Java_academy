package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// while     "Hello world" 5��
//		int i = 0;
//		while (i < 5) { // while ���� �� �ִ� ���� �ʼ�
//			System.out.println("Hello world");
//			i++;
//		}
//		
		
		
		// ���ѷ������� Hello world �ټ��� ���
		// break��: break�� ���� ���� ����� �ݺ��� �Ǵ� switch������ �������´�.
		int i = 0;
		while (true) {
			// 0 1 2 3 4    5 X
			if (i == 5) {
				break; // ���� ������ �ִ� �ݺ����� ��������
			}
			
			System.out.println("Hello world " + i);
			i++;
		}
		
		
		// continue�� : skip. �Ʒ� �ڵ���� �������� ���� ��� ������ ����.
		
		// 1 ~ 10������ �� �߿� 4�� ����� �� ������� �ʱ�
		// 1 2 3 5 6 7 9 10 ...
		
		// (1) if�� ó��
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) { // 4�� ����� �ƴ� ���� ���
				System.out.print(j + " ");
			} 
		}
		System.out.println();
		
		
		// (2) continue�� ���
		// 1 2 3 5 6 7 9 10
		for (int j = 1; j <= 10; j++) {
			if (j % 4 == 0) { // 4�� ����� �� skip
				continue;
			}
			System.out.print(j + " ");
		}
	}

}






















package two_d_array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 2���� �迭
		// �ٱ���: ��, ����: ��
		int[][] scores = {
				{89, 93, 91}, 
				{91, 82, 72}, 
				{65, 100, 55}, 
				{99 ,87, 56}
		};
		
		System.out.println("3��° �л��� �ι��� ������ " + scores[2][1] + "��");  // 100��
		System.out.println("2��° �л��� ù��° ������  " + scores[1][0] + "��");  // 91�� 
		System.out.println("4��° �л��� ������ ������  " + scores[3][2] + "��");  // 56��
		System.out.println();
		
		// �ݺ������� 2���� �迭 �� ���
		for (int i = 0; i < scores.length; i++) {  // �л� ��
			for (int j = 0; j < scores[i].length; j++) {  // ���� ��
				System.out.println((i + 1) + "��° �л��� " + (j + 1) + "��° ���� ������ " +scores[i][j] + "�̴�.");
			}
			System.out.println();
		}
		
		// �л����� ��� ���� ���ϱ�
		for (int i = 0; i < scores.length; i++) {  // �л� ��
			int sum = 0; // �� �л��� ���� ����
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			System.out.println((i + 1) + "��° �л��� ��� ������ " + Math.floor(average*10)/ 10.0 + "��");
		}
		
	}

}













package two_d_array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
//		1. �л��� ��� ���ϱ�
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			System.out.println((i + 1) + "��° �л��� ����� " + average);
		}
		System.out.println();
		
///////////////////////////////////////////////////////////////////////////////
		
//		2. �л��� �ְ��� ���ϱ�
		for (int i = 0; i < scores.length; i++) {  // �л� ��
			int max = -1;
			for (int j = 0; j < scores[i].length; j++) { // �л� �� ���� ����
				max = max > scores[i][j] ? max : scores[i][j];
			}
			System.out.println((i + 1) + "���� �л��� �ְ� ������ " + max);
		}
		System.out.println();
		
///////////////////////////////////////////////////////////////////////////////////
		
//		3. ��� �ְ��� ���ϱ�
		int highStu = 0;
		int highSco = 0;
		double ave = 0;
		
		for (int i = 0; i < scores.length; i++) {  // �л�
			int sum = 0;  // �ʱ�ȭ ��ġ ����
			for (int j = 0; j < scores[i].length; j++) {  // ����
				sum += scores[i][j];
			}
			if (sum > highSco) {
				highSco = sum;
				highStu = i;
				ave = (double)highSco / scores[i].length;
			}
		}
		
		System.out.println("����� ���� ���� �л��� " + (highStu + 1) + "��° �л��̰�, ��� ������ " + ave);
		System.out.println();
		
////////////////////////////////////////////////////////////////////////////
		
//		4. Ư�� ���� �ְ���
		int stuNum = 0;
		int stuSco = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (stuSco < scores[i][3]) {
				stuSco = scores[i][3];
				stuNum = i;
			}
		}
		
		System.out.println("4��° ������ �ְ� �����ڴ� " + (stuNum + 1) + "��° �л��̰�, ������ " + stuSco);
		
		
//		5. �Ϻ� ��� �ְ���
//		������� index 3~7 �� ����� ���� ���� �л��� index�� ���Ͽ� ����ϼ���.
//		���
//
//		3~7 ���� ����� ���� ���� �л��� 3��° �л��̰�, ����� 93.8�Դϴ�. 
		
		for (int i = 0; i <= scores.length; i++) {
			for (int j = 3; j <= 7; j++) {
				
			}
		}
		
	}

}






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
		
		// 4. Ư�� ���� �ְ���
		int maxScore = 0;
		int maxIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxIndex = i;
			}
		}
		System.out.println("4��° ������ �ְ� �����ڴ� " + (maxIndex + 1) + "��° �л��̰�, ������ " + maxScore + "��");
		
		// 5. �ε��� 3 ~ 7 ��� ���� ���� ���
		double maxAverage = 0;
		maxIndex = 0;
		for (int i = 0; i < scores.length; i++) {  // �л� ��
			int sum = 0;
			for (int j = 3; j <= 7; j++) {  // 5�� ����
				sum += scores[i][j];
			}
			double average = sum / 5.0;
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
		}
		System.out.println("�ε��� 3 ~7 ���� ����� ���� ���� �л��� " + (++maxIndex) + "��° �л��̰� ������ " + maxAverage);
		
		
		
	} // main

}













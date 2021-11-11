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
		
		// 4. 특정 과목 최고점
		int maxScore = 0;
		int maxIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxIndex = i;
			}
		}
		System.out.println("4번째 과목의 최고 성적자는 " + (maxIndex + 1) + "번째 학생이고, 점수는 " + maxScore + "점");
		
		// 5. 인덱스 3 ~ 7 평균 가장 높은 사람
		double maxAverage = 0;
		maxIndex = 0;
		for (int i = 0; i < scores.length; i++) {  // 학생 수
			int sum = 0;
			for (int j = 3; j <= 7; j++) {  // 5개 과목
				sum += scores[i][j];
			}
			double average = sum / 5.0;
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
		}
		System.out.println("인덱스 3 ~7 과목 평균이 가장 높은 학생은 " + (++maxIndex) + "번째 학생이고 점수는 " + maxAverage);
		
		
		
	} // main

}













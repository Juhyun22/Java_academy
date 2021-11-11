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
		
//		1. 학생별 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			System.out.println((i + 1) + "번째 학생의 평균은 " + average);
		}
		System.out.println();
		
///////////////////////////////////////////////////////////////////////////////
		
//		2. 학생별 최고점 구하기
		for (int i = 0; i < scores.length; i++) {  // 학생 수
			int max = -1;
			for (int j = 0; j < scores[i].length; j++) { // 학생 별 과목 점수
				max = max > scores[i][j] ? max : scores[i][j];
			}
			System.out.println((i + 1) + "번쨰 학생의 최고 점수는 " + max);
		}
		System.out.println();
		
///////////////////////////////////////////////////////////////////////////////////
		
//		3. 평균 최고점 구하기
		int highStu = 0;
		int highSco = 0;
		double ave = 0;
		
		for (int i = 0; i < scores.length; i++) {  // 학생
			int sum = 0;  // 초기화 위치 주의
			for (int j = 0; j < scores[i].length; j++) {  // 과목
				sum += scores[i][j];
			}
			if (sum > highSco) {
				highSco = sum;
				highStu = i;
				ave = (double)highSco / scores[i].length;
			}
		}
		
		System.out.println("평균이 가장 높은 학생은 " + (highStu + 1) + "번째 학생이고, 평균 점수는 " + ave);
		System.out.println();
		
////////////////////////////////////////////////////////////////////////////
		
//		4. 특정 과목 최고점
		int stuNum = 0;
		int stuSco = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (stuSco < scores[i][3]) {
				stuSco = scores[i][3];
				stuNum = i;
			}
		}
		
		System.out.println("4번째 과목의 최고 성적자는 " + (stuNum + 1) + "번째 학생이고, 점수는 " + stuSco);
		
		
//		5. 일부 평균 최고점
//		시험과목 index 3~7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//		출력
//
//		3~7 과목 평균이 가장 높은 학생은 3번째 학생이고, 평균은 93.8입니다. 
		
		for (int i = 0; i <= scores.length; i++) {
			for (int j = 3; j <= 7; j++) {
				
			}
		}
		
	}

}






package two_d_array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 2차원 배열
		// 바깥쪽: 행, 안쪽: 열
		int[][] scores = {
				{89, 93, 91}, 
				{91, 82, 72}, 
				{65, 100, 55}, 
				{99 ,87, 56}
		};
		
		System.out.println("3번째 학생의 두번쨰 점수는 " + scores[2][1] + "점");  // 100점
		System.out.println("2번째 학생의 첫번째 점수는  " + scores[1][0] + "점");  // 91점 
		System.out.println("4번째 학생의 마지막 점수는  " + scores[3][2] + "점");  // 56점
		System.out.println();
		
		// 반복문으로 2차원 배열 값 출력
		for (int i = 0; i < scores.length; i++) {  // 학생 수
			for (int j = 0; j < scores[i].length; j++) {  // 과목 수
				System.out.println((i + 1) + "번째 학생의 " + (j + 1) + "번째 과목 점수는 " +scores[i][j] + "이다.");
			}
			System.out.println();
		}
		
		// 학생들의 평균 점수 구하기
		for (int i = 0; i < scores.length; i++) {  // 학생 수
			int sum = 0; // 한 학생의 점수 총합
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			System.out.println((i + 1) + "번째 학생의 평균 점수는 " + Math.floor(average*10)/ 10.0 + "점");
		}
		
	}

}













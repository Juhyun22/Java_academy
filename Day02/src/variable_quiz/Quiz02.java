package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
//		1. 변수 출력
		int score1 = 90;
		int score2 = 80;
		
		char gradeA = 'A';
		char gradeB = 'B';
		
		float total1 = 4.0f;
		float total2 = 3.0f;
		
		System.out.println("시험 성적이 " + score1 + "점 이상이면 '" + gradeA + 
				"'학점이고 평점은 " + total1 + "입니다.");
		System.out.println("시험 성적이 " + score2 + "점 이상이면 '" + gradeB + 
				"'학점이고 평점은 " + total2 + "입니다.");
		System.out.println();
		
		
//		2. 실수 연산
		int number1 = 33;
		double number2 = 35.325;
		
		// double c_number1 = Double.valueOf(number1);
		double sum;
		sum = number1 * number2;
		
		System.out.println("두 수의 곱 : " + sum);
		System.out.println();
		
		
//		3. 날짜 구하기
		int time = 943;
		int date = time / 24; // 나눈 몫
		int theTime = time % 24; // 나눈 나머지
		
		System.out.println(time + "시간은 " + date + "일 " + theTime + "시간 입니다.");
		System.out.println();
		
		
//		4. 도형 넓이 구하기
		int row = 8; // width
		int column = 9; // height
		int res = row * column; // rectangleArea, triangle
		// 계산 시에 소수가 나올 확률이 있으면 소수형인 double을 써 주면 좋음!!
		System.out.println("사각형의 넓이: " + res);
		res = res / 2;
		System.out.println("삼각형의 넓이: " + res);
		System.out.println();
		
	}

}






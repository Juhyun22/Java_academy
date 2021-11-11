package variable_quiz;

public class Quiz03 {

	public static void main(String[] args) {
//		1. 평균 구하기
		int korean = 93;
		int math = 88;
		int english = 94;
		
		double average;
		average = (korean + math + english) / 3.0;
		// = average = double(korean + math + english) / 3;
		// = average = (korean + math + english) / (double)3;
		
		System.out.println("국어:" + korean + ", 수학:" + math + ", 영어:" + english);
		System.out.println("평균: " + Math.round(average * 100) / 100.0);
		System.out.println();
		
//		2. 화씨 구하기
		int c = 30;
		double f = 9.0 / 5 * c + 32;
		
		System.out.println("섭씨 " + c + "도는 화씨 " + f + "도 입니다.");
		System.out.println();
	}

}

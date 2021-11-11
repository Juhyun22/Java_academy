package testing;

public class Test01 {

	public static void main(String[] args) {
//		1. 모래시계 출력하기
//		모래시계의 크기를 나타내는 홀수의 정수(3 <= n < 99)를 입력받고 모래시계 모양을 출력하세요.
//		입력 예시
//
//		모래시계 크기를 입력하세요: 3
//		출력 예시
//
//		*+*
//		-*-
//		*+*
		int number = 3;
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number / 2; j++) {
				System.out.print("-");
			}
			
			
			
			System.out.println();
		}
	}

}

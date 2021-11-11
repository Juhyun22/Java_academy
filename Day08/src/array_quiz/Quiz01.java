package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. 배열 값 접근
		// 배열의 4번째 값을 6으로 바꾸세요.
		numbers[3] = 6;
		
		// 2. 배열 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 3. 역순 출력
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 4. 배열 짝수번 출력
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		5. index
//		배열의 값 중 2가 들어 있는 index를 출력하세요.
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어있는 index는 " + i);
			}
		}
		
//		6. 최대값
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값은 " + max);
	
//		7. 최소값 index
		int min = numbers[0];
		int minInd = -1;
		for (int i = 0; i < numbers.length; i++) {
			minInd = min > numbers[i] ? i : minInd;
		}
		System.out.println("최소값의 인덱스는 " + minInd);
		
//		8. 평균
		int sum = 0;
		double average;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		average = (double)sum / numbers.length;
		System.out.println("평균은 " + average);
	}

}

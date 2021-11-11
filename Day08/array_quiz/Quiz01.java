package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. �迭 �� ����
		// �迭�� 4��° ���� 6���� �ٲټ���.
		numbers[3] = 6;
		
		// 2. �迭 ���
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 3. ���� ���
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 4. �迭 ¦���� ���
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		5. index
//		�迭�� �� �� 2�� ��� �ִ� index�� ����ϼ���.
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2�� ����ִ� index�� " + i);
			}
		}
		
//		6. �ִ밪
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("���� ū ���� " + max);
	
//		7. �ּҰ� index
		int min = numbers[0];
		int minInd = -1;
		for (int i = 0; i < numbers.length; i++) {
			minInd = min > numbers[i] ? i : minInd;
		}
		System.out.println("�ּҰ��� �ε����� " + minInd);
		
//		8. ���
		int sum = 0;
		double average;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		average = (double)sum / numbers.length;
		System.out.println("����� " + average);
	}

}

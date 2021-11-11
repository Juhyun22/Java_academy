package array_quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. ��ġ ���� (swap)
		int[] numbers = {3, 5, 2, 10, 39};
		int temp;
		
		System.out.print("�� ���� index�� �Է��ϼ��� : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		
		temp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		scan.close();
		
//		2. �迭 ���� ����
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Random rand = new Random();
		
		// 0��° index�� random index�� ��ü�� 100�� �ݺ��ؼ� �ڼ��´�.
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10); // 0 ~ 9������ ���ڸ� �������� �̴´�.
			// swap ����
			int swap = array[0];
			array[0] = array[randIndex];
			array[randIndex] = swap;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
//		3. �󵵼� ���ϱ�
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] store = new int[6]; // 0 �ε����� ������� �ʴ´�. 1 2 3 4 5 => �� �� ����
		
		for (int i = 0; i < numbers3.length; i++) {
//			for (int j = 0; j < store.length; j++) {
//				if (numbers3[i] == j) {  // numbers3�� ��� �ִ� ���� store�� ���� ���ٸ�,
//					store[j]++;              // ����
//				}
//			}
			store[numbers3[i]]++;
		}
		
		for (int i = 1; i < store.length; i++) {
			System.out.println(i + " : " + store[i] + "��");
		}
		
	}

}





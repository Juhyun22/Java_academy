package array_quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. 위치 변경 (swap)
		int[] numbers = {3, 5, 2, 10, 39};
		int temp;
		
		System.out.print("두 개의 index를 입력하세요 : ");
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
		
//		2. 배열 순서 변경
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Random rand = new Random();
		
		// 0번째 index와 random index와 교체를 100번 반복해서 뒤섞는다.
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
			// swap 구현
			int swap = array[0];
			array[0] = array[randIndex];
			array[randIndex] = swap;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
//		3. 빈도수 구하기
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] store = new int[6]; // 0 인덱스는 사용하지 않는다. 1 2 3 4 5 => 빈도 수 저장
		
		for (int i = 0; i < numbers3.length; i++) {
//			for (int j = 0; j < store.length; j++) {
//				if (numbers3[i] == j) {  // numbers3에 들어 있는 수와 store의 수가 같다면,
//					store[j]++;              // 저장
//				}
//			}
			store[numbers3[i]]++;
		}
		
		for (int i = 1; i < store.length; i++) {
			System.out.println(i + " : " + store[i] + "개");
		}
		
	}

}





package array_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		1. 배열 값 변경
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("변경할 index와 값을 입력하세요 : ");
		int ind = scan.nextInt();
		int num = scan.nextInt();
		
		numbers[ind] = num;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		2. 점수 채점
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		int count = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				count++;
			}
		}
		
		System.out.println(count*10 + "점");
		
//		3. 임금 계산
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int count1 = 0;
		int count2 = 0;
		int money = 0;
		
		for (int i = 0; i < works.length; i++) {
			if (i < 5) {
				count1 += works[i];
			} else {
				count2 += works[i];
			}
		}
		
		money += count1 * 8500;
		money += count2 * 9500;
		
		System.out.println("일주일간 총 임금은 " + money + "원");
		
//		4. 배열 값 변경
//		길이가 5인 int 배열을 만든다.
//		수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
//		배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.
//		입력 예시
//
//		수를 입력하세요 : 34
//		수를 입력하세요 : 65
//		수를 입력하세요 : 23
//		수를 입력하세요 : 74
//		수를 입력하세요 : 2
//		수를 입력하세요 : 74
//		수를 입력하세요 : 57
//		수를 입력하세요 : 68
//		출력 예시
//
//		34 74 2 74 68
		
		int[] make= new int[5];
		int indNum = 0;
		
		while (indNum < make.length) {
			System.out.print("수를 입력하세요 : ");
			int getNum = scan.nextInt();
			
			if (getNum % 2 == 0) {
				make[indNum] = getNum;
				indNum++;
			}
			
		}
		
		for (int i = 0; i < make.length; i++) {
			System.out.print(make[i] + " ");
		}
		System.out.println();

		scan.close();
	
		
	}

}

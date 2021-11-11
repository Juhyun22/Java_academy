package two_d_array_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. [2][3]    10
		int[][] arr1 = new int[2][3];
		
		// 입력
		for (int i = 0; i < arr1.length; i++) {  // 0  1
			for (int j = 0; j < arr1[i].length; j++) {  // 0  1  2
				arr1[i][j] = 10;
			}
		}
		
		// 출력
		printArray(arr1);
		
		// 2. 1 2 3 4 네줄
		int[][] arr2 = new int[3][4];
		
		// 입력
		for (int i = 0; i < arr2.length; i++) {  // 0  1
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = j + 1;
			}
		}
		
		// 출력 
		printArray(arr2);
		
		// 3. 1 1 1 
		//    2 2 2
		//    3 3 3
		int[][] arr3 = new int[3][3];
		
		// 입력
		for (int i = 0; i < arr3.length; i++) {  // 0  1  2
			for (int j = 0; j < arr3[i].length; j++) {  
				arr3[i][j] = i + 1;
			}
		}
		
		// 출력 
		printArray(arr3);
		
		
		// 4. 십자 그리기
		int[][] arr4 = new int[5][5];
		
		// 입력
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
			// i가 2일 때 또는 j가 2일 때   => 1	
				if ((arr4.length - 1) / 2 == i || (arr4[i].length -1) / 2 == j) {
					arr4[i][j] = 1;
				}
			}
		}
		
		// 출력
		printArray(arr4);
		
		// 5. 전체 수 입력
		//    1 2 3   i: 0  /  j: (j + 1)  => 1
		//    4 5 6   i: 1  /  j: (j + 1)  => 4
		//    7 8 9   i: 2  /  j: (j + 1)  => 9
		int[][] arr5 = new int[3][3];
		
		// 입력
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = (i * arr5.length) + (j + 1);
			}
		}
		
		int value = 1;
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = value++;
			}
		}
		
		// 출력
		printArray(arr5);
		
		// 6. 전체 수 입력
		int[][] arr6 = new int[3][3];
		
		// 입력
		int val = 0;
		for (int i = 0; i < arr6.length; i++) {
			val = i + 1; // 열 0 : 1 , 2, 3, ...
			for (int j = 0; j < arr6[i].length; j++) {
				arr6[i][j] = val;
				val += arr6.length;
			}
		}
		
		// 출력
		printArray(arr6);
		
	} // main
	
	// 출력 메소드
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	} // method

} // class












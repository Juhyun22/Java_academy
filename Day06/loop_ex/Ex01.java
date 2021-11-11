package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// while     "Hello world" 5번
//		int i = 0;
//		while (i < 5) { // while 나갈 수 있는 문장 필수
//			System.out.println("Hello world");
//			i++;
//		}
//		
		
		
		// 무한루프에서 Hello world 다섯번 찍기
		// break문: break가 써진 가장 가까운 반복문 또는 switch문에서 빠져나온다.
		int i = 0;
		while (true) {
			// 0 1 2 3 4    5 X
			if (i == 5) {
				break; // 가장 가까이 있는 반복문을 빠져나감
			}
			
			System.out.println("Hello world " + i);
			i++;
		}
		
		
		// continue문 : skip. 아래 코드들을 수행하지 많고 즉시 조건을 본다.
		
		// 1 ~ 10까지의 수 중에 4의 배수일 떼 출력하지 않기
		// 1 2 3 5 6 7 9 10 ...
		
		// (1) if문 처리
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) { // 4의 배수가 아닐 때만 출력
				System.out.print(j + " ");
			} 
		}
		System.out.println();
		
		
		// (2) continue문 사용
		// 1 2 3 5 6 7 9 10
		for (int j = 1; j <= 10; j++) {
			if (j % 4 == 0) { // 4의 배수일 때 skip
				continue;
			}
			System.out.print(j + " ");
		}
	}

}

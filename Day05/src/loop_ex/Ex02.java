package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		// do-while 문: 조건이 거짓이어도 한번은 수행한다.
		int i = 0; // 0 ~ 2 : 3번
		do {
			System.out.println("안녕 " + i);
			i++;
		} while (i < -50);
		
		// 0 ~ 4: 5번
		i = 0;
		while (i < 5) {
			System.out.println("와일문" + i);
			i++;
		}
		
		// for (초기식; 조건; 증감식) { }
		// 0 ~ 4: 5번
		for (int j = 0; j < 5; j++) {
			System.out.println("for문 " + j);
		}
		
		// 1 ~ 5: 5번
		for (int j = 1; j <= 5 ; j++) {
			System.out.println("딸기 " + j);
		}
		
		// 5 ~ 1: 5번
		for (int j = 5; j >= 1; j--) {
			System.out.println("모니터 " + j);
		}
		
		// 1+2+3+...+10 합계
		int sum = 0;
		for(int j = 1; j <= 10 ; j++) {
			sum += j;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}






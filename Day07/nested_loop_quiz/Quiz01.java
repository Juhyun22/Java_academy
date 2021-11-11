package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 3. 별 삼각형
//		      행과 별의 개수가 같음. 즉, 행의 개수와 별의 개수가 같음
//		*      - 1행   별의 개수 1개(열)
//		**     - 2행   별의 개수 2개(열)
//		***    - 3행   별의 개수 3개(열)
//		****   - 4행   별의 개수 4개(열)
//		*****  - 5행   별의 개수 5개(열)
		for (int i = 1; i <= 5; i++) {  // 행   1 ~ 5
			for (int j = 1; j <= i; j++) {  // 열(별의 개수) == 행의 번호
				System.out.print("*");
			}
			System.out.println(); // 행이 변경될 때 줄바꿈
		}
		
		System.out.println();
		
		
//		4. 거꾸로 된 삼각형
//		*****        행 5     - 별의 개수 5개
//		****         행 4     - 별의 개수 4개
//		***          
//		**       
//		*            행 1     - 별의 개수 1개
		for (int i = 5; i >= 1; i--) {       // 행의 번호  5 ~ 1
			for (int j = 0; j < i; j++) {   // 별의 개수 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		// 5. 피라미드
//		----*        별:1
//		---***       별:3
//		--*****      별:5
//		-*******     별:7
//		*********    별:9
		
		for (int i = 0; i < 5; i++) {  // 행     0 ~ 4 => 5행
			// 공백을 위한 반복문(열)
			for (int j = 0; j < (4 - i) ; j++) {  // 4 3 2 1 0    
 				System.out.print(" ");
			}
			
			// 별을 찍기 위한 반복문(열)
			// 짝수: 2n, 홀수: 2n+1 또는 2n-1
			for (int j = 0; j < (2*i + 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}

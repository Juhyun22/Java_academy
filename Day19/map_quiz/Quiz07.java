package map_quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
//		Person 클래스 멤버변수
//		이름(String)
//		생년월일(int)
//		＊1:입력 2:출력 3:삭제 4:종료
//		＊무한루프를 돌고, 4번을 누르면 입력 종료
//
//		1:입력: 입력받은 이름과 생년월일을 입력받아서 Person객체를 생성하고 List에 넣는다.
//
//		2.출력: Person객체가 있으면 출력하고, 아무것도 없을 경우 "비어있습니다." 라고 출력한다.
//
//		3.삭제: "삭제할 사람 이름을 입력하세요: "를 출력하고 이름이 일치하는 Person 객체를 삭제한다.(Iterator 사용)
//
//		4.종료: "종료합니다."를 출력한 후 프로그램을 종료시킨다.
//		＊1~4 이외의 값을 입력받으면 "잘못 입력했습니다" 출력한다.
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1:입력 / 2:출력 / 3:삭제 / 4:종료");
			int num = scan.nextInt();
			
			if (num == 1) { // 입력
				
			} else if (num ==2) {
				
			}
		}

	}

}

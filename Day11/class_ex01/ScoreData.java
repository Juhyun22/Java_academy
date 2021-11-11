package class_ex01;

// 설계도 - 데이터를 담는 공간
public class ScoreData {
	// 1. 속성, 필드(filed), 멤버변수
	int score;
	String subject;
	int rank;
	
	// 2. 행위, 메소드(method), 멤버함수
	void printInfo() {
		System.out.println("과목명: " + this.subject);
		System.out.println("점수: " + this.score);
		System.out.println("석차: " + this.rank);
	}
}







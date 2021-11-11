package class_ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 나의 의식 (모든 일이 일어남)
		// 클래스: 내가 만든 자료형이다.
		// 설계도 -> 객체(Object): 인스턴스화 한다.    ScoreData의 instance
		ScoreData sd1 = new ScoreData(); // sd1은 객체이다. new로 할당될 때가 진짜 heap에 메모리가 생긴다.
		
		// 필드에 값 넣기
		sd1.subject = "국어";
		sd1.score = 85;
		sd1.rank = 7;
		
		// 필그 값 출력하기
		System.out.println(sd1.subject);
		System.out.println(sd1.score);
		System.out.println(sd1.rank);
		
		// 메소드를 호출
		sd1.printInfo();
	}

}

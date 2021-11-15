package inheritance_quiz01;

public class HealthTest {

	public static void main(String[] args) {
		// 나의 의식
//		HealthRate hi1 = new HealthRate("박둘리", 160, 45);
//		hi1.showInfo();
//		hi1.isFat();
//	
//		HealthRate hi2 = new HealthRate("홍길동", 168, 90);
//		hi2.showInfo();
//		hi2.isFat();
		
		HealthRate rate1 = new HealthRate("박둘리", 160, 45);
		// Student  부모생성자, 자식생성자
		rate1.showInfo();
		
		HealthRate rate2 = new HealthRate("홍길동", 168, 90);
		rate2.showInfo();
	}

}

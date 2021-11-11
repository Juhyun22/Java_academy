package constructor_quiz02;

public class Circle {
	// 1. 속성, 필드
	private int rad;
	// private double pi = 3.14;
	
	// 2. 행위, 메소드
	public Circle(int rad) {
		this.rad = rad;
	}
	
	// 넓이
	public double getArea() {
		return this.rad * this.rad * Math.PI;
	}
	
	// 둘레
	public double getRound() {
		return 2 * this.rad * Math.PI;
	}
	
	// 25개의 넓이
	// 오버로딩: 메소드 이름은 같은데, 파라미터의 개수가 다르거나
	// 파라미터의 타입이 다른 경우
	// 다른 메소드로 인지하고 일치하는 메소드로 호출해준다.
	public double getArea(int num) {
		return this.getArea() * num;
	}
	
}

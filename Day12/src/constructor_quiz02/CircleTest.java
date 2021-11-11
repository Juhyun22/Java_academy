package constructor_quiz02;

public class CircleTest {

	public static void main(String[] args) {
		// 원을 만든다.
		Circle cir1 = new Circle(8);
		
		// 원의 넓이
		// 원의 둘레
		// 원 25개의 넓이
		System.out.println("원의 넓이 : " + cir1.getArea());
		System.out.println("원의 둘레 : " + cir1.getRound());
		System.out.println("원 25개 넓이 : " + cir1.getArea(25));
		System.out.println();
	}

}

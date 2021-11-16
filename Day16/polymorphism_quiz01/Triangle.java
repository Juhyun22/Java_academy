package polymorphism_quiz01;

// 자식 클래스
public class Triangle extends Shape {
	
	public Triangle(int base, int height) {
		this.name = "삼각형";
		this.area = base * height / 2;
	}
	
}

package constructor_quiz01;

// 설계도 - 사각형 
public class Rectangle {
	// 1. 속성, 필드, 멤버 변수
	private int row;
	private int col;
	
	// 2. 행위, 메소드
	
	// 생성자 Constructor
	public Rectangle(int row, int col) {
		this.row = row;
		this.col = col;
		System.out.println("가로 " + row + "cm, 세로 " + col + "cm 사각형이 만들어졌습니다.");
	}
	
	// 넓이 구하기
	public int getArea() {
		return this.row * this.col;
	}
	
	// 둘레 구하기
	public int getRound() {
		return 2 * (this.row + this.col);
	}
}

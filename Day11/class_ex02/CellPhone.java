package class_ex02;

// 설계도
public class CellPhone {
	// 1. 속성, 필드 - 명사
	String maker;
	String model = "eight";
	String color;
	int price;
	
	// 2. 행위, 메소드 - 동사
	public void call() {
		System.out.println("여보세요");
	}
	
	public void camera() {
		System.out.println("찰칵");
	}
	
}



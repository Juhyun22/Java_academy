package abstract_class_ex01;

// 추상클래스(abstract class): 추상 메소드가 하나라도 존재하는 클래스
public abstract class Animal {
	// 추상 메소드(abstract method): 자식클래스가 반드시 구현해야하는 메소드이다.
	public abstract void cry();
	
	// 일반 메소드
	public void eat() {
		System.out.println("냠냠");
	}
}

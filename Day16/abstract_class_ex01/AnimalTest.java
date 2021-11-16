package abstract_class_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal animal = new Animal(); // 추상클래스는 객체로 만들 수가 없다.
		Animal animal1 = new Cat(); // up casting       cat -> animal
		animal1.cry();
		animal1.eat();
		
		Animal animal2 = new Tiger();
		animal2.cry();
		animal2.eat();
	}

}

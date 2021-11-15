package polymorphism_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		// int number = (int)1.5; // casting 캐스팅 -> 값이 바뀌는걸 알고 써라 / 정확한 값을 알고 써라		
		
		// 업캐스팅: 자식 -> 부모로 자료형 변환
		// 1. 부모 클래스의 메소드를 사용할 수 있다.
		// 2. 부모 클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다.
		// 3. 자식 클래스에만 있는 메소드는 사용할 수 없다.
		Animal animal = (Animal)new Cat(); // up casting
		animal.cry();
		animal.eat();
		// animal.grooming();   사용 불가
		
		// down casting: 부모 -> 자식으로 자료형 변환(캐스팅)
		// - 자식 클래스가 여러개이기 때문에 명확하게 캐스팅 문법을 명시해 주어야 한다.
		// - 어떤 자식 클래스인지 instanceof 명령어를 사영해서 검사해야한다.
//		Cat cat = (Cat)animal;
//		cat.cry();
//		cat.eat();
//		cat.grooming();
		
//		Dog dog = (Dog)animal;
//		dog.cry();
//		dog.eat();
//		dog.lash();
		
		if (animal instanceof Cat) { // 동물이 cat으로 탄생한 동물이냐??
			Cat cat = (Cat)animal;
			cat.cry();
			cat.eat();
			cat.grooming();
		} else if (animal instanceof Dog) { // 동물이 dog로 탄생한 동물이냐???
			Dog dog = (Dog)animal;
			dog.cry();
			dog.eat();
			dog.lash();
		}
	}

}






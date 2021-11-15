package polymorphism_quiz01;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Cat(); // 고양이 태어남 업캐스팅
		animals[1] = new Dog(); // 강아지 태어남 업캐스팅

		// TODO: 구현하기
//		for (int i = 0; i < 2; i++) {
//			if (animals[i] instanceof Cat) { // 동물이 cat으로 탄생한 동물이냐??
//				Cat cat = (Cat) animals[i];
//				cat.cry();
//				cat.cry();
//				cat.cry();
//			} else if (animals[i] instanceof Dog) { // 동물이 dog로 탄생한 동물이냐???
//				Dog dog = (Dog) animals[i];
//				dog.cry();
//				dog.cry();
//				dog.cry();
//			}
//		}
//		
//		Cat cat = (Cat) animals[0];
//		cat.groom();

		// 업캐스팅
		for (int i = 0; i < animals.length; i++) {
			for (int j = 0; j < 3; j++) {
				animals[i].cry();
			}
		}

		// 다운캐스팅
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Cat) { // 동물이 cat으로 탄생한 동물이냐??
				Cat cat = (Cat) animals[i];
				cat.groom();
			} else if (animals[i] instanceof Dog) { // 동물이 dog로 탄생한 동물이냐???
				Dog dog = (Dog) animals[i];
				dog.lash();
			}
		}

	}

}

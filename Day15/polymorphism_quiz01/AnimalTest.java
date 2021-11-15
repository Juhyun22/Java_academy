package polymorphism_quiz01;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Cat(); // ����� �¾ ��ĳ����
		animals[1] = new Dog(); // ������ �¾ ��ĳ����

		// TODO: �����ϱ�
//		for (int i = 0; i < 2; i++) {
//			if (animals[i] instanceof Cat) { // ������ cat���� ź���� �����̳�??
//				Cat cat = (Cat) animals[i];
//				cat.cry();
//				cat.cry();
//				cat.cry();
//			} else if (animals[i] instanceof Dog) { // ������ dog�� ź���� �����̳�???
//				Dog dog = (Dog) animals[i];
//				dog.cry();
//				dog.cry();
//				dog.cry();
//			}
//		}
//		
//		Cat cat = (Cat) animals[0];
//		cat.groom();

		// ��ĳ����
		for (int i = 0; i < animals.length; i++) {
			for (int j = 0; j < 3; j++) {
				animals[i].cry();
			}
		}

		// �ٿ�ĳ����
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Cat) { // ������ cat���� ź���� �����̳�??
				Cat cat = (Cat) animals[i];
				cat.groom();
			} else if (animals[i] instanceof Dog) { // ������ dog�� ź���� �����̳�???
				Dog dog = (Dog) animals[i];
				dog.lash();
			}
		}

	}

}

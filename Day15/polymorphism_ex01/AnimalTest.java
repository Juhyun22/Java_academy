package polymorphism_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		// int number = (int)1.5; // casting ĳ���� -> ���� �ٲ�°� �˰� ��� / ��Ȯ�� ���� �˰� ���		
		
		// ��ĳ����: �ڽ� -> �θ�� �ڷ��� ��ȯ
		// 1. �θ� Ŭ������ �޼ҵ带 ����� �� �ִ�.
		// 2. �θ� Ŭ������ �ִ� �޼ҵ带 �������̵� �� �޼ҵ带 ����� �� �ִ�.
		// 3. �ڽ� Ŭ�������� �ִ� �޼ҵ�� ����� �� ����.
		Animal animal = (Animal)new Cat(); // up casting
		animal.cry();
		animal.eat();
		// animal.grooming();   ��� �Ұ�
		
		// down casting: �θ� -> �ڽ����� �ڷ��� ��ȯ(ĳ����)
		// - �ڽ� Ŭ������ �������̱� ������ ��Ȯ�ϰ� ĳ���� ������ ����� �־�� �Ѵ�.
		// - � �ڽ� Ŭ�������� instanceof ��ɾ �翵�ؼ� �˻��ؾ��Ѵ�.
//		Cat cat = (Cat)animal;
//		cat.cry();
//		cat.eat();
//		cat.grooming();
		
//		Dog dog = (Dog)animal;
//		dog.cry();
//		dog.eat();
//		dog.lash();
		
		if (animal instanceof Cat) { // ������ cat���� ź���� �����̳�??
			Cat cat = (Cat)animal;
			cat.cry();
			cat.eat();
			cat.grooming();
		} else if (animal instanceof Dog) { // ������ dog�� ź���� �����̳�???
			Dog dog = (Dog)animal;
			dog.cry();
			dog.eat();
			dog.lash();
		}
	}

}






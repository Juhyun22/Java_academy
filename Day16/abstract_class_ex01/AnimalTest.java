package abstract_class_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal animal = new Animal(); // �߻�Ŭ������ ��ü�� ���� ���� ����.
		Animal animal1 = new Cat(); // up casting       cat -> animal
		animal1.cry();
		animal1.eat();
		
		Animal animal2 = new Tiger();
		animal2.cry();
		animal2.eat();
	}

}

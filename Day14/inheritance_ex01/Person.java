package inheritance_ex01;

// �θ� Ŭ����, Super Class, Parent Class
public class Person {
	protected String name;
	
	public Person() {
		System.out.println("����~~~~");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("������, �̸� : " + this.name);
	}
	
	public void introduce() {
		System.out.println("�� �̸��� " + this.name + " �Դϴ�.");
	}
	
}

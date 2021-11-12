package inheritance_ex01;

// 부모 클래스, Super Class, Parent Class
public class Person {
	protected String name;
	
	public Person() {
		System.out.println("응애~~~~");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("생성자, 이름 : " + this.name);
	}
	
	public void introduce() {
		System.out.println("내 이름은 " + this.name + " 입니다.");
	}
	
}

package inheritance_ex01;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		super(name); // 부모의 생성자 호출을 첫번째 줄에 해야 한다. 
		this.major = major;
		// super.name = name;
		// this.name = name;
	}
	
	// 오버라이드 : 상속, 부모 클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	@Override // 어노테이션(annotation): 메타정보 : 부모님에게 있지만 내가 갱신하겠따
	public void introduce() {
		// System.out.println("내 이름은 : " + this.name);
		super.introduce();
		System.out.println("내 전공은 : " + this.major);
	}
}

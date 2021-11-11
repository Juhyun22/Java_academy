package class_quiz01;

// 설계도
public class Person {
	// 1. 속성, 필드
	String name;
	String birth;
	String sex;
	
	// 2. 행위, 메소드
	public void sayHello() {
		System.out.println("안뇨옹");
	}
	
	public void walking() {
		System.out.println("나는 걷고 있숴");
	}
	
	public void introducceMyself() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.sex +"이얌 너능?");
	}
	
	public void tellAge() {
		int age = 2021 - Integer.valueOf(this.birth.substring(0, 4)) + 1;
		System.out.println("나이는 " + age + "살이닷");
	}

}

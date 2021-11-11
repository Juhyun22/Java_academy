package constructor_ex01;

public class Person {
	// 1. 속성, 필드
	// 은닉화(hiding): private으로 설정
	private String name;
	private String birth;
	private String sex;

	// 2. 행위, 메소드
	// 생성자(Constructor): 객체가 생성될 때 불려지는 특수한 메소드
	// 리턴 타입이 존지하지 않는다.
	// 생성자를 구현하지 않으면 기본 생성자가 생성된다.
	// void 절대 노노
	public Person() {
		System.out.println("응애~~~~");
	}
	// 생성자 오버로딩(Overloading): 메소드 이름이 같은데 일치하는 메소드를 선택해서 수행
	// input만 봄
	// 1) 파라미터 개수가 다른 경우
	// 2) 개수는 같아도 타입이 다른 경우
	public Person(String name, String birth, String sex) {
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		System.out.println("파라미터가 3개인 생성자");
	}
	
	// getter, setter - 캡슐화(encapsulation)
	public void setName(String name) {
		// 이름: 윤보라=> 가공이 가능하기 때문에
		// 필드에 바로 넣지 않고 setter를 이용한다.
		this.name = name;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public void sayHello() {
		System.out.println("안뇨옹");
	}

	public void walking() {
		System.out.println("나는 걷고 있숴");
	}

	public void introducceMyself() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.sex + "이얌 너능?");
	}

	public void tellAge() {
		int age = 2021 - Integer.valueOf(this.birth.substring(0, 4)) + 1;
		System.out.println("나이는 " + age + "살이닷");
	}

}

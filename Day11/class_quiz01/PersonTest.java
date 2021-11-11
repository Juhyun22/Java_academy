package class_quiz01;

public class PersonTest {

	public static void main(String[] args) {
		// TODO: 객체 생성 및 값 넣기
		Person ps = new Person();
		
		ps.name = "윤보라";
		ps.birth = "19961108";
		ps.sex = "여자";

		// 메소드 호출
		ps.sayHello();
		ps.walking();
		ps.introducceMyself();
		ps.tellAge();
	}

}

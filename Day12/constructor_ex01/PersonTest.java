package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {
		// TODO: 객체 생성 및 값 넣기
		Person p1 = new Person("바다", "20190126", "남자");
//		p1.name = "윤보라";
//		p1.birth = "19961108";
//		p1.sex = "여자";
//		p1.setName("윤보라");
//		p1.setBirth("19961108");
//		p1.setSex("여자");
		
		System.out.println(p1.getName());
		System.out.println(p1.getBirth());
		System.out.println(p1.getSex());
		System.out.println();

		// 메소드 호출
		p1.sayHello();
		p1.walking();
		p1.introducceMyself();
		p1.tellAge();
	}

}

package class_quiz;

public class StudentData {
    // 필드  = 이름, 수업명, 나이, 전화번호
	String name;
	int age;
	String className;
	String phoneNumber;
	
	// 미성년자인지 아닌지
	void isAdult() {
		if (this.age >= 20) { 
			System.out.println(this.name + "은 성인입니다.");
		} else {
			System.out.println(this.name + "은 미성년자입니다.");
		}
		
	}
}

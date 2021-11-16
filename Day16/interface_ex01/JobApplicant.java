package interface_ex01;

// 취준생
public class JobApplicant implements JavaProgramming, Cprogramming{
	// 스펙
//	private int toeic;
//	private double gradePoint;
//	private String[] licenses;
	
	// 자기소개
	public void introduce() {
		System.out.println("저는 백엔드 취업을 준비하는....");
	}

	@Override
	public void procedure() {
		System.out.println("C언어에서는 변수가 있고, 반복문이 있고, 함수가 있고...");
	}

	@Override
	public void objectOriented() {
		System.out.println("객체지향은 은닉화가 있고 캡슐화가 있고.....");
	}
}

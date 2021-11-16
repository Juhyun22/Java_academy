package interface_ex01;

public class JobTest {

	public static void main(String[] args) {
		JobApplicant suhyun = new JobApplicant();
		suhyun.introduce();
		
		Kakao kakao = new Kakao();
		kakao.recruitJavaProgrammer(suhyun);
	}

}

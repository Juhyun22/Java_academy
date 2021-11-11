package string_quiz;

public class Quiz01 {

	public static void main(String[] args) {
//		문자열 정수 변환
//		아래와 같이 생년이 저장된 String 이 있을때 올해 나이를 출력하세요.(한국나이)
//		String birthday = "1995";
//		출력 예시
//
//		27세
		String birthday = "1995";
		int year = Integer.parseInt(birthday);
		int age = 2021 - year + 1;
		System.out.println(age + "세");
		
	}

}

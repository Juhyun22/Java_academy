package string_quiz;

public class Quiz02 {

	public static void main(String[] args) {
//		1. 문자열 변환
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
//		2. 문자열 정수 변환
		String birth = "19950721";
		int year = Integer.parseInt(birth.substring(0, 4));
		year = 2021 - year + 1;
		System.out.println(year + "세");
		
//		3. 문자열 검색
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] words = sentence.split(" ");
		System.out.println("단어 개수: " + words.length);
		
	}

}

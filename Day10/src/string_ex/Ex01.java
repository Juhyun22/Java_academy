package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String 변수에 값 저장하기
		String a = "안녕하세요";
		String b = new String("안녕하세요");  // 객체
		String c = new String("안녕하세요");
		String d = "안녕하세요";
		
		System.out.println(a);
		System.out.println(b);
		
		// String 끼리 값 비교하기
		// == 비교는 stack 영역에 들어있는 주소잢을 비교한 것이다.
		// String 비교를 할 때는 .equals()를 사용해야 한다.
 		System.out.println(a == d);  // true
		System.out.println(b == c);  // false
		System.out.println(a == b);  // false
		System.out.println(a.equals(b));  // 값을 비교 .. true
		
	} // main

} // class









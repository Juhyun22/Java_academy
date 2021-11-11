package string_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형 변환
		// 숫자 3  <->  String "3"
		
		// StringBuilder 또는 StringBuffer
		// 1. 숫자 -> 문자열
		int number = 3;
		// (1)
		String str1 = number + "";  // 숫자 + 문자열 => 문자열
		System.out.println(str1);
		// (2)
		String str2 = String.valueOf(number);
		System.out.println(str2);
		
		
		// 2. 문자열 -> 숫자
		String str3 = "5";
		int num = Integer.parseInt(str3);
		int num1 = Integer.valueOf(str3);
		System.out.println(num);
		System.out.println(num1);
	}

}

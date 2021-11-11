package string_ex;

public class Ex03 {

	public static void main(String[] args) {
		String s1 = "eclipse";
		
		// charAt: n번째 인덱스에 무슨 문자가 있는가? -> char로 출력
		System.out.println(s1.charAt(4));
		
		// contains: 특정 문자열이 문자열에 포함이 되어있는지 확인 -> bool로 출력
		System.out.println(s1.contains("lip"));
		
		// *startsWith: 특정 문자열로 시작하는지 확인 -> bool로 출력
		System.out.println(s1.startsWith("ecl"));
		
		// endsWith: 특정 문자열로 끝나는지 확인 -> bool로 출력
		System.out.println(s1.endsWith("ps"));
		
		// length: 문자열의 길이 확인. 알파벳이 몇 개인지
		System.out.println(s1.length());
		
		// replace: 포함된 문자열 부분을 교체. 반드시 저장!! 무엇을 돌려주고 넣어주고 나오는지 알아야함!!!
		String s2 = "I stay hungry.";
		s2 = s2.replace("I", "You"); // 꼭 다시 저장해야한다!! 대소문자 구별!
		System.out.println(s2);
		
		// split: 특정 스트링을 기준으로 잘라서 배열에 넣는다. '.'은 주의해서 넣어라
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		System.out.println();
		
		// substring: 문자열을 자른다. int 넣어야하고 String출력
		String s4 = "javastudy";
		System.out.println(s4.substring(4)); // study
		
		// begin index: 시작 인덱스
		// end index: 끝 인덱스 + 1
		System.out.println(s4.substring(0, 4)); //  java 0 ~ 3
		System.out.println(s4.substring(4, 9)); //  study 4 ~ 8
		
	} // main

} // class















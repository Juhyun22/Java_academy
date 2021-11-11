package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형(data type) 변환 => casting
		double pi = 3.14;
		int intPi = (int)pi; // double에서 int로 변환: 소수점 아래자리 버림
		System.out.println(intPi);
		System.out.println((double)intPi); // int -> double로 변환: 뒤에 .0이 붙는다.
		
		int number = 7;
		double result = number / 2; // 예상 값: 3.5    int / int => int
		System.out.println(result);
		
		// 1. 둘 중 하나의 값을 실수로 형변환(casting) 한다.
		result = (double)number / 2;
		System.out.println(result);
		
		// 2. 실수로 나눈다.
		result = number / 2.0;
		System.out.println(result);
		
		// 반올림 하는법
		// Math.round(3.14) => 3     Math.round(3.8) => 4
		pi = 3.141592653;
		System.out.println(Math.round(pi));
		
		// 소수 둘째자리에서 반올림 하기 .. 꼼수입니당
		// 1. pi에 100을 곱해서 314.1592653
		// 2. Math.round() 이용해서 첫째자리에서 반올림 한다. => 정수가 된다. 314
		// 3. pi에 100을 나누어서 복구 시킨다. 314 => 3.14
		System.out.println(Math.round(pi * 100) / 100.0); // 마지막 int인지 잘 확인
		
	}

}








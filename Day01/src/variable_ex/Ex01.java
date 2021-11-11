package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 정수형 변수 (Integer)
		int number = 10; // 변수에 값을 넣는 것: 초기화, 대입, assign 
		System.out.println(number);
		
		number = 5; // 변수이므로 값을 변경할 수 있다. 재사용할 때는 자료형(data type)을 쓰지 않는다.
		System.out.println(number);
		
		int number2 = 100;
		int sum = number + number2;
		System.out.println(sum);
		
		// 실수 변수 (float) - 권장안함
		float f = 1.5f;
		System.out.println(f);
		
		// 실수 변수 (double)
		double d = 3.8;
		System.out.println(d);
		
		// 문자 변수 (character): 문자 한개. 작운 따옴표로 감싼다.
		char c = 'z';
		System.out.println(c);
		
		// boolean 변수 : 참(true) 또는 거짓(false)
		// is_real : snake case.. python
		// isReal : camel case.. java
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println(isFalse);
	}

}





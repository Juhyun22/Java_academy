package wrapper_class_ea01;

public class Ex01 {

	public static void main(String[] args) {
		// 기본 자료형(primitive type)
		int n1 = 5;
		System.out.println(n1);
		
		// 래퍼 클래스(Wrapper class)에 값 저장
		Integer n2 = 5;
		System.out.println(n2);
		
		// 래퍼 클래스(Wrapper class)에 값 저장]
		Integer n3 = new Integer(5);
		System.out.println(n3);
		
		// 기본 자료형과 래퍼 클래스 비교시 "값 비교"
		System.out.println(n1 == n2); // true
		System.out.println(n1 == n3); // true
		System.out.println(n2 == n3); // false 둘 다 객체인 경우에는 주소가 비교되어 .equals()로 비교해야함
		System.out.println(n3.equals(n2)); // true
		
		Integer num1 = 100;
		Integer num2 = 100;
		System.out.println(num1 == num2); // true 내부적으로는 주소가 같은 것. constant pool
		
		Integer num3 = new Integer(100);
		Integer num4 = new Integer(100);
		System.out.println(num3 == num4); // false 주소가 다르다. 그래서 false
		System.out.println(num3.equals(num4)); // 값 비교
	}

}

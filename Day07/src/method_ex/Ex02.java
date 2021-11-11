package method_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 메소드 만들기
		// 1. 어떤 메소드를 만들지 이름을 짓는다. (동사)
		// 2. input으로 무엇을 받을 지 생각한다. (생략 가능)
		// 3. output을 무엇으로 리턴할지 생각한다. (생략 가능)
		// 4. 구현한다.
		
		// 메소드를 사용하는 곳
		int x = 30;
		int y = 50;
		int result = sum(x, y);   // 30, 50  전달 인자(argument)
		System.out.println(result);
		System.out.println(sum(x, y));
		
		printHelloWorld();
	}
	
	// static: 정적. static 메소드가 다른 메소드를 부르는 경우
	// 메모리에 없으면 참조할 수 없기 때문에 static로 정의한다.
	
	// 메소드 만드는 곳
	public static int sum(int a, int b) {  // 30, 50 매개변수(parameter)
		System.out.println("더하기 메소드");
		return a + b;  // 80
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello world");
		return;  // 메소드 종료, 생략 가능
	}
	
	
	
	

}





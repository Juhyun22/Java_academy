package thread_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 1. 쓰레드 만들기 : Thread 클래스를 상속받아 사용한다.
		// 단점: 자바는 단일상속이므로 Thread를 상속받으면 다른 클래스를 함께 상속 받을 수 없다.
		ThreadExtends te1 = new ThreadExtends("♧");
		ThreadExtends te2 = new ThreadExtends("♠");
		
		// Single Thread로 수행 -> 순차적 수행
//		te1.run();
//		te2.run();
		
		// Multi Thread: 각각의 쓰레드가 동시에 수행(start 메소드 사용)
		// 출력되는 속도가 빨라서 싱글 쓰레드처럼 보이므로 sleep메소드 추가
		te1.start();
		te2.start();
		
		System.out.println("수행 완료");
	}

}

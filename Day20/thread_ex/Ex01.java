package thread_ex;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		// 1. 쓰레드 만들기 : Thread 클래스를 상속받아 사용한다.
		// 단점: 자바는 단일상속이므로 Thread를 상속받으면 다른 클래스를 함께 상속 받을 수 없다.
		ThreadExtends te1 = new ThreadExtends("♧");
		ThreadExtends te2 = new ThreadExtends("♠");
		
		// Single Thread로 수행 -> 순차적 수행
//		te1.run();
//		te2.run();
		
		// Multi Thread: 각각의 쓰레드가 동시에 수행(start 메소드 사용)
		// 출력되는 속도가 빨라서 싱글 쓰레드처럼 보이므로 sleep메소드 추가
//		te1.start();
//		te2.start();
		
		// 2. 쓰레드 만들기: Runnable 인터페이스를 구현해서 사용한다.
		// 상속도 사용가능하다.
		// 단점: 멀티쓰레드를 위해서 Thread 객체에 담아서 사용한다.
		ThreadImplements ti1 = new ThreadImplements("☆");
		ThreadImplements ti2 = new ThreadImplements("★");
		
		// Single Thread
		ti1.run();
		ti2.run();
		
		Thread t1 = new Thread(ti1);
		Thread t2 = new Thread(ti2);
		
		// Multi Thread
		t1.start();
		t1.join(); // t1 쓰레드가 끝날 때까지 메인쓰레드가 기다린다.
		t2.start();
		t2.join();
		
		System.out.println("수행 완료");
	}

}

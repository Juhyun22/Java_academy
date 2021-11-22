package exception_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리(Exception): 예상치 못한 상황에 대한 처리를 하는 것
		// try - catch - finally

		try {
			// NPE 예외
//			String str = null;
//			System.out.println(str.isEmpty());
			
			// 배열 범위 참조 예외
//			int[] arr = new int[3];
//			for (int i = 0; i <= arr.length; i++) {
//				System.out.println(arr[i]);
//			}
			
			// 캐스팅 예외
			Object x = new Integer(15);
			System.out.println((Integer)x);
			
		} catch (NullPointerException npe) {
			System.out.println("NPE가 발생했다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("배열 범위 참조 예외가 발생했다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("모든 예외를 잡는다.");
		} finally {
			// 데이터베이스에서 자주 사용됨. 데이터 연결 끊기 위해서 사용됨.
			System.out.println("예외이든 아니든 무조건 불려진다.");
		}
		
		System.out.println("수행 완료");
		
		try {
			a();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void a() throws Exception {
		b();
	}
	
	public static void b() throws Exception {
		// 예외 발생 처리 방법 2가지
		// 1. 내가 처리한다.(try - catch)
		// 2. 회피한다. 다른 사람한테 책임을 넘긴다.(throws) 위의 메소드에 책임을 넘긴다.
		
		// 예외 발생 시키는 방법
		// 1. checked exception: 개발자가 확인하고 어떻게 처리할지 결정
		// 2. unchecked exception: 개발자가 확인하지 않고 프로그램 종료
		// throw new RuntimeException(); // 프로그램이 바로 종료된다.(unchecked exception)
		// unchecked exception은 서버에서 임의로 더이상 할 수 있는게 없을 때 종료한다.
		throw new Exception();
	}
}





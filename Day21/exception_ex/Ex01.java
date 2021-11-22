package exception_ex;

public class Ex01 {

	public static void main(String[] args) {
		// ����ó��(Exception): ����ġ ���� ��Ȳ�� ���� ó���� �ϴ� ��
		// try - catch - finally

		try {
			// NPE ����
//			String str = null;
//			System.out.println(str.isEmpty());
			
			// �迭 ���� ���� ����
//			int[] arr = new int[3];
//			for (int i = 0; i <= arr.length; i++) {
//				System.out.println(arr[i]);
//			}
			
			// ĳ���� ����
			Object x = new Integer(15);
			System.out.println((Integer)x);
			
		} catch (NullPointerException npe) {
			System.out.println("NPE�� �߻��ߴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("�迭 ���� ���� ���ܰ� �߻��ߴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("��� ���ܸ� ��´�.");
		} finally {
			// �����ͺ��̽����� ���� ����. ������ ���� ���� ���ؼ� ����.
			System.out.println("�����̵� �ƴϵ� ������ �ҷ�����.");
		}
		
		System.out.println("���� �Ϸ�");
		
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
		// ���� �߻� ó�� ��� 2����
		// 1. ���� ó���Ѵ�.(try - catch)
		// 2. ȸ���Ѵ�. �ٸ� ������� å���� �ѱ��.(throws) ���� �޼ҵ忡 å���� �ѱ��.
		
		// ���� �߻� ��Ű�� ���
		// 1. checked exception: �����ڰ� Ȯ���ϰ� ��� ó������ ����
		// 2. unchecked exception: �����ڰ� Ȯ������ �ʰ� ���α׷� ����
		// throw new RuntimeException(); // ���α׷��� �ٷ� ����ȴ�.(unchecked exception)
		// unchecked exception�� �������� ���Ƿ� ���̻� �� �� �ִ°� ���� �� �����Ѵ�.
		throw new Exception();
	}
}





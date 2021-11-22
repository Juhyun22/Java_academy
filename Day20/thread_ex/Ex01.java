package thread_ex;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		// 1. ������ ����� : Thread Ŭ������ ��ӹ޾� ����Ѵ�.
		// ����: �ڹٴ� ���ϻ���̹Ƿ� Thread�� ��ӹ����� �ٸ� Ŭ������ �Բ� ��� ���� �� ����.
		ThreadExtends te1 = new ThreadExtends("��");
		ThreadExtends te2 = new ThreadExtends("��");
		
		// Single Thread�� ���� -> ������ ����
//		te1.run();
//		te2.run();
		
		// Multi Thread: ������ �����尡 ���ÿ� ����(start �޼ҵ� ���)
		// ��µǴ� �ӵ��� ���� �̱� ������ó�� ���̹Ƿ� sleep�޼ҵ� �߰�
//		te1.start();
//		te2.start();
		
		// 2. ������ �����: Runnable �������̽��� �����ؼ� ����Ѵ�.
		// ��ӵ� ��밡���ϴ�.
		// ����: ��Ƽ�����带 ���ؼ� Thread ��ü�� ��Ƽ� ����Ѵ�.
		ThreadImplements ti1 = new ThreadImplements("��");
		ThreadImplements ti2 = new ThreadImplements("��");
		
		// Single Thread
		ti1.run();
		ti2.run();
		
		Thread t1 = new Thread(ti1);
		Thread t2 = new Thread(ti2);
		
		// Multi Thread
		t1.start();
		t1.join(); // t1 �����尡 ���� ������ ���ξ����尡 ��ٸ���.
		t2.start();
		t2.join();
		
		System.out.println("���� �Ϸ�");
	}

}

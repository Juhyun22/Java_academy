package thread_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 1. ������ ����� : Thread Ŭ������ ��ӹ޾� ����Ѵ�.
		// ����: �ڹٴ� ���ϻ���̹Ƿ� Thread�� ��ӹ����� �ٸ� Ŭ������ �Բ� ��� ���� �� ����.
		ThreadExtends te1 = new ThreadExtends("��");
		ThreadExtends te2 = new ThreadExtends("��");
		
		// Single Thread�� ���� -> ������ ����
//		te1.run();
//		te2.run();
		
		// Multi Thread: ������ �����尡 ���ÿ� ����(start �޼ҵ� ���)
		// ��µǴ� �ӵ��� ���� �̱� ������ó�� ���̹Ƿ� sleep�޼ҵ� �߰�
		te1.start();
		te2.start();
		
		System.out.println("���� �Ϸ�");
	}

}

package thread_ex;

public class ThreadExtends extends Thread {
	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		// ���⼭ �����ϴ� ������ �����忡�� ����Ǵ� ����
		
		// resource ���� ���
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // 0.5�ʾ� ���鼭 ��´�.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(this.resource + " ");
		}
	}
}

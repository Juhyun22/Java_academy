package method_ex;

public class Ex02 {

	public static void main(String[] args) {
		// �޼ҵ� �����
		// 1. � �޼ҵ带 ������ �̸��� ���´�. (����)
		// 2. input���� ������ ���� �� �����Ѵ�. (���� ����)
		// 3. output�� �������� �������� �����Ѵ�. (���� ����)
		// 4. �����Ѵ�.
		
		// �޼ҵ带 ����ϴ� ��
		int x = 30;
		int y = 50;
		int result = sum(x, y);   // 30, 50  ���� ����(argument)
		System.out.println(result);
		System.out.println(sum(x, y));
		
		printHelloWorld();
	}
	
	// static: ����. static �޼ҵ尡 �ٸ� �޼ҵ带 �θ��� ���
	// �޸𸮿� ������ ������ �� ���� ������ static�� �����Ѵ�.
	
	// �޼ҵ� ����� ��
	public static int sum(int a, int b) {  // 30, 50 �Ű�����(parameter)
		System.out.println("���ϱ� �޼ҵ�");
		return a + b;  // 80
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello world");
		return;  // �޼ҵ� ����, ���� ����
	}
	
	
	
	

}





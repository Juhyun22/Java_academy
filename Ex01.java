package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		// ������ ���� (Integer)
		int number = 10; // ������ ���� �ִ� ��: �ʱ�ȭ, ����, assign 
		System.out.println(number);
		
		number = 5; // �����̹Ƿ� ���� ������ �� �ִ�. ������ ���� �ڷ���(data type)�� ���� �ʴ´�.
		System.out.println(number);
		
		int number2 = 100;
		int sum = number + number2;
		System.out.println(sum);
		
		// �Ǽ� ���� (float) - �������
		float f = 1.5f;
		System.out.println(f);
		
		// �Ǽ� ���� (double)
		double d = 3.8;
		System.out.println(d);
		
		// ���� ���� (character): ���� �Ѱ�. �ۿ� ����ǥ�� ���Ѵ�.
		char c = 'z';
		System.out.println(c);
		
		// boolean ���� : ��(true) �Ǵ� ����(false)
		// is_real : snake case.. python
		// isReal : camel case.. java
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println(isFalse);
	}

}





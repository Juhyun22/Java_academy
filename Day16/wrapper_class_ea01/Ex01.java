package wrapper_class_ea01;

public class Ex01 {

	public static void main(String[] args) {
		// �⺻ �ڷ���(primitive type)
		int n1 = 5;
		System.out.println(n1);
		
		// ���� Ŭ����(Wrapper class)�� �� ����
		Integer n2 = 5;
		System.out.println(n2);
		
		// ���� Ŭ����(Wrapper class)�� �� ����]
		Integer n3 = new Integer(5);
		System.out.println(n3);
		
		// �⺻ �ڷ����� ���� Ŭ���� �񱳽� "�� ��"
		System.out.println(n1 == n2); // true
		System.out.println(n1 == n3); // true
		System.out.println(n2 == n3); // false �� �� ��ü�� ��쿡�� �ּҰ� �񱳵Ǿ� .equals()�� ���ؾ���
		System.out.println(n3.equals(n2)); // true
		
		Integer num1 = 100;
		Integer num2 = 100;
		System.out.println(num1 == num2); // true ���������δ� �ּҰ� ���� ��. constant pool
		
		Integer num3 = new Integer(100);
		Integer num4 = new Integer(100);
		System.out.println(num3 == num4); // false �ּҰ� �ٸ���. �׷��� false
		System.out.println(num3.equals(num4)); // �� ��
	}

}

package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String ������ �� �����ϱ�
		String a = "�ȳ��ϼ���";
		String b = new String("�ȳ��ϼ���");  // ��ü
		String c = new String("�ȳ��ϼ���");
		String d = "�ȳ��ϼ���";
		
		System.out.println(a);
		System.out.println(b);
		
		// String ���� �� ���ϱ�
		// == �񱳴� stack ������ ����ִ� �ּҟ��� ���� ���̴�.
		// String �񱳸� �� ���� .equals()�� ����ؾ� �Ѵ�.
 		System.out.println(a == d);  // true
		System.out.println(b == c);  // false
		System.out.println(a == b);  // false
		System.out.println(a.equals(b));  // ���� �� .. true
		
	} // main

} // class









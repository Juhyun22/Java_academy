package string_ex;

public class Ex02 {

	public static void main(String[] args) {
		// �ڷ��� ��ȯ
		// ���� 3  <->  String "3"
		
		// StringBuilder �Ǵ� StringBuffer
		// 1. ���� -> ���ڿ�
		int number = 3;
		// (1)
		String str1 = number + "";  // ���� + ���ڿ� => ���ڿ�
		System.out.println(str1);
		// (2)
		String str2 = String.valueOf(number);
		System.out.println(str2);
		
		
		// 2. ���ڿ� -> ����
		String str3 = "5";
		int num = Integer.parseInt(str3);
		int num1 = Integer.valueOf(str3);
		System.out.println(num);
		System.out.println(num1);
	}

}

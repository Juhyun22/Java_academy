package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		// �ڷ���(data type) ��ȯ => casting
		double pi = 3.14;
		int intPi = (int)pi; // double���� int�� ��ȯ: �Ҽ��� �Ʒ��ڸ� ����
		System.out.println(intPi);
		System.out.println((double)intPi); // int -> double�� ��ȯ: �ڿ� .0�� �ٴ´�.
		
		int number = 7;
		double result = number / 2; // ���� ��: 3.5    int / int => int
		System.out.println(result);
		
		// 1. �� �� �ϳ��� ���� �Ǽ��� ����ȯ(casting) �Ѵ�.
		result = (double)number / 2;
		System.out.println(result);
		
		// 2. �Ǽ��� ������.
		result = number / 2.0;
		System.out.println(result);
		
		// �ݿø� �ϴ¹�
		// Math.round(3.14) => 3     Math.round(3.8) => 4
		pi = 3.141592653;
		System.out.println(Math.round(pi));
		
		// �Ҽ� ��°�ڸ����� �ݿø� �ϱ� .. �ļ��Դϴ�
		// 1. pi�� 100�� ���ؼ� 314.1592653
		// 2. Math.round() �̿��ؼ� ù°�ڸ����� �ݿø� �Ѵ�. => ������ �ȴ�. 314
		// 3. pi�� 100�� ����� ���� ��Ų��. 314 => 3.14
		System.out.println(Math.round(pi * 100) / 100.0); // ������ int���� �� Ȯ��
		
	}

}








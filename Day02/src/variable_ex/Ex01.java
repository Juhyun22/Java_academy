package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		int noodleCup = 850;
		System.out.println("������ ����:" + noodleCup +"��");
		
		// ������ 3�� ���� ���
		// ������: 850, ������ 3��: ?
		int noodleCupSum = noodleCup * 3;
		System.out.println("������:" + noodleCup +", ������ 3��:" + noodleCupSum);
		
		// 10,000������ ������ 3���� �� �Ŀ� �Ž����� ���ϱ�
		int money = 10000;
		int change = money - noodleCupSum;
		System.out.println("�Ž�����:" + change);
		
		// 5,000������ �������� � �� �� �ְ�, �Ž������� �󸶳� ���°�?
		money = 5000;
		int buyNoodleCup = money / noodleCup;
		System.out.println("�� �� �ִ� ����:" + buyNoodleCup);
		
		change = money % noodleCup; // ������ ���ϴ� ������ : %
		System.out.println("�Ž�����:" + change);
	}

}





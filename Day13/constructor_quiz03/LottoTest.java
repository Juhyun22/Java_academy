package constructor_quiz03;

public class LottoTest {

	public static void main(String[] args) {
		// LottoChecker ��ü ���� �� ��÷��ȣ�� �����ȴ�.
		LottoChecker lottoChecker = new LottoChecker();
		lottoChecker.printLuckyNumber();

		Lotto lotto1 = new Lotto();

		// ����
		lotto1.manual(6, 10, 21, 23, 29, 44);
		lotto1.printLottoNumber();
		String lottoResult1 = lottoChecker.check(lotto1);
		// ���
		System.out.println("�ζ� ���� ���:" + lottoResult1);

		Lotto lotto2 = new Lotto();
		// �ڵ�
		lotto2.auto();
		lotto2.printLottoNumber();
		String lottoResult2 = lottoChecker.check(lotto2);
		// ���
		System.out.println("�ζ� �ڵ� ���:" + lottoResult2);
	}

}

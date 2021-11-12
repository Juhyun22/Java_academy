package constructor_quiz03;

public class LottoTest {

	public static void main(String[] args) {
		// LottoChecker 객체 생성 시 당첨번호가 생성된다.
		LottoChecker lottoChecker = new LottoChecker();
		lottoChecker.printLuckyNumber();

		Lotto lotto1 = new Lotto();

		// 수동
		lotto1.manual(6, 10, 21, 23, 29, 44);
		lotto1.printLottoNumber();
		String lottoResult1 = lottoChecker.check(lotto1);
		// 출력
		System.out.println("로또 수동 결과:" + lottoResult1);

		Lotto lotto2 = new Lotto();
		// 자동
		lotto2.auto();
		lotto2.printLottoNumber();
		String lottoResult2 = lottoChecker.check(lotto2);
		// 출력
		System.out.println("로또 자동 결과:" + lottoResult2);
	}

}

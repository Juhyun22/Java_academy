package constructor_quiz03;

import java.util.Random;

public class LottoChecker {
//	1���� 45������ 6�� ���� �������� ��÷��ȣ�� �����.
//	�ζǸ� �Է� �޾Ƽ� �ش� Ŭ������ ���� ��÷���θ� Ȯ���Ѵ�.
//
//	6��: 1��, 5��: 2��, 4��: 3��, 3��: 4��, ������: ��

	private int[] lottoAnswer = new int[6];

	public LottoChecker() { // ������: �ѹ� ������ ���� ��ȭ���� �ʴ´�. �ٲܼ� ����.
		// �������� �̾Ƽ� lottoAnswer �迭�� ä�� ����
		// �ڵ����� 
		Random rand = new Random();

		for (int i = 0; i < this.lottoAnswer.length; i++) {
			int randNum = rand.nextInt(45) + 1;
			boolean isDupliaction = false;
			// �ߺ� Ȯ��
			for (int j = 0; j < this.lottoAnswer.length; j++) {
				if (lottoAnswer[j] == 0) {
					break;
				}
				if (randNum == this.lottoAnswer[j]) {
					i--;
					isDupliaction = true;
					break;
				}
			}

			if (isDupliaction == false) {
				lottoAnswer[i] = randNum;
			}
		}

	}

	// ��÷ ��� Ȯ��
	public String check(Lotto lotto) {
//		int checker = 0;
//		for (int i = 0; i < this.lottoAnswer.length; i++) {
//			if (this.lottoAnswer[i] == Lotto.getNumber()[i]) {
//				checker++;
//			}
//		}
//
//		switch (checker) {
//		case 6:
//			return "1��";
//		case 5:
//			return "2��";
//		case 4:
//			return "3��";
//		case 3:
//			return "4��";
//		default:
//			return "��";
//		}
//
		int[] numbers = lotto.getNumber(); // �ζ� ���̿� �ִ� 6�� ����
		
		int count = 0; // �� ���� �¾Ҵ���
		for (int i = 0; i < this.lottoAnswer.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (this.lottoAnswer[i] == numbers[j]) {
					count++;
					break; // �ڿ��� ���� ��ȣ ���ø��� ���⿡ for�� �����ش�.
				}
			}
		}
		
		if (count == 6) {
			return "1��";
		} else if (count == 5) {
			return "2��";
		} else if (count == 4) {
			return "3��";
		} else if (count == 3) {
			return "4��";
		} else {
			return "��";
		}
		
	}
	
	public void printLuckyNumber() {
		for (int i = 0; i < this.lottoAnswer.length; i++) {
			System.out.print(this.lottoAnswer[i] + " ");
		}
		System.out.println();
	}
		

} // class

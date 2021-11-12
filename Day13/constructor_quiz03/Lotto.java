package constructor_quiz03;

import java.util.Random;

public class Lotto {
	// �ʵ�
	private int[] lottoNumber = new int[6];

	// ��ȣ �ޱ�, �ֱ�
	// ���� - ���� ��ŷ�� ��ȣ�� �����Ѵ�.
	public void manual(int a1, int a2, int a3, int a4, int a5, int a6) {
		this.lottoNumber[0] = a1;
		this.lottoNumber[1] = a2;
		this.lottoNumber[2] = a3;
		this.lottoNumber[3] = a4;
		this.lottoNumber[4] = a5;
		this.lottoNumber[5] = a6;
	}

	// �ڵ� - �˾Ƽ� 6���� ���ڸ� �����Ѵ�.
	public void auto() {
		// �ڵ�����
		Random rand = new Random();

		for (int i = 0; i < this.lottoNumber.length; i++) { // ���� �ε���
			int randNum = rand.nextInt(45) + 1;
			boolean isDuplication = false; // �ߺ� ����
			// �ߺ� Ȯ��
			for (int j = 0; j < this.lottoNumber.length; j++) { // �ߺ����� Ȯ��
				if (lottoNumber[j] == 0) { // ���� ��ä���� ĭ�� �߰ߵǸ� �˻����� ����. ���⵵�� ���߱� ����
					break;
				}
				if (randNum == lottoNumber[j]) {
					i--; // ���� i ĭ�� �ѹ� �� ������ ����
					isDuplication = true;
					break;
				}
			}

			// �ߺ��� ���� ���� ��쿡�� �ߺ��� �־��ش�.
			if (isDuplication == false) {
				lottoNumber[i] = randNum;
			}
		}
	}

	public int[] getNumber() {
		return this.lottoNumber;
	}
	
	public void printLottoNumber() {
		for (int i = 0; i < this.lottoNumber.length; i++) {
			System.out.print(this.lottoNumber[i] + " ");
		}
		System.out.println();
	}

}

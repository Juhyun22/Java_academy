package constructor_quiz03;

import java.util.Random;

public class Lotto {
	// 필드
	private int[] lottoNumber = new int[6];

	// 번호 받기, 주기
	// 수동 - 직접 마킹한 번호를 저장한다.
	public void manual(int a1, int a2, int a3, int a4, int a5, int a6) {
		this.lottoNumber[0] = a1;
		this.lottoNumber[1] = a2;
		this.lottoNumber[2] = a3;
		this.lottoNumber[3] = a4;
		this.lottoNumber[4] = a5;
		this.lottoNumber[5] = a6;
	}

	// 자동 - 알아서 6개의 숫자를 세팅한다.
	public void auto() {
		// 자동으로
		Random rand = new Random();

		for (int i = 0; i < this.lottoNumber.length; i++) { // 기준 인덱스
			int randNum = rand.nextInt(45) + 1;
			boolean isDuplication = false; // 중복 여부
			// 중복 확인
			for (int j = 0; j < this.lottoNumber.length; j++) { // 중복인지 확인
				if (lottoNumber[j] == 0) { // 아직 안채워진 칸이 발견되면 검사하지 않음. 복잡도를 낮추기 위해
					break;
				}
				if (randNum == lottoNumber[j]) {
					i--; // 같은 i 칸을 한번 더 돌리기 위해
					isDuplication = true;
					break;
				}
			}

			// 중복인 값이 없던 경우에는 중복을 넣어준다.
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

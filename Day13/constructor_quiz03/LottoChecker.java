package constructor_quiz03;

import java.util.Random;

public class LottoChecker {
//	1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다.
//	로또를 입력 받아서 해당 클래스를 통해 당첨여부를 확인한다.
//
//	6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝

	private int[] lottoAnswer = new int[6];

	public LottoChecker() { // 생성자: 한번 생성된 값이 변화하지 않는다. 바꿀수 없당.
		// 랜덤으로 뽑아서 lottoAnswer 배열에 채워 넣음
		// 자동으로 
		Random rand = new Random();

		for (int i = 0; i < this.lottoAnswer.length; i++) {
			int randNum = rand.nextInt(45) + 1;
			boolean isDupliaction = false;
			// 중복 확인
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

	// 당첨 등수 확인
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
//			return "1등";
//		case 5:
//			return "2등";
//		case 4:
//			return "3등";
//		case 3:
//			return "4등";
//		default:
//			return "꽝";
//		}
//
		int[] numbers = lotto.getNumber(); // 로또 종이에 있는 6개 숫자
		
		int count = 0; // 몇 개가 맞았는지
		for (int i = 0; i < this.lottoAnswer.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (this.lottoAnswer[i] == numbers[j]) {
					count++;
					break; // 뒤에서 같은 번호 나올리가 없기에 for문 나와준다.
				}
			}
		}
		
		if (count == 6) {
			return "1등";
		} else if (count == 5) {
			return "2등";
		} else if (count == 4) {
			return "3등";
		} else if (count == 3) {
			return "4등";
		} else {
			return "꽝";
		}
		
	}
	
	public void printLuckyNumber() {
		for (int i = 0; i < this.lottoAnswer.length; i++) {
			System.out.print(this.lottoAnswer[i] + " ");
		}
		System.out.println();
	}
		

} // class

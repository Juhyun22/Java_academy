package constructor_quiz02;

public class OmrCardTest {

	public static void main(String[] args) {
		// 나의 의식
		
		// 비어있는 OMR CARD를 받는다.
		// 학번, 이름, 정답 5개를 마킹한다.
		OmrCard omrCard = new OmrCard();
		omrCard.setStudentId(20200302);
		omrCard.setName("신보람");
		omrCard.setAnswer(1, 5, 4, 5, 5);
		
		
		// 리더기를 가지고온다.
		// 리더기한테 진짜 정답 5개를 넣어둔다.
		// 리더기한테 OmrCard를 넣고 채점을 요청한다.
		OmrCardReader omrCardReader = new OmrCardReader(2, 5, 4, 3, 1);
		omrCardReader.printScore(omrCard);
		
	}

}

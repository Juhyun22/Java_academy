package constructor_quiz02;

public class OmrCardTest {

	public static void main(String[] args) {
		// ���� �ǽ�
		
		// ����ִ� OMR CARD�� �޴´�.
		// �й�, �̸�, ���� 5���� ��ŷ�Ѵ�.
		OmrCard omrCard = new OmrCard();
		omrCard.setStudentId(20200302);
		omrCard.setName("�ź���");
		omrCard.setAnswer(1, 5, 4, 5, 5);
		
		
		// �����⸦ ������´�.
		// ���������� ��¥ ���� 5���� �־�д�.
		// ���������� OmrCard�� �ְ� ä���� ��û�Ѵ�.
		OmrCardReader omrCardReader = new OmrCardReader(2, 5, 4, 3, 1);
		omrCardReader.printScore(omrCard);
		
	}

}

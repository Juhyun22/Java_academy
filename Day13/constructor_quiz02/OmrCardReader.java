package constructor_quiz02;

public class OmrCardReader {
	// �ʵ�
	private int[] correctAnswer = new int[5]; // ��¥ ����
	
	// �޼ҵ�
	// ��¥ ������ '�����'�κ��� �޴� ������ Ȯ�强�� ���ؼ� 
	public OmrCardReader(int a1, int a2, int a3, int a4, int a5) {
		this.correctAnswer[0] = a1;
		this.correctAnswer[1] = a2;
		this.correctAnswer[2] = a3;
		this.correctAnswer[3] = a4;
		this.correctAnswer[4] = a5;
	}
	
	// ä���ϰ� ���� ���
	public void printScore(OmrCard omrCard) {
		System.out.println("�̸� : " + omrCard.getName());
		System.out.println("�й� : " + omrCard.getStudentId());
		
		// ���� ���ϱ�
		int score = 0;
		for (int i = 0; i < this.correctAnswer.length; i++) {
			if (this.correctAnswer[i] == omrCard.getNAnswer()[i]) {
				score += 100 / this.correctAnswer.length;
			}
		}
		
		System.out.println("���� : " + score);
	}
	
	
} // class

package class_ex01;

public class Ex01 {

	public static void main(String[] args) {
		// ���� �ǽ� (��� ���� �Ͼ)
		// Ŭ����: ���� ���� �ڷ����̴�.
		// ���赵 -> ��ü(Object): �ν��Ͻ�ȭ �Ѵ�.    ScoreData�� instance
		ScoreData sd1 = new ScoreData(); // sd1�� ��ü�̴�. new�� �Ҵ�� ���� ��¥ heap�� �޸𸮰� �����.
		
		// �ʵ忡 �� �ֱ�
		sd1.subject = "����";
		sd1.score = 85;
		sd1.rank = 7;
		
		// �ʱ� �� ����ϱ�
		System.out.println(sd1.subject);
		System.out.println(sd1.score);
		System.out.println(sd1.rank);
		
		// �޼ҵ带 ȣ��
		sd1.printInfo();
	}

}

package constructor_quiz02;

public class CircleTest {

	public static void main(String[] args) {
		// ���� �����.
		Circle cir1 = new Circle(8);
		
		// ���� ����
		// ���� �ѷ�
		// �� 25���� ����
		System.out.println("���� ���� : " + cir1.getArea());
		System.out.println("���� �ѷ� : " + cir1.getRound());
		System.out.println("�� 25�� ���� : " + cir1.getArea(25));
		System.out.println();
	}

}

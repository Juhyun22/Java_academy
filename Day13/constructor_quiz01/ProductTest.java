package constructor_quiz01;

public class ProductTest {

	public static void main(String[] args) {
		// ���� �ǽ� = ����ϴ� ��
		Product p1 = new Product("�����", 1300, "2022-01-03");
		
		System.out.println("�̸� : " + p1.getName());
		System.out.println("���� : " + p1.getPrice());
		System.out.println("������� : " + p1.getExpiration());
		System.out.println();
		
		System.out.println("��ǰ�� 5���� ���� : " + p1.calculatePrice(5));
		System.out.println("��ǰ�� 13���� ���� : " + p1.calculatePrice(13));
		System.out.println(p1.availableSale());
	} // main
	
} // class

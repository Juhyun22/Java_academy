package constructor_quiz03;

public class ProductTest {

	public static void main(String[] args) {
		Product pr = new Product("�����", 1300, "20210302");
		
		System.out.println("�̸� : " + pr.printName());
		System.out.println("���� : " + pr.printPrice());
		System.out.println("������� : " + pr.printDate());
		System.out.println();
		
		System.out.println("5���� ���� : " + pr.isPrice(5));
		pr.isSelling();
		
	}

}

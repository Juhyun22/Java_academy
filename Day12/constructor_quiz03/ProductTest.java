package constructor_quiz03;

public class ProductTest {

	public static void main(String[] args) {
		Product pr = new Product("새우깡", 1300, "20210302");
		
		System.out.println("이름 : " + pr.printName());
		System.out.println("가격 : " + pr.printPrice());
		System.out.println("유통기한 : " + pr.printDate());
		System.out.println();
		
		System.out.println("5개의 개수 : " + pr.isPrice(5));
		pr.isSelling();
		
	}

}

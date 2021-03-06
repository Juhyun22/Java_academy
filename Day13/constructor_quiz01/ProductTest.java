package constructor_quiz01;

public class ProductTest {

	public static void main(String[] args) {
		// 나의 의식 = 사용하는 쪽
		Product p1 = new Product("새우깡", 1300, "2022-01-03");
		
		System.out.println("이름 : " + p1.getName());
		System.out.println("가격 : " + p1.getPrice());
		System.out.println("유통기한 : " + p1.getExpiration());
		System.out.println();
		
		System.out.println("제품이 5개의 가격 : " + p1.calculatePrice(5));
		System.out.println("제품이 13개의 가격 : " + p1.calculatePrice(13));
		System.out.println(p1.availableSale());
	} // main
	
} // class

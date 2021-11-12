package constructor_quiz01;

public class Product {
	// 1. 속성, 필드
//	이름 : 새우깡
//	가격 : 1300 
//	유통기한 : 2021-03-02 
	private String name;
	private int price;
	private String expiration;
	
	// 2. 행위, 메소드
	// 생성자
	public Product(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getExpiration() {
		return this.expiration;
	}
	
	// 제품 n개의 가격
	public int calculatePrice(int count) {
		return price * count;
	}
	
	// 판매 가능 여부
	public String availableSale() {
		// 2022-01-03  오늘날짜 <= 유통기한 판매 가능, 오늘날짜 > 유통기한 판매 불가
		// 첫번째 방법
//		String[] expirationArray = this.expiration.split("-");
//		int year = Integer.valueOf(expirationArray[0]);
//		int month = Integer.valueOf(expirationArray[1]);
//		int day = Integer.valueOf(expirationArray[2]);
//		
//		if (year > 2021) {
//			return "판매 가능 상품";
//		} else if (year == 2021) { // 같은 년도이면 월도 본다.
//			if (month > 11) {
//				return "판매 가능 상품";
//			} else if (month == 11) { // 같은 년도이고 같은 월이며 일도 본다.
//				if (day > 10) {
//					return "판매 가능 상품";
//				}
//			}
//		}
		
		// 두번째 방법
		// compareTo
		// "2022-03-02"    "2021-11-10" 비교
		
		// 기준값이 크면: 1
		// 같으면: 0
		// 기준값이 작으면: -1
		
		if (this.expiration.compareTo("2021-11-10") >= 0) {
			return "판매 가능 상품";
		}
		
		return "판매 불가 상품";
	}
	
} // class







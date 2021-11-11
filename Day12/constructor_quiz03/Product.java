package constructor_quiz03;

public class Product {
	private String name;
	private int price;
	private String date;
	
	public Product(String name, int price, String date) {
		this.name = name;
		this.price = price;
		this.date= date;
	}
	
	public int calculatePrice(int n) {
		return this.price * n;
	}
	
	public String printName() {
		return this.name;
	}
	
	public int printPrice() {
		return this.price;
	}
	
	public String printDate() {
		return this.date;
	}
	
	public void isSelling() {
		if (Integer.valueOf(this.date.substring(0, 4)) > 2021 ) {
			System.out.println("�Ǹ� ���� ��ǰ");
		} else if (Integer.valueOf(this.date.substring(4, 6)) > 11) {
			System.out.println("�Ǹ� ���� ��ǰ");
		} else if (Integer.valueOf(this.date.substring(6, 8)) > 9) {
			System.out.println("�Ǹ� ���� ��ǰ");
		} else {
			System.out.println("�Ǹ� �Ұ� ��ǰ");
		}
		
	}
	
	public int isPrice(int n) {
		return this.price * n;
	}
	
}

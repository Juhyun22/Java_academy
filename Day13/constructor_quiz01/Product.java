package constructor_quiz01;

public class Product {
	// 1. �Ӽ�, �ʵ�
//	�̸� : �����
//	���� : 1300 
//	������� : 2021-03-02 
	private String name;
	private int price;
	private String expiration;
	
	// 2. ����, �޼ҵ�
	// ������
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
	
	// ��ǰ n���� ����
	public int calculatePrice(int count) {
		return price * count;
	}
	
	// �Ǹ� ���� ����
	public String availableSale() {
		// 2022-01-03  ���ó�¥ <= ������� �Ǹ� ����, ���ó�¥ > ������� �Ǹ� �Ұ�
		// ù��° ���
//		String[] expirationArray = this.expiration.split("-");
//		int year = Integer.valueOf(expirationArray[0]);
//		int month = Integer.valueOf(expirationArray[1]);
//		int day = Integer.valueOf(expirationArray[2]);
//		
//		if (year > 2021) {
//			return "�Ǹ� ���� ��ǰ";
//		} else if (year == 2021) { // ���� �⵵�̸� ���� ����.
//			if (month > 11) {
//				return "�Ǹ� ���� ��ǰ";
//			} else if (month == 11) { // ���� �⵵�̰� ���� ���̸� �ϵ� ����.
//				if (day > 10) {
//					return "�Ǹ� ���� ��ǰ";
//				}
//			}
//		}
		
		// �ι�° ���
		// compareTo
		// "2022-03-02"    "2021-11-10" ��
		
		// ���ذ��� ũ��: 1
		// ������: 0
		// ���ذ��� ������: -1
		
		if (this.expiration.compareTo("2021-11-10") >= 0) {
			return "�Ǹ� ���� ��ǰ";
		}
		
		return "�Ǹ� �Ұ� ��ǰ";
	}
	
} // class







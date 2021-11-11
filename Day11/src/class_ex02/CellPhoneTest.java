package class_ex02;

public class CellPhoneTest {

	public static void main(String[] args) {
		// 나의 의식
		CellPhone cp1 = new CellPhone();
		cp1.maker = "iphone";
		cp1.model = "eight";
		cp1.color = "rosegold";
		cp1.price = 1000000;
		
		System.out.println(cp1.maker);
		System.out.println(cp1.model);
		System.out.println(cp1.color);
		System.out.println(cp1.price);
		
		cp1.call();
		cp1.camera();
		
		// 핸드폰 100개 만들기
		CellPhone[] cellphones = new CellPhone[100];
		for (int i = 0; i < cellphones.length; i++) {
			cellphones[i] = new CellPhone();
		}
		
		for (int i = 0; i < cellphones.length; i++) {
			System.out.println(cellphones[i].model);
		}
		
		// 필드 값 변경하기
		cp1.maker = "samsung";
		System.out.println(cp1.maker);
		
	} // main

} // class

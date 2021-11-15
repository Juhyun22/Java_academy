package polymorphism_quiz01;

public class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("¾ß¿Ë");
	}
	
	public void groom() {
		System.out.println("±×·ç¹Ö");
	}
}

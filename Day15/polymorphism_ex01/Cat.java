package polymorphism_ex01;

public class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	public void grooming() {
		System.out.println("그루밍하기");
	}
	
}

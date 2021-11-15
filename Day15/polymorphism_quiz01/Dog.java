package polymorphism_quiz01;

public class Dog extends Animal {
	@Override
	public void cry() {
		System.out.println("港港");
	}
	
	public void lash() {
		System.out.println("部府 如甸如甸");
	}
}

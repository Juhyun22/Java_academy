package inheritance_ex01;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("�л��Դϴ�.");
	}
	
	public Student(String name, String major) {
		super(name); // �θ��� ������ ȣ���� ù��° �ٿ� �ؾ� �Ѵ�. 
		this.major = major;
		// super.name = name;
		// this.name = name;
	}
	
	// �������̵� : ���, �θ� Ŭ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������ �ϴ� ��
	@Override // ������̼�(annotation): ��Ÿ���� : �θ�Կ��� ������ ���� �����ϰڵ�
	public void introduce() {
		// System.out.println("�� �̸��� : " + this.name);
		super.introduce();
		System.out.println("�� ������ : " + this.major);
	}
}

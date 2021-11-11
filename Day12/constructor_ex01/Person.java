package constructor_ex01;

public class Person {
	// 1. �Ӽ�, �ʵ�
	// ����ȭ(hiding): private���� ����
	private String name;
	private String birth;
	private String sex;

	// 2. ����, �޼ҵ�
	// ������(Constructor): ��ü�� ������ �� �ҷ����� Ư���� �޼ҵ�
	// ���� Ÿ���� �������� �ʴ´�.
	// �����ڸ� �������� ������ �⺻ �����ڰ� �����ȴ�.
	// void ���� ���
	public Person() {
		System.out.println("����~~~~");
	}
	// ������ �����ε�(Overloading): �޼ҵ� �̸��� ������ ��ġ�ϴ� �޼ҵ带 �����ؼ� ����
	// input�� ��
	// 1) �Ķ���� ������ �ٸ� ���
	// 2) ������ ���Ƶ� Ÿ���� �ٸ� ���
	public Person(String name, String birth, String sex) {
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		System.out.println("�Ķ���Ͱ� 3���� ������");
	}
	
	// getter, setter - ĸ��ȭ(encapsulation)
	public void setName(String name) {
		// �̸�: ������=> ������ �����ϱ� ������
		// �ʵ忡 �ٷ� ���� �ʰ� setter�� �̿��Ѵ�.
		this.name = name;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public void sayHello() {
		System.out.println("�ȴ���");
	}

	public void walking() {
		System.out.println("���� �Ȱ� �ֽ�");
	}

	public void introducceMyself() {
		System.out.println("�� �̸��� " + this.name + "�̰� ������ " + this.sex + "�̾� �ʴ�?");
	}

	public void tellAge() {
		int age = 2021 - Integer.valueOf(this.birth.substring(0, 4)) + 1;
		System.out.println("���̴� " + age + "���̴�");
	}

}

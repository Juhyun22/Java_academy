package class_quiz01;

// ���赵
public class Person {
	// 1. �Ӽ�, �ʵ�
	String name;
	String birth;
	String sex;
	
	// 2. ����, �޼ҵ�
	public void sayHello() {
		System.out.println("�ȴ���");
	}
	
	public void walking() {
		System.out.println("���� �Ȱ� �ֽ�");
	}
	
	public void introducceMyself() {
		System.out.println("�� �̸��� " + this.name + "�̰� ������ " + this.sex +"�̾� �ʴ�?");
	}
	
	public void tellAge() {
		int age = 2021 - Integer.valueOf(this.birth.substring(0, 4)) + 1;
		System.out.println("���̴� " + age + "���̴�");
	}

}

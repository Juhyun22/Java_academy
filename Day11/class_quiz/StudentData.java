package class_quiz;

public class StudentData {
    // �ʵ�  = �̸�, ������, ����, ��ȭ��ȣ
	String name;
	int age;
	String className;
	String phoneNumber;
	
	// �̼��������� �ƴ���
	void isAdult() {
		if (this.age >= 20) { 
			System.out.println(this.name + "�� �����Դϴ�.");
		} else {
			System.out.println(this.name + "�� �̼������Դϴ�.");
		}
		
	}
}

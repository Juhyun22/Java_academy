package abstract_class_ex01;

// �߻�Ŭ����(abstract class): �߻� �޼ҵ尡 �ϳ��� �����ϴ� Ŭ����
public abstract class Animal {
	// �߻� �޼ҵ�(abstract method): �ڽ�Ŭ������ �ݵ�� �����ؾ��ϴ� �޼ҵ��̴�.
	public abstract void cry();
	
	// �Ϲ� �޼ҵ�
	public void eat() {
		System.out.println("�ȳ�");
	}
}

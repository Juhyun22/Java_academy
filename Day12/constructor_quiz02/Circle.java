package constructor_quiz02;

public class Circle {
	// 1. �Ӽ�, �ʵ�
	private int rad;
	// private double pi = 3.14;
	
	// 2. ����, �޼ҵ�
	public Circle(int rad) {
		this.rad = rad;
	}
	
	// ����
	public double getArea() {
		return this.rad * this.rad * Math.PI;
	}
	
	// �ѷ�
	public double getRound() {
		return 2 * this.rad * Math.PI;
	}
	
	// 25���� ����
	// �����ε�: �޼ҵ� �̸��� ������, �Ķ������ ������ �ٸ��ų�
	// �Ķ������ Ÿ���� �ٸ� ���
	// �ٸ� �޼ҵ�� �����ϰ� ��ġ�ϴ� �޼ҵ�� ȣ�����ش�.
	public double getArea(int num) {
		return this.getArea() * num;
	}
	
}

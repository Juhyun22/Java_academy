package abstract_class_quiz01;

public abstract class Converter {
	abstract protected void printConverted(); // �߻� �޼ҵ�(�ʼ� ����)
	
	protected double ratio; // ����(ȯ�� �Ǵ� 1cm�� inch��)
	protected double result; // ���

	public Converter() {
		// do nothing
	}

	// ������
	public Converter(double ratio) {
		this.ratio = ratio;
	}

	// ���
	public void convert(int input) {
		this.result = input * ratio;
	}
}

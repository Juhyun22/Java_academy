package abstract_class_quiz01;

public class ConverterTest {

	public static void main(String[] args) {
		// ���� �ǽ�
		Converter d2w = new DollerToWon(1178); // ȯ�� �˻��ϱ�
		Converter c2i = new CmToInch(); // cm -> inch ���� �˻��ϱ�

		d2w.convert(10000); // input ��
		d2w.printConverted(); // �޷� -> ��

		c2i.convert(20); // input ��
		c2i.printConverted();
	}

}

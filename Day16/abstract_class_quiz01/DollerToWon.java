package abstract_class_quiz01;

public class DollerToWon extends Converter {
	
	public DollerToWon(double ratio) { // ȯ���� �Ź� ����Ǳ� ������ ��ü������ �� �� ��� �ܺο��� �޾ƿ´�.
		this.ratio = ratio;
	}

	@Override
	protected void printConverted() {
		System.out.println((int)this.result + "��");
	}

}

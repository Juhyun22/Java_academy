package abstract_class_quiz01;

public class DollerToWon extends Converter {
	
	public DollerToWon(double ratio) { // 환율은 매번 변경되기 때문에 자체적으로 알 수 없어서 외부에서 받아온다.
		this.ratio = ratio;
	}

	@Override
	protected void printConverted() {
		System.out.println((int)this.result + "원");
	}

}

package abstract_class_quiz01;

public class ConverterTest {

	public static void main(String[] args) {
		// 나의 의식
		Converter d2w = new DollerToWon(1178); // 환율 검색하기
		Converter c2i = new CmToInch(); // cm -> inch 비율 검색하기

		d2w.convert(10000); // input 값
		d2w.printConverted(); // 달러 -> 원

		c2i.convert(20); // input 값
		c2i.printConverted();
	}

}

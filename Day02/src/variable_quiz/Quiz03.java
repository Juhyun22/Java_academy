package variable_quiz;

public class Quiz03 {

	public static void main(String[] args) {
//		1. Æò±Õ ±¸ÇÏ±â
		int korean = 93;
		int math = 88;
		int english = 94;
		
		double average;
		average = (korean + math + english) / 3.0;
		// = average = double(korean + math + english) / 3;
		// = average = (korean + math + english) / (double)3;
		
		System.out.println("±¹¾î:" + korean + ", ¼öÇÐ:" + math + ", ¿µ¾î:" + english);
		System.out.println("Æò±Õ: " + Math.round(average * 100) / 100.0);
		System.out.println();
		
//		2. È­¾¾ ±¸ÇÏ±â
		int c = 30;
		double f = 9.0 / 5 * c + 32;
		
		System.out.println("¼·¾¾ " + c + "µµ´Â È­¾¾ " + f + "µµ ÀÔ´Ï´Ù.");
		System.out.println();
	}

}

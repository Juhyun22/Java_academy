package inheritance_quiz01;

public class HealthTest {

	public static void main(String[] args) {
		// ���� �ǽ�
//		HealthRate hi1 = new HealthRate("�ڵѸ�", 160, 45);
//		hi1.showInfo();
//		hi1.isFat();
//	
//		HealthRate hi2 = new HealthRate("ȫ�浿", 168, 90);
//		hi2.showInfo();
//		hi2.isFat();
		
		HealthRate rate1 = new HealthRate("�ڵѸ�", 160, 45);
		// Student  �θ������, �ڽĻ�����
		rate1.showInfo();
		
		HealthRate rate2 = new HealthRate("ȫ�浿", 168, 90);
		rate2.showInfo();
	}

}

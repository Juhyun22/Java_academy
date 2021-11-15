package inheritance_quiz01;

public class HealthRate extends HealthInfo {
	
	public HealthRate(String name, int height, int weight) {
		// ����� ������ �θ��� �⺻ �����ڰ� �ڵ����� �ҷ����µ�,
		// �θ� Ŭ������ �⺻ �����ڰ� ���� ��쿡��
		// 	- 1) �θ� Ŭ������ �⺻ �����ڸ� �����.
		//	- 2) �ڽ� Ŭ������ �����ڿ��� �θ�Ŭ������ �����ڸ� ���� ȣ�����ش�.
		
		super(name, height, weight);
		
		// super.name = name;
		// this.name = name;
	}

//	// ǥ�� ü���� ���ϴ� �޼ҵ�
//	public double calcluateSWB() {
//		double sw = (this.height - 100) * 0.9;
//		double b = (this.weight - sw) / sw * 100;
//		return b;
//	}
//	
//	// �� ���� Ȯ��
//	public void isFat() {
//		double b = calcluateSWB();
//		if (b < 10) {
//			System.out.println("�����Դϴ�.");
//		} else if (b >= 10 && b < 20) {
//			System.out.println("��ü���Դϴ�.");
//		} else {
//			System.out.println("���Դϴ�.");
//		}
//	}
	
	// ǥ�� ü�� ���ϴ� �޼ҵ�
	private double getStandardWeight() {
		// SW=(H-100)*0.9
		return (this.height - 100) * 0.9;
	}
	
	// �񸸵� ����ϴ� �޼ҵ�
	private double getRate() {
		double sw = getStandardWeight();
		// B(%)=(W-SW)/SW * 100
		return (this.weight - sw) / sw * 100;
	}
	
	// �� ���� �����
	private String status() {
		// �񸸵��� 10% �̸��̸� ����, 10%�̻� 20% �̸��̸� ��ü��, 20% �̻��� ��
		double rate = getRate();
		if (rate < 10) {
			return "�����Դϴ�.";
		} else if (rate < 20) { // 11 ~ 19
			return "��ü���Դϴ�.";
		} 
		return "���Դϴ�";
	}
	
	@Override // �� �߰�
	public void showInfo() {
		// �ڵѸ����� ���� 160, ������ 45kg => �����Դϴ�. 
		super.showInfo();
		System.out.println("=> " + status());
	}
	
} // class






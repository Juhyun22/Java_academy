package interface_ex01;

// ���ػ�
public class JobApplicant implements JavaProgramming, Cprogramming{
	// ����
//	private int toeic;
//	private double gradePoint;
//	private String[] licenses;
	
	// �ڱ�Ұ�
	public void introduce() {
		System.out.println("���� �鿣�� ����� �غ��ϴ�....");
	}

	@Override
	public void procedure() {
		System.out.println("C������ ������ �ְ�, �ݺ����� �ְ�, �Լ��� �ְ�...");
	}

	@Override
	public void objectOriented() {
		System.out.println("��ü������ ����ȭ�� �ְ� ĸ��ȭ�� �ְ�.....");
	}
}

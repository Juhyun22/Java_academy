package interface_quiz01;

// ��ȹ��
public class JypEntertainment {
	// ������ �����
	public void actorAudition(actorAudition actor) {
		actor.act(); // ���� �������� Ȯ���ϴ� �κ�.
		// System.out.println("finding actor who can act");
	}
	
	// ���̵� �����
	public void idolAudition(idolAudition idol) {
		idol.sing();
		// System.out.println("finding idol who can sing");
	}
}

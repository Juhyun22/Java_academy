package interface_quiz01;

// 기획사
public class JypEntertainment {
	// 연기자 오디션
	public void actorAudition(actorAudition actor) {
		actor.act(); // 연기 가능한지 확인하는 부분.
		// System.out.println("finding actor who can act");
	}
	
	// 아이돌 오디션
	public void idolAudition(idolAudition idol) {
		idol.sing();
		// System.out.println("finding idol who can sing");
	}
}

package interface_quiz01;

// 오디션 참가자
public class EntertainerApplicant implements actorAudition, idolAudition{

	@Override
	public void sing() {
		System.out.println("I can sing!");
	}

	@Override
	public void act() {
		System.out.println("I can act!");
	}
	
}

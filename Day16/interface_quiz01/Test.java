package interface_quiz01;

public class Test {

	public static void main(String[] args) {
		// ������
	    EntertainerApplicant boram = new EntertainerApplicant();

	    // ������ �� (JYP)
	    JypEntertainment jyp = new JypEntertainment();
	    jyp.actorAudition(boram);
	    jyp.idolAudition(boram);
	}

}

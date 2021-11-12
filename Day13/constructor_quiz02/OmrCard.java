package constructor_quiz02;

public class OmrCard {
	// 필드
	private int studentId;
	private String name;
	private int[] answer = new int[5];
	
	// 메소드
	
	// setter
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
		this.answer[0] = a1;
		this.answer[1] = a2;
		this.answer[2] = a3;
		this.answer[3] = a4;
		this.answer[4] = a5;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getNAnswer() {
		return this.answer;
	}
	
} // class








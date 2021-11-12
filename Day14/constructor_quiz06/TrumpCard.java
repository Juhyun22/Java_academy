package constructor_quiz06;

public class TrumpCard {
	// 카드 하나. 모양과 숫자
	private String cardShape;
	private int cardNum;
	
	public void setCardShape(String cardShape) {
		this.cardShape = cardShape;
	}
	
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	public String getCardShape() {
		return this.cardShape;
	}
	
	public int getCardNum() {
		return this.cardNum;
	}
}

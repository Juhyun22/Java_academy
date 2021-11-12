package constructor_quiz06;

import java.util.Random;

public class TrumpCardDeck {
	// 52개의 카드를 들고있는 곳
	// 모양 52개 만들고
	// 섞어
	private String[] allCard = new String[52];
	
	public TrumpCardDeck(TrumpCard trumpCard) {
		String spade = "s";
		String heart = "h";
		String diamond = "d";
		String club = "c";
		int cardNum = 13;
		
//		for (int i = 0; i < cardNum; i++) {
//			this.allCard[i + cardNum * 0] = trumpCard(spade, i);
//			this.allCard[i + cardNum * 1] = trumpCard(heart, i);
//			this.allCard[i + cardNum * 2] = trumpCard(diamond, i);
//			this.allCard[i + cardNum * 3] = trumpCard(club, i);
//		}
		
	}

//	public String[] mixCard() {
//		Random rand = new Random();
//		int randNum = rand.nextInt(52);
//		
//		String temp = this.allCard[0];
//		for (int i = 0; i < 1000; i++) {
//			
//		}
//	}
	
	
} // class

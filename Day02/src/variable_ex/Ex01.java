package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		int noodleCup = 850;
		System.out.println("육개장 가격:" + noodleCup +"원");
		
		// 육개장 3개 가격 계산
		// 육개장: 850, 육개장 3개: ?
		int noodleCupSum = noodleCup * 3;
		System.out.println("육개장:" + noodleCup +", 육개장 3개:" + noodleCupSum);
		
		// 10,000원으로 육개장 3개를 산 후에 거스름돈 구하기
		int money = 10000;
		int change = money - noodleCupSum;
		System.out.println("거스름돈:" + change);
		
		// 5,000원으로 육개장을 몇개 살 수 있고, 거스름돈은 얼마나 남는가?
		money = 5000;
		int buyNoodleCup = money / noodleCup;
		System.out.println("살 수 있는 개수:" + buyNoodleCup);
		
		change = money % noodleCup; // 나머지 구하는 연산자 : %
		System.out.println("거스름돈:" + change);
	}

}





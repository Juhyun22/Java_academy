package inheritance_quiz01;

public class HealthRate extends HealthInfo {
	
	public HealthRate(String name, int height, int weight) {
		// 상속을 받으면 부모의 기본 생성자가 자동으로 불려지는데,
		// 부모 클래스에 기본 생성자가 없을 경우에는
		// 	- 1) 부모 클래스에 기본 생성자를 만든다.
		//	- 2) 자식 클래스의 생성자에서 부모클래스의 생성자를 직접 호출해준다.
		
		super(name, height, weight);
		
		// super.name = name;
		// this.name = name;
	}

//	// 표준 체중을 구하는 메소드
//	public double calcluateSWB() {
//		double sw = (this.height - 100) * 0.9;
//		double b = (this.weight - sw) / sw * 100;
//		return b;
//	}
//	
//	// 비만 여부 확인
//	public void isFat() {
//		double b = calcluateSWB();
//		if (b < 10) {
//			System.out.println("정상입니다.");
//		} else if (b >= 10 && b < 20) {
//			System.out.println("과체중입니다.");
//		} else {
//			System.out.println("비만입니다.");
//		}
//	}
	
	// 표준 체중 구하는 메소드
	private double getStandardWeight() {
		// SW=(H-100)*0.9
		return (this.height - 100) * 0.9;
	}
	
	// 비만도 계산하는 메소드
	private double getRate() {
		double sw = getStandardWeight();
		// B(%)=(W-SW)/SW * 100
		return (this.weight - sw) / sw * 100;
	}
	
	// 비만 여부 결과값
	private String status() {
		// 비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만
		double rate = getRate();
		if (rate < 10) {
			return "정상입니다.";
		} else if (rate < 20) { // 11 ~ 19
			return "과체중입니다.";
		} 
		return "비만입니다";
	}
	
	@Override // 꼭 추가
	public void showInfo() {
		// 박둘리님의 신장 160, 몸무게 45kg => 정상입니다. 
		super.showInfo();
		System.out.println("=> " + status());
	}
	
} // class






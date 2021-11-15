package inheritance_quiz01;

public class HealthInfo {
	protected String name;
	protected int height;
	protected int weight;

	public HealthInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void showInfo() {
		// ex) È«±æµ¿´ÔÀÇ ½ÅÀå 160, ¸ö¹«°Ô 45kg ÀÔ´Ï´Ù.
		System.out.println(name + "´ÔÀÇ ½ÅÀå " + height + ", ¸ö¹«°Ô " + weight + "kg");
	}

//	public String getName() {
//		return name;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public int getWeight() {
//		return weight;
//	}
}
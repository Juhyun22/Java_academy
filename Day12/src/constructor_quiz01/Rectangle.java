package constructor_quiz01;

// ���赵 - �簢�� 
public class Rectangle {
	// 1. �Ӽ�, �ʵ�, ��� ����
	private int row;
	private int col;
	
	// 2. ����, �޼ҵ�
	
	// ������ Constructor
	public Rectangle(int row, int col) {
		this.row = row;
		this.col = col;
		System.out.println("���� " + row + "cm, ���� " + col + "cm �簢���� ����������ϴ�.");
	}
	
	// ���� ���ϱ�
	public int getArea() {
		return this.row * this.col;
	}
	
	// �ѷ� ���ϱ�
	public int getRound() {
		return 2 * (this.row + this.col);
	}
}

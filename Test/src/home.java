import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		
		int ko=100;
		int en=100;
		int ma=100;
		int sc=100;
		String change = "";
		
		
		System.out.println("�� �� �� �� ������ ���ʴ�� �Է��Ͻÿ�");
		
		Scanner scan = new Scanner (System.in);
		
		String k;
		String e;
		String m;
		String s;
		
		k = scan.nextLine();
		e = scan.nextLine();
		m = scan.nextLine();
		s = scan.nextLine();
		
		ko=Integer.parseInt(k);
		en=Integer.parseInt(e);
		ma=Integer.parseInt(m);
		sc=Integer.parseInt(s);
		
		int score = ko+en+ma+sc ;
		
		System.out.println("������ ������ �ִٸ� �����̸��� �Է��Ͻÿ�. \n �ִ� 3������ ���� \n ���� �Ϸ� �� exit �� �Է��Ͻÿ�");
		
		change = scan.nextLine();
		
		if(change.equals("����")) {
			System.out.println("���� ������ �Է�");
			k = scan.nextLine();
		}			
			else if(change.equals("����")) {
				System.out.println("���� ������ �Է�");
				e = scan.nextLine();}
				
				else if(change.equals("����")) {
					System.out.println("���� ������ �Է�");
					m = scan.nextLine();}
					
					else if(change.equals("����")) {
						System.out.println("���� ������ �Է�");
						s = scan.nextLine();}
						
						else if (change.equals("exit")) {
							System.out.println("������ �����");
							System.out.println(k+e+m+s);
							System.out.println((k+e+m+s)/4);
						}
		
		
		
	}

}

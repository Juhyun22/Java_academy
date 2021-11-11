import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		
		int ko=100;
		int en=100;
		int ma=100;
		int sc=100;
		String change = "";
		
		
		System.out.println("국 영 수 과 점수를 차례대로 입력하시오");
		
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
		
		System.out.println("변경할 점수가 있다면 과목이름을 입력하시오. \n 최대 3번까지 가능 \n 최종 완료 후 exit 를 입력하시오");
		
		change = scan.nextLine();
		
		if(change.equals("국어")) {
			System.out.println("국어 점수를 입력");
			k = scan.nextLine();
		}			
			else if(change.equals("영어")) {
				System.out.println("영어 점수를 입력");
				e = scan.nextLine();}
				
				else if(change.equals("수학")) {
					System.out.println("수학 점수를 입력");
					m = scan.nextLine();}
					
					else if(change.equals("과학")) {
						System.out.println("과학 점수를 입력");
						s = scan.nextLine();}
						
						else if (change.equals("exit")) {
							System.out.println("총점과 평균은");
							System.out.println(k+e+m+s);
							System.out.println((k+e+m+s)/4);
						}
		
		
		
	}

}

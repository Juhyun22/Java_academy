package string_ex;

public class Ex03 {

	public static void main(String[] args) {
		String s1 = "eclipse";
		
		// charAt: n��° �ε����� ���� ���ڰ� �ִ°�? -> char�� ���
		System.out.println(s1.charAt(4));
		
		// contains: Ư�� ���ڿ��� ���ڿ��� ������ �Ǿ��ִ��� Ȯ�� -> bool�� ���
		System.out.println(s1.contains("lip"));
		
		// *startsWith: Ư�� ���ڿ��� �����ϴ��� Ȯ�� -> bool�� ���
		System.out.println(s1.startsWith("ecl"));
		
		// endsWith: Ư�� ���ڿ��� �������� Ȯ�� -> bool�� ���
		System.out.println(s1.endsWith("ps"));
		
		// length: ���ڿ��� ���� Ȯ��. ���ĺ��� �� ������
		System.out.println(s1.length());
		
		// replace: ���Ե� ���ڿ� �κ��� ��ü. �ݵ�� ����!! ������ �����ְ� �־��ְ� �������� �˾ƾ���!!!
		String s2 = "I stay hungry.";
		s2 = s2.replace("I", "You"); // �� �ٽ� �����ؾ��Ѵ�!! ��ҹ��� ����!
		System.out.println(s2);
		
		// split: Ư�� ��Ʈ���� �������� �߶� �迭�� �ִ´�. '.'�� �����ؼ� �־��
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		System.out.println();
		
		// substring: ���ڿ��� �ڸ���. int �־���ϰ� String���
		String s4 = "javastudy";
		System.out.println(s4.substring(4)); // study
		
		// begin index: ���� �ε���
		// end index: �� �ε��� + 1
		System.out.println(s4.substring(0, 4)); //  java 0 ~ 3
		System.out.println(s4.substring(4, 9)); //  study 4 ~ 8
		
	} // main

} // class















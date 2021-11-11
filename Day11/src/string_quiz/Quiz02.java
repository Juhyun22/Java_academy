package string_quiz;

// import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		// 1. 문자열 검색
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		
//		int count = 0;
//		for (int i = 0; i < files.length; i++) {
//			if (files[i].endsWith("jpg")) {
//				count++;
//			}
//		}
//		
//		System.out.println("jpg 파일의 개수: " + count + "개");
//		
//		
//		// 2. 영 단어 퀴즈
//		String[] quizWord = {"승리" , "사랑", "컴퓨터", "노트북"};
//		String[] answerWord = {"victory", "love", "computer", "notebook"};
//		int score = 0;
//		
//		for (int i = 0; i < quizWord.length; i++) {
//			System.out.print((i + 1) + ". " + quizWord[i] + "을(를) 영어로 입력하세요: ");
//			String answer = scan.next();
//			
//			if (answer.equals(answerWord[i])) {
//				score += 100 / quizWord.length;
//			}
//		}
//		System.out.println("점수: " + score);
//		
//		scan.close();
		
		// 3. 동명이인의 종류 수
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] names = memberStr.split(":");
		int sameCount = 0;
		
		for (int i = 0; i < names.length; i++) {  	// 기준이 되는 이름들
			String name = names[i];  // 기준 이름
			boolean isSame = false;
			
			if (names[i].equals("-")) {  // 동명이인으로 체크되서 -인 경우 skip
				continue;
			}
			
			for (int j = i + 1; j < names.length; j++) {  // 비교되는 이름들
				if (name.equals(names[j])) {
					isSame = true;
					names[j] = "-";
				}
			}
			
			if (isSame) { // 참: 기준 이름에 대해서 동명이인인 적이 있었다.
				sameCount++;
			}
		}
		System.out.println("동명이인 종류 수: " + sameCount);
		
	} // main

} // class









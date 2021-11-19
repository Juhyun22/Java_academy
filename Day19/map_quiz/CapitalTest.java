package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {
	// final: 한번만 초기화 하도록 하는 것. 초기화 할때 값을 바로 안넣어줘도 됨. static에서는 값을 넣어줘야함.
	// 1. 변수: 변수에 붙이면 한번 초기화된 변수에 값을 재할당 불가
	// 2. 메소드: 오버라이드 불가. 부모한테 상속받은거 재구현 불가.
	// 3. 클래스: 상속 불가
    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
        
        // TODO: 구현하기
        // 중복 검사를 위한 - randIndex 히스토리 리스트 
        List<Integer> quizIndex = new ArrayList<>();
        
        int score = 0;
        for (int i = 0; i < 5; i++) {
        	// 문제를 낸다.
        	// 랜덤 클래스에서 인덱스 범위 숫자를 뽑아서 그 나라로 문제를 낸다.
        	int randIndex = rand.nextInt(20);
        	
        	// 중복 검사
        	if (quizIndex.contains(randIndex)) {
        		i--; // 중복이면 다시돈다.
        		continue;
        	}
        	
        	quizIndex.add(randIndex); // 냈던 문제의 인덱스 저장 - 중복 검사를 위해서
        	
        	String capitalKey = keyList.get(randIndex);
        	System.out.print(capitalKey + "의 수도 이름은? : ");
        	
        	// 입력을 받는다.
        	String answer = scan.next();
        	
        	// 입력 받은 값과 답을 비교한다.
        	if (capitalMap.get(capitalKey).equals(answer)) {
        		System.out.println("정답");
        		score += 20;
        	} else {
        		System.out.println("틀렸습니다.");
        	}
        }
        
        System.out.println("총 점수는 : " + score);
        
        scan.close();
    }
}








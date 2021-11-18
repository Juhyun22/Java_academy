package set_quiz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		// Q. 1234, 3456 의 합집합, 차집합, 교집합을 구하세요.

		// 1234, 3456 값을 세팅한다.
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

		// 아래 객체에 결과를 저장한다.(원본 데이터 set1에 값 변경이 되지 않게 하기 위해)
		Set<Integer> union = new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		System.out.println("합집합: " + union);

		Set<Integer> difference = new HashSet<>();
		difference.addAll(set1);
		difference.removeAll(set2);
		System.out.println("차집합 : " + difference);

		Set<Integer> intersection = new HashSet<>();
		intersection.addAll(set1);
		intersection.retainAll(set2);
		System.out.println("교집합 : " + intersection);
	}

}

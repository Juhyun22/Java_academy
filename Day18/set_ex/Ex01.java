package set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Set
		// 1. 중복되지 않는다.
		// 2. 인덱스 기반이 아니다.
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		System.out.println(set1.add(3)); // 중복된 값은 저장할 수 없다.
		System.out.println(set1);

		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set2.addAll(set1);
		System.out.println(set2);

		// set2에 10이 있는가?
		System.out.println(set2.contains(10));
		// set2에 100이 있는가?
		System.out.println(set2.contains(100));
		
		// set2 - set1 차집합
		set2.removeAll(set1);
		System.out.println(set2);
		
		// 반복문으로 출력하기
		
		// 1. Iterator
		Iterator<Integer> iter = set1.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 2. 향상된 for문
		for (Integer element : set1) {
			System.out.print(element + " ");
		}
		System.out.println();
		
	}
}
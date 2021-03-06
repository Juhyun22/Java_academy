package list_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 9, 1));
		
		// List에 숫자 5가 들어있는가?
		boolean containValue = list.contains(5); // ture
		System.out.println(containValue);
		// List에 숫자 7이 들어있는가?
		System.out.println(list.contains(7)); // false
		
		// 오름차순 정렬
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		// 내림차순
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		// 리스트가 비어있는지 확인
		System.out.println("리스트가 비어 있는가? " + list.isEmpty());
		
		list.clear();
		
		System.out.println("리스트가 비어 있는가? " + list.isEmpty());
	} // main

} // class

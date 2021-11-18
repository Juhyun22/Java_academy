package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(Array)
		// 1. 크기를 미리 알고 있어야 한다. 크기는 고정되어 있다.
		// 2. 중간에 있는 값을 빼내면 비어있는 채로 유지된다.
		// 3. index기반으로 접근이 가능하다.
		// 4. 기본 자료형(primitive type), 클래스 자료형도 담을 수 있다.
		
		// 리스트(List)
		// 1. 크기가 고정되어 있지 않고, 동적으로 할당된다.
		// 2. 중간에 있는 값을 빼면 앞으로 당겨진다. (메모리 낭비가 없다.)
		// 3. 여러 방법으로 데이터를 다룰 수 있다.
		// 4. 클래스 자료형만 담을 수 있다. (기본 자료형 담을 수 없음)
		// 5. 타입 안정성을 보장한, generic을 쓸 수 있다.
		
		// java.util.List
		// List 인터페이스의 실제 구현체인 ArratList 사용
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println("list1 : " + list1);
		System.out.println("list1 : " + list1.toString());
		
		// List Interface 중 Linked List 사용
		List<Integer> list2 = new LinkedList<>();
		list2.add(2);
		list2.addAll(list1);
		System.out.println("list2 : " + list2);
		
		// 요소 수정하기
		// 요소의 첫번째 값을 수정  2 -> 100으로 변경
		System.out.println("원래 있던 값 : " + list2.set(0, 100));
		System.out.println("변경 후 list2 : " + list2);
		
		// 요소 삭제하기
		Integer deletedNumber = list2.remove(1); // index 1 위치의 값 제거
		System.out.println("삭제된 값 : " + deletedNumber);
		System.out.println("삭제 후 list2 : " + list2);
		
		Integer number = 100;
		list2.remove(number); // 값으로 삭제(Object)
		System.out.println(list2);
		
		// Integer.valueOf(i) // Integer return
		// Integer.parseInt() // int return 
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("abc");
		strList1.add("qwe");
		System.out.println(strList1);
		
		strList1.remove(1);
		strList1.remove("abc");
		System.out.println(strList1);
		
		System.out.println(list1);
		list1.clear(); // 모든 요소 삭제하기
		System.out.println(list1);
	} // main

} // class








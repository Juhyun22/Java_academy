package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		
		// 1. index 기반으로 출력하기(배열)
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i) + " "); // 배열의 [i] => get(i)
			
			// 만약에 b로 시작하는 과일은 제거
			if (fruits.get(i).startsWith("b")) {
				fruits.remove(i);
				i--; // 삭제가 될 때 한번 더 돌리기 위해 i-- 시킨다.
			}
		}
		System.out.println();
		
		// 2. Iterator 사용하기 (가리키는 거)
		Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {
			String fruit = iter.next(); // next() 호출 할 때마다 소비가 되므로 반복문에서 한번만 수행하는게 좋다.
			System.out.print(fruit + " ");
			
			// b로 시작하는 과일 제거
			if (fruit.startsWith("b")) {
				iter.remove(); // 리스트에서 직접 삭제가 아니고 iterator의 remove로 삭제해야한다.
			}
		}
		System.out.println();
		System.out.println(fruits);
		
		// 3. 향상된 for문
		// money in pocket
		// 출력용.. 중간에 삭제하려면 쓰지 않을것!
		// 자바 버전마다 동작이 다르기 때문에 중간에 절대 삭제하지 말 것 
		for (String fruit :fruits) {
			System.out.print(fruit + " ");
			
			if (fruit.startsWith("b")) {
				fruits.remove(fruit);
			}
		}
		System.out.println();
		System.out.println(fruits);
		
	}

}

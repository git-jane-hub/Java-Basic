package collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P07LinkedList01 {
	public static void main(String[] args) {
		/* LinkedList는 자료의 변경이 빈번할 때 사용하면 성능이 향상됨
		 * 일반적인 상황에서는 ArrayList를 더 많이 사용하지만, 양 리스트간 사용법에 큰 차이는 없음
		 */
		List<String> list1 = new LinkedList<>();
//		List<String> list1 = new ArrayList<>();로 작성해도 결과의 차이가 없음
		
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
		/* .remove()
		 * .remove(번호)를 입력하면 주어진 번호 인덱스의 자료가 삭제되고
		 * .remove("자료")를 입력하면 번호와 상관없이 자료가 삭제됨
		 */
		list1.remove(0);
		System.out.println(list1);
		list1.remove("스프링");
		System.out.println(list1);
		
		/* .clear()
		 * 리스트를 전체 삭제 
		 */
		list1.clear();
		System.out.println(list1);
		
		// 자료 4개 추가
		list1.add("k");
		list1.add("a");
		list1.add("하");
		list1.add("나");
		
		// 자료 정렬
		Collections.sort(list1);
		System.out.println(list1);
		
//		list1.clear();
//		list1.add("0");
//		list1.add("1");
//		list1.add("2");
//		list1.add("3");
//		System.out.println(list1);
//		for(int a = 0; a < list1.size(); a++) {
//			list1.remove(a);
//		}
//		System.out.println(list1);
//		
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(0);
//		list2.add(1);
//		list2.add(2);
//		list2.add(3);
//		System.out.println(list2);
//		for(int a = 0; a < list2.size(); a++) {
//			list2.remove(a);
//		}
//		System.out.println(list2);
	}
}

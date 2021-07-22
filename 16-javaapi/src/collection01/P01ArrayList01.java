package collection01;

import java.util.ArrayList;
import java.util.List;

public class P01ArrayList01 {
	public static void main(String[] args) {
		/* List는 생성 자료형으로 ArraysList와 LinkedList를 받을 수 있음
		 * 기본적으로는 ArrayList를 사용
		 * java.util의 List나 ArrayList를 사용
		 */
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이가 가변적)
		List<Integer> list1 = new ArrayList<>();
//		List<int> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		
		// 1번 인덱스 자리부터 한 칸씩 뒤로 밀고 그 자리에 자료 저장
		list1.add(1, 100);
		System.out.println(list1);
		
		// 1번 인덱스에 있는 자료를 99로 교체
		list1.set(1, 99);
		System.out.println(list1);
		
	}
}

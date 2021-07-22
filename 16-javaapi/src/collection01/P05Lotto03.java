package collection01;

import java.util.ArrayList;
import java.util.List;

public class P05Lotto03 {
	public static void main(String[] args) {
		/* List 역시 참조형 변수이기 때문에 비교시 주소값끼리 비교됨
		 * 따라서 단순 == 비교가 아닌 리스트1.equals(리스트2)를 이용해 주소값으로 이동했을 때 나온 실제 자료 비교를 해줘야 함
		 * equals는 내부 요소의 '순서'까지 고려하여 true / false를 반환
		 */
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		/* list1과 list2에는 스택에 주소값이 저장되어 있고, 힙에 빈리스트가 저장되어 연결되어 있음
		 * '=='은 주소값이 다르기 때문에 false 반환
		 * '.equals'는 문자열비교 시 사용된 것으로 빈리스트로 내용이 같기 때문에 true 반환
		 */
		System.out.println("주소값 비교: " + (list1 == list2));
		System.out.println("내부요소간 비교: " + (list1.equals(list2)));
		
		// list1과 list2에 각각 요소를 입력을 하고 결과 확인
		list1.add(1);
		list1.add(2);
		list2.add(2);
		list2.add(1);
		
		System.out.println(list1);	// list1 = [1, 2];
		System.out.println(list2);	// list2 = [2, 1];
		System.out.println("주소값 비교: " + (list1 == list2));
		System.out.println("내부요소간 비교: " + (list1.equals(list2)));
		
	}
}

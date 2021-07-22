package map01;

import java.util.HashMap;
import java.util.Map;

public class P01HashMap01 {
	public static void main(String[] args) {
		/* Map 자료형의 대표 자료형은 HashMap
		 * 제네릭 내부에는 <key 자료형, value 자료형>으로 입력
		 */
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("채종훈", "자바");
		map1.put("김영수", "jsp");
		map1.put("코로나", "바이러스");
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("a", 1);
		System.out.println(map1);
		
		// 자료조회 시, .get(key 값)으로 작성
		System.out.println(map1.get("채종훈"));
		System.out.println(map1.get("코로나"));
		System.out.println(map1.get("바이러스"));	// value 값으로 key 값을 출력하는 것은 불가능 - null
		System.out.println(map1.get(0));			// 인덱스 값 출력도 불가능 - null
		
		/* map자료형은 조회를 key 중심으로 함
		 * .containsKey()는 해당 key 값이 자료내에 존재하는지 확인
		 */
		System.out.println(map1.containsKey("채종훈"));
		System.out.println(map1.containsKey("코로나"));
		System.out.println(map2.containsKey("a"));
		
		// .remove()는 key를 이용해서 key 값과 value 값 전체를 삭제
		map1.remove("코로나");
		System.out.println(map1);
		
		/* .size()는 크기를 알려줌
		 * 정수로 몇 개의 key = value 쌍이 저장되어있는지 확인
		 */
		System.out.println(map1.size());
	}
}

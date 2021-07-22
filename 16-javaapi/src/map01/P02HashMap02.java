package map01;

import java.util.HashMap;
import java.util.Map;

public class P02HashMap02 {
	public static void main(String[] args) {
		/* 식당 메뉴판 만들기
		 * key는 음식 이름, value는 가격(정수)
		 * 메뉴는 5개 이상 작성하고 3개를 조회해서 출력
		 */
		Map<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("김밥", 3500);
		menu.put("돈까스", 8000);
		menu.put("오무라이스", 7000);
		menu.put("라면", 6000);
		menu.put("김치찌개", 7500);
		
		
		System.out.println(menu.get("김밥"));
		System.out.println(menu.get("돈까스"));
		System.out.println(menu.get("오무라이스"));
	}
}

package collection01;

import java.util.ArrayList;
import java.util.List;

public class P02ArrayList02 {
	public static void main(String[] args) {
		/* String 자료를 가변적으로 받을 수 있는 ArrayList를 만들고
		 * 내부의 자료로 "사과", "딸기", "바나나", "블루베리", "파인애플"을 삽입
		 */
		List<String> fruit = new ArrayList<>();
//		List<String> fruit = new ArrayList<String>();
		
		fruit.add("사과");
		fruit.add("딸기");
		fruit.add("바나나");
		fruit.add("블루베리");
		fruit.add("파인애플");
		System.out.println(fruit);
		
		/* contains("자료")
		 * 리스트 내에 찾는 자료가 있으면 true 없으면 false를 출력
		 */
		System.out.println(fruit.contains("사과"));
		System.out.println(fruit.contains("복숭아"));
		
		/* .get(번호)
		 * 주어진 인덱스에 저장되어 있는 자료를 조회
		 */
		System.out.println(fruit.get(1));
		// 없는 인덱스 번호를 입력하면 예외발생으로 전체 코드가 종료됨
//		try(IndexOutOfBoundsException i){
//		System.out.println(fruit.get(10));
//		}
		
		List<String> list = new ArrayList<>();	// 비어있는 리스트 생성
		/* .isEmpty()
		 * 비어있는지 여부를 체크
		 */
		System.out.println(fruit.isEmpty());	// 비어있니? 아니 - false
		System.out.println(list.isEmpty());		// 비어있니? 응 - true
		
		/* .size()
		 * 내부 요소의 개수를 확인
		 */
		System.out.println(fruit.size());
		System.out.println(list.size());
	}
}

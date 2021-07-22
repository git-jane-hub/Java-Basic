package collection01;
// 선생님 풀이
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P04Lotto02 {
	public static void main(String[] args) {
		// 꺽쇠안의 내용에 따라 데이터 타입이 변함
		List<Integer> lotto = new ArrayList<>();
		int get = 0;
		/* 무작위로 뽑은 숫자가 중복되어 나오는 경우가 있기 때문에 for문이 아닌 while문으로 작성
		 * - 몇 번 뽑아야 할 지 모름(while문의 조건이 만족하기 전까지 계속 반복되게 작성)
		 */
		while(lotto.size() != 6) {
			get = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(get)) {
				lotto.add(get);
			}
		}
		Collections.sort(lotto);
		System.out.println("추첨된 번호: " + lotto);
		
		/* 앞의 lotto를 7개로 추첨하지 않은 이유는
		 * 7번째로 추첨을 해도 번호 정렬이 되기 때문에 마지막에 뽑은 수가 중간에 위치할 수 있기 때문
		 */
		/* 추첨한 숫자가 get에 저장되어 lotto에 있는 숫자라면  true를 반환
		 * true면 get에 저장되지만 while문은 종료되지 않음
		 * false면 get에 저장되고 while문이 종료됨
		 */
		while(lotto.contains(get)) {
			get = (int)(Math.random() * 45) + 1;
		}
		System.out.println("2등 당첨번호: " + get);
	}
}


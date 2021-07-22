package collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class P03Lotto01 {
	public static void main(String[] args) {
		/* 로또 추첨기 만들기
		 * 1이상 45이하의 범위에서 겹치는 숫자 없이 6개의 숫자를 뽑음
		 * 순서 정렬해서 출력 - Collections.sort(리스트);를 사용
		 */
		List<Integer> lotto = new ArrayList<>();
		Random random = new Random();
		for(int a = 0; a < lotto.size(); a++) {
			lotto.add(random.nextInt(45) + 1);
			if(lotto.contains(lotto.get(a))) {
				
			}
		}
		Collections.sort(lotto);
		System.out.println("추첨된 번호: " + lotto);
		System.out.println("2등 당첨번호: " + lotto.get(6));
	}
}

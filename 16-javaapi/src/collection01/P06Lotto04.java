package collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P06Lotto04 {
	public static void main(String[] args) {
		/* 로또 당첨 시뮬레이션
		 * 1. 당첨번호 6개 추첨
		 * 2. 추첨번호 6개 추첨
		 * 3. 당첨번호와 추첨번호를 비교하여 일치하면 반복 중지
		 * 4. 일치하지 않으면 금액을 더해 다시 추첨번호 6개를 뽑고 일치하는지 비교
		 */
		List<Integer> lottoTry = new ArrayList<Integer>();
		List<Integer> lottoWin = new ArrayList<Integer>();
		
		int get = 0;
		while(lottoWin.size() != 6) {
			get = (int)(Math.random() * 45) + 1;
			if(!lottoWin.contains(get)) {
				lottoWin.add(get);
			}
		}
		Collections.sort(lottoWin);
		
		// int 타입으로 작성하면 금액이 21억이 넘어가면 오버플로우로 -21억이 됨 - long 타입으로 작성
														// 의사코드(pseudo-code)
		long money = 0;
		while(!lottoTry.equals(lottoWin)) {				// 1. 리스트를 비교
			lottoTry.clear();							// 2. 리스트를 비움
			while(lottoTry.size() != 6) {
				get = (int)(Math.random() * 45) + 1;
				if(!lottoTry.contains(get)) {
					lottoTry.add(get);					// 3. 리스트를 채움
				}
			}
			Collections.sort(lottoTry);					// 4. 리스트를 정리
			money += 1000;
			System.out.println("이번에 뽑힌 번호: " + lottoTry);
		}
		System.out.println("추첨번호: " + lottoTry);
		System.out.println("당첨번호: " + lottoWin);
		System.out.println("총 복권을 " + money +  "원 사고서야 1등에 당첨되었습니다.");
	}
}

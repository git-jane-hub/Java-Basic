package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R03 {
	public static void main(String[] args) {
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
		
		int money = 0;
		while(!lottoTry.equals(lottoWin)) {
			lottoTry.clear();
			while(lottoTry.size() != 6) {
				get = (int)(Math.random() * 45) + 1;
				if(!lottoTry.contains(get)) {
					lottoTry.add(get);
				}
			}
			Collections.sort(lottoTry);
			money += 1000;
			System.out.println("이번에 뽑힌 번호: " + lottoTry);
		}
		System.out.println("추첨번호: " + lottoTry);
		System.out.println("당첨번호: " + lottoWin);
		System.out.println("총 " + money + "원어치의 복권을 사고서야 1등에 당첨되었습니다.");
	}
}

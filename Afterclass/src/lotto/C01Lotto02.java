package lotto;

import java.util.Arrays;

public class C01Lotto02 {
	public static void main(String[] args) {
		int money;
		int [] lotto = new int [45];
		for(int a = 0; a < lotto.length; a++) {
			lotto[a] = a + 1;
		}
		int [] win = new int [6];
		for(int b = 0; b < 6; b++) {
			for(int c = 40; c <= 45; c++) {
				int d;
				win[b] = (int)((Math.random() * c) + 1);
			}
		}
		System.out.println(Arrays.toString(win));
		//System.out.println("총 로또복권을 " + money + "원 사고서야 1등에 당첨되었습니다.");
	}
}

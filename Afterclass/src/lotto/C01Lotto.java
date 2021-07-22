package lotto;

import java.util.Arrays;

public class C01Lotto {
	public static void main(String[] args) {
		int [] lotto = new int [45];
		for(int a = 0; a < lotto.length; a++) {
			lotto[a] = a + 1;
		}
//		System.out.println(Arrays.toString(lotto));
		int tmp = 0;
		for(int b = 0; b < 6; b++) {
			int num = (int)(Math.random() * 45);
			tmp = lotto[b];
			lotto[b] = lotto[num];
			lotto[num] = tmp;
		}
		for(int c = 0; c < 6; c++) {
			System.out.println("Ball " + (c + 1) + ": " + lotto[c]);
		}
	}
}

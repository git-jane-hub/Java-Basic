package string01;

import java.util.Arrays;
import java.util.Collections;

public class RR01 {
	public static void main(String[] args) {
		char [] str = new char [26];
		for(int a = 0; a < str.length; a++) {
			str[a] = (char)(a + 97);
		}
		System.out.println(str);
//		str = Collections.shuffle(Arrays.asList(str));
		System.out.println(str);
	}
}

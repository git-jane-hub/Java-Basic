package string01;

import java.util.Arrays;

public class R05 {
	public static void main(String[] args) {
		char [] alphabet = new char [26];
		for(int a = 0; a < alphabet.length; a++) {
			alphabet[a] = (char)(a + 97);
		}
		System.out.println(alphabet);
		System.out.println(Arrays.toString(alphabet));
		System.out.println("----------");
		// 이거 잘 모르겠음
		String getAlphabet1 = alphabet.toString();
		String getAlphabet2 = new String(alphabet);
		String getAlphabet3 = String.valueOf(alphabet);
		String getAlphabet4 = alphabet + "";
		
		System.out.println(getAlphabet1);	// 주소값 출력됨
		System.out.println(getAlphabet2);	// 문자열 출력됨
		System.out.println(getAlphabet3);	// 문자열 출력됨
		System.out.println(getAlphabet4);	// 주소값 출력됨
		System.out.println("----------");	
		
		System.out.println(getAlphabet1.substring(7));
		System.out.println(getAlphabet2.substring(7));
		System.out.println(getAlphabet3.substring(7));
		System.out.println(getAlphabet4.substring(7));
		
	}
}

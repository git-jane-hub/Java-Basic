package string01;

import java.util.Scanner;

public class P05String05 {
	public static void main(String[] args) {
		/* .length()와 charAt()을 활용해 입력된 전체 문자열을 한글자씩 한줄러 출력
		 * 문자열은 Scanner로 입력받음
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str = scan.nextLine();
		
		for(int a = 0; a < str.length(); a++) {
			char get = str.charAt(a);
			System.out.println(get);			// 변수 생성해서 저장하고 출력
//			System.out.println(str.charAt(a));	// 변수 생성하지 않고 그대로 출력
		}
	}
}

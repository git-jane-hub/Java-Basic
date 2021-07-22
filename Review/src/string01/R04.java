package string01;

import java.util.Scanner;

public class R04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String sen = scan.nextLine();
		System.out.println("찾을 단어를 입력하세요.");
		String voca = scan.nextLine();
		
		int get = sen.indexOf(voca);
		for(int a = 0; a < voca.length(); a++) {
			if(get == -1) {
				break;
			}
		}
	}
}

package string01;

import java.util.Scanner;

public class R03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력해주세요.");
		String sen = scan.nextLine();
		System.out.println("찾을 단어를 입력해주세요.");
		String voca = scan.nextLine();
		
		int get;
		int count = 0;
		for(int a = 0; a < sen.length(); a++) {
			get = sen.indexOf(voca, a);
			a = get + voca.length() - 1;
			if(get == -1) {
				break;
			}
			count++;
			System.out.println("입력하신 문장에서 " + a + "번째 자리에서 " + count + "번째 " + voca + "를 찾았습니다.");
		}
		System.out.println("총 " + voca + " 의 개수는 " + count + "개입니다.");
		
	}
}

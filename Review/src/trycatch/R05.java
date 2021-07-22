package trycatch;

import java.util.Scanner;

public class R05 {
	public static void main(String[] args) {
		String[] chulcheck = {"김모모", "박모모", "최모모", "이모모", "황모모", "차모모"};
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 인덱스를 입력해주세요.(0 ~ 5)");
		int answer = scan.nextInt();
		try {
			if((answer > 3) && (answer <= 5)) {
				throw new Exception();
			}else {
				System.out.println(chulcheck[answer]);
			}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("인덱스 범위에 맞게 입력하세요.");
		}catch(Exception a){
			System.out.println("없는 에러를 만들었습니다.(TEST)");
		}
	}
}

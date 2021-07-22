package math01;

import java.util.Scanner;

public class R02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("비교할 두가지 숫자를 입력해주세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int max = (int)Math.max(a, b);
		int min = (int)Math.min(a, b);
		System.out.println("두 숫자중 큰 수는 " + max + "입니다.");
		System.out.println("두 숫자중 작은 수는 " + min + "입니다.");
	}
}

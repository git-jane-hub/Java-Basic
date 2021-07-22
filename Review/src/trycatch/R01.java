package trycatch;

import java.util.Scanner;

public class R01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 정수 하나를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("2. 0을 제외한 정수 하나를 입력해주세요.");
		int num2 = scan.nextInt();
		
		try {
			System.out.println(num1 / num2);
			System.out.println("연산 끝!");
		}catch(ArithmeticException a) {
			System.out.println("0을 제외하고 입력해주세요");
		}
	}
}

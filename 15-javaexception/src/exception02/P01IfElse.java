package exception02;

import java.util.Scanner;

public class P01IfElse {
	/* int a, b에 스캐너로 각각 정수 입력 받고
	 * a / b의 결과를 콘솔창에 출력
	 * if ~ else 문을 이용해 0으로 나누는 에러발생이 일어나기 전에
	 * '나누는 수에는 0을 입력할 수 없다'는 경고문구 출력
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0을 제외한 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("0을 제외한 정수를 입력해주세요.");
		int b = scan.nextInt();
		// 연산을 실행하기 전 먼저 검사(예외를 제외할)를 진행
		if(b == 0) {
			System.out.println("나누는 수에는 0을 입력할 수 없습니다.");
		}else {
			int num = a / b;
		System.out.println(a + " / " + b + " = " + num);
		}
	}
}

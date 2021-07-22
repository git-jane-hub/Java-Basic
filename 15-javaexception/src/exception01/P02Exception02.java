package exception01;

public class P02Exception02 {
	public static void main(String[] args) {
	/* 예외 발생 케이스 2
	 * ArithmeticException
	 * 실행 예외는 실행하기 전까지는 예외를 인지할 수 없는 예외
	 * 대표적인 예시로는 어떤 숫자를 0으로 나누는 것 - / by zero(division by zero)
	 */
		int a = 1;
		int b = 0;
		System.out.println(a / b);
	}
}

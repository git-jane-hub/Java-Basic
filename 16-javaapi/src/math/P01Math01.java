package math;

public class P01Math01 {
	public static void main(String[] args) {
		// Math는 자바에서 기본으로 제공하는 기능으로 import 없이 사용 가능
		
		// 1. Math.abs(): 절대값
		int a = -1024;
		System.out.println((double)Math.abs(a));
		System.out.println(Math.abs(a));
		
		// 2. Math.ceil(): 정수 올림값을 실수 형태로
		double b = 3.14;
		System.out.println(Math.ceil(b));
		System.out.println((int)Math.ceil(b));
		
		// 3. Math.floor(): 정수 내림값을 실수 형태로
		double c = 19.9;
		System.out.println(Math.floor(c));
		System.out.println((int)Math.floor(c));
	}
}

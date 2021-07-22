package math;

public class P04Math04 {
	public static void main(String[] args) {
		/* 8. Math.random()
		 * 0 <= 난수 < 1 범위
		 */
		double a = Math.random();
		System.out.println(a);
		
		// 범위를 제한하고 싶은 경우(0 <= 난수 < 6)
		int b = (int)(Math.random() * 6);
		System.out.println(b);
	}
}

package math;

public class P03Math03 {
	public static void main(String[] args) {
		/* 6. Math.rint()
		 * 현재 수에서 가장 가까운 정수를 실수형태로
		 */
//		double a = 3.5;						// 4.0
		double a = 3.5000000000000001;
		System.out.println(Math.rint(a));
//		double b = -3.5;					// -4.0
		double b = -3.499999999999999;
		System.out.println(Math.rint(b));
		
		/* 7. Math.round()
		 * 반올림한 값을 정수형태로
		 */
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
	}
}

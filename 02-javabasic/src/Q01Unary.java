
public class Q01Unary {
	public static void main(String[] args) {
		/* 다음 로직대로 전위, 후위수식을 이용해 코드를 작성
		 * 전위, 후위수식 코드는 unary01.java에서처럼
		 * 두 단계 주석으로 풀어서 설명
		 * 1. a에 15를 선언 및 초기화
		 * 2. a를 후위수식 감소시키면서 콘솔에 출력
		 *   // 1.
		 *   // 2.
		 * 3. a를 콘솔에 출력
		 * 4. a를 전위수식 감소시키면서 콘솔에 출력
		 *   // 1.
		 *   // 2.
		 * 5. a를 콘솔에 출력
		 */
		int a = 15;
		System.out.println(a--);
		// 1. System.out.println(a(15));
		// 2. a = a - 1; 14 = 15 - 1
		System.out.println(a);
		System.out.println(--a);
		// 1. a = a - 1; 13 = 14 - 1
		// 2. System.out.println(a(13));
		System.out.println(a);
	}
}

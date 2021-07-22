
public class P07For01 {
	public static void main(String[] args) {
		/* for 구문은 while 구문과는 다르게 몇 바퀴를 돌릴지 정해진 상황에서 사용
		 * 문법법은
		 * for(초기식_시작변수; 조건식_종료조건(boolean형); 증감식) {
		 *   실행문;
		 * }
		 * 으로 이루어짐
		 * 1. 초기식 - 조건식(참) - 실행문 - 증감식 (실행을 먼저하고 증감을 진행)
		 * 2.     - 조건식(참) - 실행문 - 증감식
		 * n.     - 조건식(거짓) - 종료
		 */
		for(int i = 0; i < 2; i++) {
			System.out.println("for를 이용한 반복문" + i);
		}
	}
}

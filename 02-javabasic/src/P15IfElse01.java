
public class P15IfElse01 {
	public static void main(String[] args) {
		/* if ~ else 구문은 참일 때 실행할 구문과 거짓일 때 실행할 구문을 함께 작성하며,
		 * else 구문은 if 구문 없이 단독으로 사용할 수 없음
		 */
		int a = 14;
		if (a == 15) {
			System.out.println("15입니다.");
		} else {  // else 구문은 if에서처럼 조건식을 작성할 필요가 없음 
			System.out.println("15가 아닙니다.");
		}
		// 위 if ~ else 구문은 연산이 한번만 진행됨 - 한 구문으로 간주되어 연산횟수를 절약함(효율적)
	}
}

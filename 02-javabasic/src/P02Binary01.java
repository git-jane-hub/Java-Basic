
public class P02Binary01 {
	public static void main(String[] args) {
		/*  이항 연산자는 양 변에 피연산자를 하나씩 취함
		 *  산술 연산자는 우리가 잘 알고 있는 사칙연산을 활용하기 위한 연산자
		 *  연산 우선순위도 그대로 계승
		 *  단, % 연산자의 우선순위는 *, /과 동일
		 *  +, -, *
		 */
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3);
		// '/'는 왼쪽 수를 오른쪽 수로 나눠 '몫'을 구해 출력_실제 결과값의 소수점 아래를 버림
		// (정수 / 정수 = 정수)
		System.out.println(7 / 2);
		System.out.println(7.0 / 2.0);  // 둘 중 하나만 실수로 만들어도 실수 값 출력이 가능
		// '%'는 정수 최대 몫을 구하고 '나머지'를 출력
		System.out.println(10 % 4);
		// 연산 우선순위는 그대로 존재함
		System.out.println(10 + 6 / 4);
		System.out.println((10 + 6) % 4);
	}
}

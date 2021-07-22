
public class P01Unarray01 {
	/* 단항 연산자: ++, -- 반복문, counting에 많이 쓰임
	 * ++, -- 는 숫자의 왼쪽 혹은 오른쪽에 붙을 수 있음
	 * 왼쪽에 붙는 경우: 전위 수식
	 * 오른쪽에 붙는 경우: 후위 수식
	 * 어느 방향에 붙느냐에 따라 실행 순서가 변경됨
	 * ++는 대상 변수의 숫자를 1증가, --는 1감소
	 */
	public static void main(String[] args) {
		int a = 1;
		System.out.println(++a);
		/*
		 *  전위 수식, 실행 전 1부터 증가시키고 a 출력
		 *  1. a = a + 1; -> 2 = 1 + 1 여기서 '='은 '같다'가 아닌 '대입 연산자', 우항의 결과값을 좌항에 대입
		 *  2. System.out.println(a(2));
		 */
		System.out.println(a);
		// a는 증가된 값이 유지
		System.out.println(a++);
		/* 
		 *  후위 수식, a(2) 출력 후 1 증가
		 *  1. System.out.println(a(2));
		 *  2. a = a + 1; -> 3 = 2 + 1
		 */
		System.out.println(a);
		// a는 증가된 값이 유지
	}
}

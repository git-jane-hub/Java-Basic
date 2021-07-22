
public class P00Variable {
	public static void main(String[] args) {
			/* 변수는 기본적으로 
			 * 1. 자료형 변수명;(선언)
			 *    변수명 = 값;(초기화)
			 * 방식과
			 * 2. 자료형 변수명 = 값;(선언 및 초기화)
			 * 방식
			 * 두가지로 값을 대입할 수 있음
			 */
		// a박스에 정수를 넣을 예정
		// int는 정수를 담겠다는 의미
		int a; 
		// a박스에 5를 집어 넣음
		a = 5;
		// b, c박스에 정수를 넣을 예정
		int b, c;
		// b박스에 10을 집어 넣음
		b = 10;
		// c박스에 15를 집어 넣음
		c = 15;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// a변수 값 20으로 변경
		// 기존 값인 5는 삭제됨
		a = 20;
		// 변경된 값으로 a변수 출력
		System.out.println(a);
	}
}
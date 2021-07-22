
public class P03Binary02 {
	public static void main(String[] args) {
		/* 비교 연산자는 크게 대소비교와 단순비교로 나뉨
		 * 대소비교는 >, <, >=, <= 이며 '숫자'끼리만 비교가 가능
		 * 단순비교는 ==, != 이며 모든 자료형간의 비교가 가능
		 * 컴퓨터는 비교연산자를 명제로 인식하며, true와 false를 판단해 결과로 보여줌
		 */
		System.out.println(3 > 5);
		System.out.println(12 <= 12);
		// 'a'는 97(ASCII)이라는 숫자를 나타내기 때문에 출력이 가능 - a는 숫자를 대체할 수 있는 무언가이기 때문
		System.out.println('a' <= 12);
		// 에러 - 쌍따옴표는 ASCII로 변환이 안됨
//		System.out.println("a" <= 12);

		System.out.println("a" != "b");
		System.out.println("a" == "a");
		/*  
		 * 단순비교는 같은 자료형간의 비교가 가능 - 비교를 실행하기 전 자료형을 통일시키고 연산을 진행하기 때문에 출력이 가능
		 * 자료 형 변환이 가능한 자료와는 서로 비교가 가능함
		 */
		System.out.println(5 == 5.0);
	}
}

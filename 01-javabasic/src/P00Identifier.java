/* 식별자:
 * 대소문자를 구분
 * 문자와 숫자,밑줄 및 달러 기호를 포함 - 문자, 밑줄, 달러기호로 시작 가능
 * 공백은 포함안됨
 */
public class P00Identifier {
	public static void main(String[] args) {
		/* 변수는 일종의 자료를 담을 수 있는 박스임
		 * 자료를 담기 전에 어떤 자료가 담길지 미리 언급을 해야함
		 */
		int a = 5;       // 정수 숫자 5를 a박스에
		int A = 10;      // 정수 숫자 10을 A박스에
		int number = 15; // 정수 숫자 15를 number박스에
		System.out.println(a);      // a박스 내부 값 콘솔로 출력
		System.out.println(A);      // A박스 내부 값 콘솔로 출력
		System.out.println(number); // number박스 내부 값 콘솔로 출력
//		System.out.println(B);      // B는 변수로 선언된 적 없기 때문에 호출하면 에러 발생
	}
}
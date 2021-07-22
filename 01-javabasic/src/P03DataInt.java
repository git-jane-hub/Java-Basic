/* 
 *  2의 보수
 *  : 2진법으로 수를 나타내고 1의 보수(bit자리를 반전) - 2의 보수(가장 낮은 bit에 1 더하기) 순서로 변경
 */
public class P03DataInt {
	public static void main(String[] args) {
		/*  정수형을 나타낼 수 있는 자료형은 크게 4가지
		 *  byte, short, int, long(1,2,4,8)
		 *  변수 선언시 지정 자료형을 위의 키워드로 지정
		 */
		/*  byte는 127까지 표현 가능
		 *  - 이유: 8bit = 1byte로 bit의 자리수가 1칸(부호자리)+7칸이기 때문에 0 ~ (2의6승-1)까지 표현되기 때문
		 */
//		byte a = 128;         // 에러
//		byte a = (byte) 128;  // 128이라는 숫자를 2진법으로 처리하고 8자리로 자른 뒤의 칸이 나타내는 숫자를 출력함
		byte a = (byte) 90683409;
		// 90683409를 bit 형식으로 처리하고 맨 뒤의 8자리 bit가 17을 나타내기 때문에 값은 17이 출력
		short b = 32000;
		int c = 3;
		long d = 4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

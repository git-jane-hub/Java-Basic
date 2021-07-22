
public class P05Binary04 {
	public static void main(String[] args) {
		/* 비트 이동 연산자는 숫자 >>, <<
		 * 자리수 문법으로 꺽쇠의 방향이 <<인 경우는 '왼쪽'으로, >>는 '오른쪽'으로 입력된 자리수 만큼 밀어줌
		 * 이때 정수 숫자는 2의 자리수 제곱만큼 증가함
		 * 반대방향의 경우는 2의 자리수 제곱만큼 감소함
		 */
		int a = 80;
		// 80 - 40 - 20 - 10
		System.out.println(a >> 3);
		// 80 - 160 - 320 - 640
		System.out.println(a << 3);
	}
}

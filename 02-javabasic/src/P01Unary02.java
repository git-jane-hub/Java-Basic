
public class P01Unary02 {
	public static void main(String[] args) {
		/*
		 *  단항 연산자로 쓰인 +는 양수, -는 음수 표시에 사용됨
		 */
		System.out.println(+50);  // 출력은 50으로
		System.out.println(-22);  // 출력은 -22로
		
		// 비트 반전 연산자는 비트단위에서 0->1로, 1->0으로
		System.out.println(~1);
		
		// 논리 반전 연산자 !는 true <-> false 상호 변환
		System.out.println(!true);
		
		// cast 연산자((자료형)자료)는 자료형을 바꿔줌
		System.out.println((double)21);
	}
}

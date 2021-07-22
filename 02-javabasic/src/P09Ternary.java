
public class P09Ternary {
	public static void main(String[] args) {
		/*  웹 개발에서 자주 사용
		 *  3항 연산자는 (조건식 ? 결과1 : 결과2) 로 작성
		 *  조건식의 결과가 true라면 결과1이
		 *  조건식의 결과가 false라면 결과2가 함께 출력
		 */
		System.out.println((3 < 5 ? "참" : "거짓"));
		System.out.println("참");
		// 식이 계산되고 true이기 때문에 결과1만 출력 자리에 남게됨
		System.out.println((3 > 5 ? "참" : "거짓"));
		System.out.println("거짓");
	}
}

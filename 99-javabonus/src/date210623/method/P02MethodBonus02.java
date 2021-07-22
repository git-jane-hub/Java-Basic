package date210623.method;

public class P02MethodBonus02 {
	/* void가 아닌 리턴 자료형을 가지는 메서드도  return 구문 실행시 종료됨
	 * void가 아닌 리턴 자료형을 작성하면 메서드가 끝나기 전에 해당 자료형의 값을 가져다 준다는 약속
	 */
	public static int getInt() {
		System.out.println("인트 발송 전");
		if(3 < 5) {
			return 1; // if문이 참이면 여기서 종료
		}
		System.out.println("인트 발송 후");
		return 0;    // if문이 거짓이면 여기서 종료
	}
	public static void main(String[] args) {
		// return 된 숫자를 출력하는 첫번째 방법
		// 1. result 변수를 생성하고 저장해서 변수 자체를 출력
		int result = getInt();
		System.out.println(result);
		// 2. 메서드 자체를 출력
		System.out.println(getInt());
	}
}

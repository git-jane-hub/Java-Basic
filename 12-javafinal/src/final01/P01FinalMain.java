package final01;
/* 변수 final 지정 - 값 변경 불가
 * 메소드 final 지정 - 오버라이딩(메서드 재정의) 불가
 * 클래스 final 지정 - 상속(확장 - 하위클래스 생성) 불가
 */
public class P01FinalMain {
	public static void main(String[] args) {
		// 상수를 선언할 때는 자료형 왼쪽에 final을 붙임 - 변수명은 대문자로 작성(상수임을 알 수 있도록)
		final int A = 50;
		
		// 상수는 조회 시에는 아무 문제가 없음
		System.out.println(A);
		
		/* 값을 변경하려 하면 에러 발생 - The final local variable A cannot be assigned.
		 * 상수 A가 50으로 초기화되는 순간 값을 바꿀 수 없음
		 */
//		A = 500;
		
		// 상수는 선언만 하고 초기화를 하지 않으면 내부에 값이 없는 상태가 됨 - 선언과 초기화 동시에 하지 않아도 됨
		final int B;
		// 값을 초기화 하지 않고 출력하면 에러 발생 - The local variable B may not have been initialized.
//		System.out.println(B);
		B = 50;
		System.out.println(B);
	}
}

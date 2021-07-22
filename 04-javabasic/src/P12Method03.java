
public class P12Method03 {
	public static void plus(int a, int b) {
		/* 내부 실행문에서 두 개 이상의 변수를 요구한다면,
		 * 두 개 이상의 '매개변수(데이터 타입과 함께 선언하며, 초기화하지 않음)'를 선언할 수 있습니다.
		 * 이 경우, 상대적인 위치에 맞춰서 전달
		 */
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		plus(3, 5); // 요구한 변수의 순서에 따라 작성, 여기서 plus가 실행되면서 plus method에서  a와 b가 선언됨
//		System.out.println(a); // plus가 끝난 순간 a와 b가 사라지면서 해당 문장을 실행할 수 없음, 
		                       // 같은 영역안에 속한 내용이 아니였기때문에 호출할 수도 없음
	}
}

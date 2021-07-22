
public class P13If01 {
	public static void main(String[] args) {
		/*  if(조건식) {
		 *     실행할 구문1;
		 *     실행할 구문2;... -> 실행할 구문이 없어도 에러가 발생하지 않음
		 *  }
		 */
		int a = 3;
		if(a > 4) {
			System.out.println("a는 4보다 큽니다.");
		}
		System.out.println("무조건 실행합니다.");
		// 조건식의 결과가 false면 if 뒤의 중괄호 내용을 건너뜀(실행할 구문을 무시함)
		// 조건식 뒤의 실행할 문장이 1줄인 경우 중괄호가 없어도 됨
	}
}

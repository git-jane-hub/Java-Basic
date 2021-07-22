
public class P10Method01 {
	public static void add(int a) {
		/* void는 '결과물 없음'을 의미 / 결과물이 있는 method도 있음
		 * add라는 이름을 main method 내부 영역에서 호출해야 실행되는 코드
		 * int a 자료를 호출시에 제공해야 내부 문장을 실행 가능
		 */
		System.out.println(a + 1);
	}
	public static void main(String[] args) { // 무조건 먼저 실행되는 method
		/* method는 자주 사용할 코드를 특정한 이름으로 붙여둔 것
		 * method 내부에는 불완전한 코드가 들어올 수 있음
		 * method는 이 불완전한 코드를 완성시킬 자료를 요청 가능
		 * method는 실행 결과물을 약속해야 사용할 수 있으며
		 * 실행 결과물이 있다면 return문을 이용해 약속된 실행 결과물을 호출 위치로 보내줌
		 * method는 main 외부에 작성
		 */
		add(1); // 스택 내부에서는 main method가 먼저 실행되고 add method를 호출, 요구하는 int a 변수 값도 함께 실행
		// 소괄호가 닫히면서 add method가 사라짐
	}
}


public class P14Method05 {
	/* 중괄호 여닫는 부분 내부를 "지역"이라고 함
	 * 중괄호가 닫히면 해당 "지역"과 지역 내 자료들은 모두 소멸
	 */
	public static void plus2(int c, int num) {
		System.out.println(c + num);
	} // 여기서 중괄호가 닫히면서 지역 내 자료들이 소멸
	public static void main(String[] args) {
		plus2(10, 20); // 해당 문장을 첫번 째로 실행 > plus method에서 호출 > plus method가 종료 > 아래 문장 실행
//		System.out.println(c);
//		System.out.println(num);  //plus method에서 중괄호가 닫혔기 때문에 c와 num변수가 있는 해당문장이 실행 안됨
	}
}

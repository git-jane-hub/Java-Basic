package static01;

public class P01StaticTest {
	// static이 안붙은 변수는 객체가 개별적으로 가지는 변수
	public int num1;
	/* static(정적)변수는 모든 객체가 공유하는 하나의 변수
	 * static 변수는 객체를 (new 키워드로 자료를)생성하기 전부터 존재
	 */
	public static int num2 = 0;
	
	public P01StaticTest() {
		this.num1 = 5;
		num2 += 1;
		System.out.println("num1 변수는 수치가 변하지 않음: " + num1);
		System.out.println("num2 변수는 수치가 변함: " + num2);
	}
}

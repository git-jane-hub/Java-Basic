package overloading;

public class P01Main {
	/* overloading은 과적재 라는 뜻으로 같은 이름의 메서드를 한 공간에 여럿 정의하는 것을 의미
	 * 자바는 메서드를 구분할 때 '이름'으로도 구분하지만 '파라미터의 개수'와 '파라미터 안의 자료형'으로도 구분함
	 * 오버로딩은 메서드 이름은 같아도 파라미터의 종류가 다르다면, 
	 * 호출구분이 가능함 - 허용되는 문법
	 * +생성자에서도 가능
	 */
	// static은 메인 메서드가 있는 클래스에서만 작성 (클래스 변수 = static + 인스턴스 변수)
	public static void over(int a) {
		System.out.println("출력1: " + a);
	}
	
	public static void over(int a, int b) {
		System.out.println("출력2: " + a + "," + b);
	}
	
	public static void over(String a) {
		System.out.println("출력3: " + a);
	}
	
	public static void main(String[] args) {
		over(1);
		over(1, 2);
		over("가나");
	}
}

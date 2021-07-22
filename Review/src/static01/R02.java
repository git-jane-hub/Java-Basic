package static01;

public class R02 {
	int a;				// 인스턴스 변수
	static int b;		// static 변수(클래스 변수)
	
	void c(){}			// 인스턴스 메서드
	static void d() {}  // static 메서드(클래스 메서드)
	
	void e() {
		System.out.println(a);	// 가능
		System.out.println(b);	// 가능
		c();			// 가능
		d();			// 가능
	}
	
	/* static 메서드는 인스턴스 변수와 메서드를 호출할 수 없음
	 * - 인스턴스 변수는 객체를 생성하고 호출할 수 있고,
	 * 	  인스턴스 메서드는 인스턴스 변수로 작업하는 메서드인데,
	 *   static 메서드가 객체가 없을 수 있기 때문에 
	 * 
	 */
	static void f() {   
//		System.out.println(a);	// 에러 - 인스턴스 변수 호출 불가
		System.out.println(b);	// 가능
//		c(); 			// 에러 - 인스턴스 메서드 호출 불가
		d();			// 가능
	}
}

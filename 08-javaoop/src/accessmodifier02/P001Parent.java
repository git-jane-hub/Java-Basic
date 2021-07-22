package accessmodifier02;

public class P001Parent {
	// public: 모든 접근이 가능
	public int a;
	// protected: 같은 패키지 혹은 같은 클래스 가능, 다른 패키지면  상속 관계여야 가능
	protected int b;
	// private: 같은 클래스 내부만 가능
	private int c;
	
	/* default 혹은 package friendly '같은 패키지 내부에서만' 접근 가능
	 * protected 와 private의 중간
	 */
	int d;
	
	public P001Parent() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}
}

package overloading;

public class P02OverTest {
	private String a;
	private int b;
	
	// 생성자 문법: 메서드처럼 작성, 리턴 자료형은 작성하지 않음, 이름은 해당 클래스명과 동일
	public P02OverTest() { // void parameter
		this.a = "0";
		this.b = 1;
	}
	public P02OverTest(String a) {
		this.a = a;
		this.b = 2;
	}
	public P02OverTest(int b) {
		this.a = "3";
		this.b = b;
	}
	public P02OverTest(String a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void showDate() {
		System.out.println("a: " + this.a);
		System.out.println("b: " + this.b);
		System.out.println("------------");
	}
}

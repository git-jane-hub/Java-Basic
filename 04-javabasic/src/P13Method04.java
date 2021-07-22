
public class P13Method04 {
	public static void info() {
		// 만약 내부 실행 구문이 완성된 구문(변수가 없는 자체적으로 실행되는 구문)이라면 굳이 파라미터를 요청하지 않아도 됨
		
		System.out.println("123");
		System.out.println("456");
		System.out.println("124");
		System.out.println("784");
		
	}
	public static void main(String[] args) {
		info();
		info();
	}
}

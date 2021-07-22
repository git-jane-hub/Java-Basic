package string01;

public class P09String09 {
	public static void main(String[] args) {
		/* 9. equals();
		 * 기본적으로 문자열은 참조형 변수이기 때문에 문자열을 '==' 으로 비교하면 주소값으로 비교됨
		 */
		String a = new String("test");
		String b = new String("test");	// new로 작성 시 객체가 새로 생성되어 새로운 주소를 부여
		String c = "test";
		String d = "test";				// 같은 문자열이기 때문에 같은 주소값을 부여
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println(c == d);
		
		// .equals()를 이용하면 주소값 비교가 아닌 문자열간 비교 가능
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		System.out.println(c.equals(d));
		System.out.println(d.equals(c));
	}
}

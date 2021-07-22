package string01;

public class P07Strin07 {
	public static void main(String[] args) {
		/* 6. toUpperCase()
		 * 문자열 전체를 대문자로 변경
		 * 대문자였던 것은 대문자 유지, 소문자만 대문자로 변경
		 */
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		
		/* 7. toLowerCase()
		 * 문자열 전체를 소문자로 변경
		 * 소문자였던 것은 소문자 유지, 대문자만 소문자로 변경
		 */
		System.out.println(hello.toLowerCase());
	}
}

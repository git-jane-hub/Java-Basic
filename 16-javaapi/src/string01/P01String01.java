package string01;

public class P01String01 {
	public static void main(String[] args) {
		/* String 클래스의 주요 메서드 확인 
		 * 1. charAt();
		 * : 특정 인덱스의 글자를 리턴 - 공백 포함
		 */
		String greeting = "Hello Java";
		char get = greeting.charAt(6);
		System.out.println(get);
//		System.out.println(greeting[6]);  // 자바는 문자열 인덱스 호출을 허용하지 않음
	}
}

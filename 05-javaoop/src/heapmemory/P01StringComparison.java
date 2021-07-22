package heapmemory;

public class P01StringComparison {
	public static void main(String[] args) {
		/* 자바는 문자열이 동일하다면 String의 객체를 공유함 - 메모리 절약을 위해서
		 * - 각자 다른 변수의 같은 문자열은 같은 주소값을 공유
		 */
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1);
		System.out.println(str2);
		/* 자바에서는 문자열의 일부분만 변경할 수는 없음
		 * str1[1] = "a";
		 */
		
		/* str1과 str2의 '주소' 비교를 위해서는 ==를 사용
		 * str1과 str2의 '문자' 비교를 위해서는 .equals()를 사용
		 */
		System.out.println(str1 == str2);      // true
		System.out.println(str1.equals(str2)); // true
		
		// new 키워드로 생성시 내용이 다른 변수와 같은 문자열이라도 별개의 공간에 저장 - 다른 주소값을 가짐
		String str3 = new String("Hello");
		System.out.println(str1 == str3);      // false - 주소값은 다르지만
		System.out.println(str1.equals(str3)); // true - 문자열은 같음
	}
}

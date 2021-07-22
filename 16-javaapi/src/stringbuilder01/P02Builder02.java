package stringbuilder01;

public class P02Builder02 {
	public static void main(String[] args) {
		/* 2. append();
		 * 기존 문자열 뒤에 새로운 문자열을 덧붙여줌
		 * 기존에 존재하는 문자열 뒤에 덧붙여주기 때문에 문자열의 길이가 연장됨
		 */
		StringBuilder a = new StringBuilder("asdf");
		System.out.println(a);
		System.out.println(a.length());
		
		a.append("qwer");
		System.out.println(a);
		System.out.println(a.length());
	}
}

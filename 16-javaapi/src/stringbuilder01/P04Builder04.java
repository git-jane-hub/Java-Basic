package stringbuilder01;

public class P04Builder04 {
	public static void main(String[] args) {
		/* 4. deleteCharAt();
		 * CharAt()은 기본적으로 한 글자를 의미
		 * 문자열 내부에서 지정된 인덱스 번호에 해당하는 딱 한 글자만 삭제
		 */
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		System.out.println(a.charAt(0));
		a.deleteCharAt(0);
		System.out.println(a);
		System.out.println(a.charAt(0));
	}
}

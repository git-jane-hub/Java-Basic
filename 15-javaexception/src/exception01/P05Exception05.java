package exception01;

public class P05Exception05 {
	public static void main(String[] args) {
		/* 예외 발생 케이스 5
		 * NumberFormatException
		 * 숫자 베이스가 아닌 문자를 숫자로 바꾸려고 할 때 발생하는 에러
		 */
		String a = "123qwe";
		int result = Integer.parseInt(a);
		System.out.println(result + 1);
	}
}

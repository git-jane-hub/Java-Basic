package stringbuilder01;

public class P08Builder08 {
	public static void main(String[] args) {
		/* 8. reverse()
		 * 문자열을 인덱스 순으로 따졌을 때 역순으로 나열
		 */
		StringBuilder str = new StringBuilder("zyxwvut");
		
		// 0 ~ 6으로 되어있는 배열 순서 인덱스를 6 ~ 0로 나열해줌
		str.reverse();
		System.out.println(str);
	}
}

package string01;

public class P06String06 {
	public static void main(String[] args) {
		/* 5. substring();
		 * 인덱스 기준으로 앞 문자열을 삭제
		 * 인데스 번호를 두 개 주면 처음 인덱스 번호 ~ 두 번째 인덱스 번호 직전까지만 남겨줌
		 */
		String str = "자바자바JSPJSP스프링스프링";		// 0 ~ 15
		String result = str.substring(5);		// 5 ~ 15(0 ~ 4 삭제)
		System.out.println(result);
		
		result = str.substring(10, 15);			// 10 ~ 14(0 ~ 9, 15 삭제)
		System.out.println(result);
	}
}

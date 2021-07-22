
public class P01ParseInt {
	public static void main(String[] args) {
		/* 정수자료는 문자로 바꾸지 않아도 
		 * System.out.println()구문 내에서 +로 문자와 연결시 자동으로 문자로 변경됨
		 * 그러나 문자 전체가 정수로만 이루어진 문자열을 정수로 치환하기 위해서는 별도의 문법을 사용함
		 */
		String str = "2021";
		// 문자열 안에는 숫자만 작성되어야함
		int year = Integer.parseInt(str);
		/* 'Integer.parseInt(문자열)'을 입력시 정수로 교환해줌
		 * integer: 정수
		 * parse: 문장을 분석하다_데이터를 가공하고 읽기 위해서 데이터의 형식을 변경하는 것
		 */
		
		System.out.println(year + 1);
		System.out.println(str + 1);
	}
}

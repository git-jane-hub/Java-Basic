
public class P02DataString {
	public static void main(String[] args) {
		/*  문자 자료형은 크게 두가지로 
		 *  문자: char, 홑따옴표
		 *  문자열: String, 겹따옴표
		 *  그러나 보통 String을 사용 
		 */
		byte a = 'a';
		/*  영어의 대소문자는 1byte내에서 처리가 가능
		 *  문자와 정수를 대응시키면(->ASCII코드표에 따른)
		 *  ""(null)의 값은 0, 공백의 값은 32, 숫자0의 값은 48, 대문자A의 값은 65, 소문자a의 값은 97
		 */
		char b = 'a';
		String c = "문자열입니다.";
		// 문자열과 단일문자는 서로 다른 자료형으로 간주하기 때문에 에러 발생
//		char c = "문자열";
//		String d = 'd';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

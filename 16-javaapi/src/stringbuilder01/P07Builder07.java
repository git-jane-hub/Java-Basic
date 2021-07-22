package stringbuilder01;

public class P07Builder07 {
	public static void main(String[] args) {
		/* 7. toString()
		 * 내부의 자료를 String으로 변경
		 * StringBuilder의 자료형은 String이 아니기 때문에 형변환이 필요
		 */
		StringBuilder str1 = new StringBuilder("가나다라마바사");
		
		// 자료형 불일치
//		String hangul = (String)str;
		
		// String으로 교환 시 toString();
		String hangul = str1.toString();
		
		System.out.println(hangul);
		
		/* String 자료형인 hangul을 StringBuilder형으로 변경해서
		 * StringBuilder str2라는 변수에 저장
		 */
		StringBuilder str2 = new StringBuilder(hangul);
		System.out.println(str2);
	}
}

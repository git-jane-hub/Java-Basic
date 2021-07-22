package string01;

public class P08String08 {
	public static void main(String[] args) {
		/* 8. trim();
		 * 공백이 아닌 문자가 시작하기 직전 모든 지점과 공백이 아닌 문자로 끝난 이후 지점의 모든 공백을 제거
		 * 해당 문자열의 앞뒤 공백을 제거 - 중간 공백은 해당되지 않음
		 */
		String str = "                        Hello          Java             ";
		str = str.trim();
		System.out.println(str);
		
		// replace()를 이용해서 중간 공백도 제거
		str = str.replace(" ", "");
		System.out.println(str);
		
		str = str.replace("o", "o ");
		System.out.println(str);
		
		// id 저장 - method chaining
		String id = "            QWER          ASDF    ZXC ";
		id = id.toLowerCase().replace(" ", "").trim();
		System.out.println(id);
	}
}

package string01;

public class P10String10 {
	public static void main(String[] args) {
		/* 10. String.valueOf();
		 * 괄호 사이의 자료를 문장열로 변경 - 기본 데이터 타입일 경우에만 가능
		 */
		String a = String.valueOf(1000);
		System.out.println(a);
		System.out.println(a + 1);
		
		String b = String.valueOf(2231.58924);
		System.out.println(b);
		System.out.println(b + 1);
		
		/* String.valueof()로 작성하지 않고, + ""만으로 문자열로 변경 가능
		 * 문자열 + 다른 데이터 타입일 경우, 다른 데이터 타입도 문자열로 변경
		 */
		String c = 1000 + "";
		System.out.println(c);
		System.out.println(c + 1);
		
		// boolean 데이터 타입에 대해서 원하는 방식으로 문자열로 변경
		String d = true + "";
		boolean e = true;
		System.out.println(d);
		System.out.println(e);
		System.out.println(d + 1);
//		System.out.println(e + 1);
		System.out.println(d.equals(e));
	}
}

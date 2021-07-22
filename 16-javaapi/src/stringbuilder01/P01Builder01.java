package stringbuilder01;

/* StringBuilder는 String 클래스와의 로직 차이로 인해 속도 개선이 됨
 * 일부 기능은 String의 기능과 동일
 */
public class P01Builder01 {
	public static void main(String[] args) {
		/* 1. insert();
		 * 2번부터의 자료를 뒤로 밀고 (2번자리에 insert) 확보된 공간에 "cd" 입력
		 */
		StringBuilder a = new StringBuilder("abefg");	// 0 ~ 4
		System.out.println(a.length());
		
		System.out.println(a.insert(2, "cd"));
		System.out.println(a);
		System.out.println(a.length());
	}
}

package stringbuilder01;

public class P03Builder03 {
	public static void main(String[] args) {
		/* 3. delete()
		 * 문자열의 일부 혹은 전체를 삭제
		 * delete(시작 인덱스, 끝 인덱스)를 입력하면 시작 지점부터 끝 지점 사이를 삭제
		 */
		StringBuilder a = new StringBuilder("asdfasdfasdf");	// 0 ~ 11
		System.out.println(a);
		a.delete(3, 10);										// 1 ~ 2, 10 ~ 11(3 ~ 9 삭제)
		System.out.println(a);
	}
}

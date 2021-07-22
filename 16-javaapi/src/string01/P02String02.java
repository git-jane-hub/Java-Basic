package string01;

public class P02String02 {
	public static void main(String[] args) {
		/* 2. indexOf();
		 * : 특정 문자열의 '시작' 인덱스 값을 반환 - 만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴
		 */
		String tomato = "tomato";	// t0 o1 m2 a3 t4 o5
		int get = tomato.indexOf("to");
		// 인덱스 0부터 찾기 때문에 0에 가까운 값부터 반환
		System.out.println(get);
		
		// 중복 문자 처리
		get = tomato.indexOf("to", 1);
		// 인덱스 0부터 찾지 말고 1부터 조회해서 반환
		System.out.println(get);
		
		// 해당 문자열에 포함되어 있지 않은 문자열 처리
		get = tomato.indexOf("banana");
		System.out.println(get);
	}
}

package stringbuilder01;

public class P05Builder05 {
	public static void main(String[] args) {
		/* 다음 문자열의 문자를 0부터 시작해서 문자를 3번째마다 삭제
		 * 힌트: 반복문 사용
		 */
		StringBuilder i = new StringBuilder("abcdefghijklmnopqrstuvwxyz");	// 0 ~ 25
		
		for(int a = 0; a < i.length(); a++) {	// 반복이 진행되는 동안 i의 길이가 계속 변경됨
			if(a % 3 == 0) {
				i.deleteCharAt(a);
			}
		}
		System.out.println(i);
	}
}

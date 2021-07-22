
public class P05DoWhile01 {
	public static void main(String[] args) {
		/* do ~ while 구문과 while 구문은 기본적으로 똑같음
		 * 단, 첫번째 바퀴는 조건비교 없이 바로 실행,_while 구문(조건비교-실행)과는 달리 '실행-조건비교'를 하기 때문
		 * 이후 두번째 바퀴부터는 각 바퀴마다 비교를 통해 추가 실행여부를 결정
		 */
		int a = 1;
		
		do { // do 구문을 먼저 작성
			a += 2; // a는 3 - a는 5
			System.out.println("a는 5보다 작다???");
		} while (a < 5); // 일반 while 구문과 달리 마지막에 ;이 붙음
	}
}

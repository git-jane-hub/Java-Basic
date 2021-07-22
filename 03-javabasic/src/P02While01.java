
public class P02While01 {
	public static void main(String[] args) {
		/* while 구문은 타겟이 되는 실행문을 반복해서 실행하는 구문
		 * while 구문은 실행여부를 조건식 비교를 통해 결정함
		 * 한 번 실행하기로 결정되면 모든 타겟 실행문을 실행
		 * 실행이 끝나면 다시 while 구문으로 복귀
		 * 추가 비교를 통해 실행(참)/탈출(거짓) 여부가 결정됨
		 */
		int a = 0;
		while (a < 2) { // 해당 조건에는 결과 값이 true와 false만 작성될 수 있음
			a  += 1;    // 위 조건에 있는 a와 아래 실행 내용의 a가 헷갈리지 않도록 주의
			System.out.println(a + "번째 실행.");
		} // 여기까지 실행되면 다시 while 구문으로 돌아가서 소괄호안의 조건을 비교 - 조건이 거짓이 되면 중괄호를 빠져나옴
	}
}

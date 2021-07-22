
public class P07Continue01 {
	public static void main(String[] args) {
		/* continue문은 스킵기능과 비슷
		 * 돌던 바튀를 즉시 종료하고, 다음 바퀴를 이어서 실행
		 * 전체 반복문을 종료시키는 break와 헷갈리지 않도록 주의
		 */
		for(int i = 1; i < 10; i++) {
			if((i == 6) || (i == 8)) { // if문의 조건이 참이면 아래 문장을 출력하고 - continue - 다시 for문으로 돌아가 반복 실행
				System.out.println("출력되지 않는 숫자입니다.");
				continue; // break 와 달리 continue를 만나면 여기서 종료 - for문으로 돌아감
			}
			System.out.println("이번 숫자는 " + i + "입니다."); // continue 대신 break가 있었으면 이 문장이 출력
		}
	}
}

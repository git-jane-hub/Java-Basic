package system01;

public class P01Exit01 {
	public static void main(String[] args) {
		// System.exit()은 break문처럼 실행 즉시 프로그램을 중단시킴
		System.out.println("실행중1");
		System.out.println("실행중2");
		System.out.println("실행중3");
		System.out.println("실행중4");
		System.exit(0);
		/* 0 정상종료(에러발생하지 않음)
		 * 0 이외의 비정상종료(에러발생)
		 */
		System.out.println("실행중5");
		System.out.println("실행중6");
	}
}

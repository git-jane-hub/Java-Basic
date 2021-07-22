package static02;

public class P01Asean {
	/* 중간고사, 기말고사, 출석, 조별과제 점수를 변수로 정의
	 * 단, 조별과제는 모든 객체가 공유하는 점수이고, 나머지는 개별 객체가 가지는 변수
	 */
	private int middleTermTest;
	private int endTermTest;
	private int attend;
	
	// public - 일반 메서드에서 score 조회 가능
//	public static int score = 20;
	// private - static 메서드에서만 조회 가능
	private static int score = 20;
	
	// 생성자는 객체 생성시 중간고사, 기말고사, 출석점수를 받음
	public P01Asean(int middle, int end, int attend) {
		this.middleTermTest = middle;
		this.endTermTest = end;
		this.attend = attend;
	}
	
	/* showAseanInfo()를 정의
	 * 이 메서드는 중간고사, 기말고사, 출결, 조별과제 성적을 콘솔에 출력
	 */
	public void showAseanInfo() {
		System.out.println("중간고사 점수: " + this.middleTermTest);
		System.out.println("기말고사 점수: " + this.endTermTest);
		System.out.println("출      결 점수: " + this.attend);
		System.out.println("조별과제 점수: " + score);
		System.out.println("-------------");
	}
}

package static01;

public class R01Team {
	private int midTerm;
	private int lastTerm;
	private int attend;
	
	private static int teamP = 30;
	
	public R01Team(int mid, int last, int attend) {
		this.midTerm = mid;
		this.lastTerm = last;
		this.attend = attend;
	}
	
	public void showInfo() {
		System.out.println("중간고사 점수: " + this.midTerm);
		System.out.println("기말고사 점수: " + this.lastTerm);
		System.out.println("출      결 점수: " + this.attend);
		System.out.println("조별과제 점수: " + this.teamP);
		System.out.println("-------------");
	}
}

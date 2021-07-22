package static01;

public class R01Main {
	public static void main(String[] args) {
		R01Team t1 = new R01Team(20, 20, 20);
		t1.showInfo();
		R01Team t2 = new R01Team(20, 20, 20);
		t2.showInfo();
		R01Team t3 = new R01Team(20, 20, 20);
		t3.showInfo();
		R01Team t4 = new R01Team(20, 20, 20);
		t4.showInfo();
		
//		System.out.println(R01Team.teamP); // private으로 작성된 static 변수
	}
}

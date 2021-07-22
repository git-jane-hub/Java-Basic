package inheritance.game;

public class P001Commoner {
	// 레벨, 체력, 아이디, 마나수치를 변수로 만들기
	public int level;
	public int power;
	public String id;
	public int manaNum;
	
	/*
	public P001Commoner(int l, int p, String i, int m){
		level = l;
		power = p;
		id = i;
		manaNum = m;
	}
	*/
	
	// 메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록 구성
	public void getInfo() {
		System.out.println("레벨: " + level);
		System.out.println("체력: " + power);
		System.out.println("아이디: " + id);
		System.out.println("마나수치: " + manaNum);
	}
}

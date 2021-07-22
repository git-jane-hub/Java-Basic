package accessmodifier02.game;

public class P001ArcherProtected extends P001CommonerProtected {
	public void getInfo2() {
		super.getInfo2();
//		System.out.println("데미지: " + dam);
	}
	
	public void hunt() {
		System.out.println("---------------");
		System.out.println("궁수가 사냥을 시작합니다.");
		pPower2 -= 7;
		exp2 += 9;
	}
	public void  multiShot() {
		System.out.println("---------------");
		System.out.println("궁수가 멀티샷을 씁니다.");
		manaNum2 -= 1;
		exp2 += 13;
	}
}

package accessmodifier02.game;

public class P001MagicianProtected extends P001CommonerProtected {
	public void getInfo2() {
		super.getInfo2();
//		System.out.println("데미지: " + dam);
	}
	
	public void hunt() {
		System.out.println("---------------");
		System.out.println("마법사가 사냥을 시작합니다.");
		pPower2 -= 3;
		exp2 += 15;
	}
	
	public void fireBall() {
		System.out.println("---------------");
		System.out.println("마법사가 파이어볼을 씁니다.");
		manaNum2 -= 5;
		exp2 += 10;
	}
}

package accessmodifier02.game;

public class P001WarriorProtected extends P001CommonerProtected{
	public void getInfo2() {
		super.getInfo2();
//		System.out.println("데미지: " + );
	}
	
	// setter(세터) - 값을 (개발자가 원하는 범위내에서)변경해주는 것
	public void hunt() {
		System.out.println("-----------");
		System.out.println("전사가 사냥을 시작합니다.");
		pPower2 -= 2;
		exp2 += 10;
	}
	
	public void doubleAttack2() {
		System.out.println("-----------");
		System.out.println("전사가 더블어택을 씁니다.");
		manaNum2 -= 2;
		exp2 += 15;
	}
}

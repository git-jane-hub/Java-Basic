package accessmodifier02.game;

public class P001CommonerProtected {
	protected int pPower2;
	protected int manaNum2;
	protected int level2;
	protected int exp2;
	
	public P001CommonerProtected() {
		this.pPower2 = 20;
		this.manaNum2 = 10;
		this.level2 = 1;
		this.exp2 = 0;
	}
	
	public void getInfo2() {
		System.out.println("체력: " + this.pPower2);
		System.out.println("마나: " + this.manaNum2);
		System.out.println("레벨: " + this.level2);
		System.out.println("경험: " + this.exp2);
	}
}

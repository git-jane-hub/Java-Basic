package accessmodifier.game;

public class P001Commoner {
	protected int pPower; //체력
	private int manaNum;  //마나
	private int level;    //레벨
	private int exp;      //경험치
	
	public P001Commoner() {
		this.pPower = 20;
		this.manaNum = 10;
		this.level = 1;
		this.exp = 0;
	}

	public void getInfo() {
		System.out.println("체력: " + this.pPower);
		System.out.println("마나: " + this.manaNum);
		System.out.println("레벨: " + this.level);
		System.out.println("경험: " + this.exp);
		System.out.println("-------------");
	}

	public int getPPower() {
		return this.pPower;
	}
	
	public void setPPower(int pPower) {
		this.pPower += pPower;
	}
	
	public int getManaNum() {
		return this.manaNum;
	}
	
	public void setManaNum(int manaNum) {
		this.manaNum += manaNum;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level += level;
	}
	
	public int getExp() {
		return this.exp;
	}
	
	public void setExp(int exp) {
		this.exp += exp;
	}
}

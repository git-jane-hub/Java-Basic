package interaction.game;

public class P001Orc {
	private int pPower;       // 체력
	private int attackPower;  // 공격력
	private int defensePower; // 방어력
	
	public P001Orc() {
		this.pPower = 5;
		this.attackPower = 3;
		this.defensePower = 0;
	}
	
	public void doBattle(int userAttack) {
		this.pPower = (this.pPower + this.defensePower) - userAttack;
		if(pPower <= 0) {
			System.out.println("이 오크는 이미 죽었습니다.");
		}
	}
	public int getPPower() {
		return this.pPower;
	}
	public int getAttackPower() {
		return this.attackPower;
	}
}

package interaction.game;

public class P002Magician {
	private int pPower;         // 체력
	private int attackPower;    // 공격력
	private int defensePower;   // 방어력
	private int mana;           // 마나
	private int level;          // 레벨
	private int exp;            // 경험치
	
	public P002Magician() {
		this.pPower = 20;
		this.attackPower = 4;
		this.defensePower = 1;
		this.mana = 10;
		this.level = 1;
		this.exp = 0;
	}
	public void showStatus() {
		System.out.println("-----마법사 상태-----");
		System.out.println("마법사 체  력: " + this.pPower);
		System.out.println("마법사 마  나: " + this.mana);
		System.out.println("마법사 레  벨: " + this.level);
		System.out.println("마법사 공격력: " + this.attackPower);
		System.out.println("마법사 방어력: " + this.defensePower);
		System.out.println("마법사 경험치: " + this.exp);
	}
	
	public void huntOrc(P001Orc orc) {
		if(orc.getPPower() <= 0) {
			System.out.println("이미 죽은 오크를 공격할 수 없습니다.");
			return;
		}
		orc.doBattle(this.attackPower);
		if(orc.getAttackPower() > (this.pPower + this.defensePower)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(orc.getPPower() <= 0) {
			System.out.println("경험치 20을 획득했습니다.");
			this.exp += 20;
		}
		this.pPower = (this.pPower + this.defensePower) - orc.getAttackPower();
		System.out.println("오크와의 교전 완료!");
	}
	
	public void huntTroll(P001Troll troll) {
		if(troll.getPPower() <= 0) {
			System.out.println("이미 죽은 트롤를 공격할 수 없습니다.");
			return;
		}
		troll.doBattle(this.attackPower);
		if(troll.getAttackPower() > (this.pPower + this.defensePower)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(troll.getPPower() <= 0) {
			System.out.println("경험치 25을 획득했습니다.");
			this.exp += 25;
		}
		this.pPower = (this.pPower + this.defensePower) - troll.getAttackPower();
		System.out.println("트롤과의 교전 완료!");
	}
	
	public void huntDragon(P001Dragon dragon) {
		if(dragon.getPPower() <= 0) {
			System.out.println("이미 죽은 드래곤을 공격할 수 없습니다.");
			return;
		}
		dragon.doBattle(this.attackPower);
		if(dragon.getAttackPower() > (this.pPower + this.defensePower)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(dragon.getPPower() <= 0) {
			System.out.println("경험치 50을 획득했습니다.");
			this.exp += 50;
		}
		this.pPower = (this.pPower + this.defensePower) - dragon.getAttackPower();
		System.out.println("드래곤과의 교전 완료!");
	}
	
	public void huntSkeleton(P001Skeleton skeleton) {
		if(skeleton.getPPower() <= 0) {
			System.out.println("이미 죽은 스켈레톤을 공격할 수 없습니다.");
			return;
		}
		skeleton.doBattle(this.attackPower);
		if(skeleton.getAttackPower() > (this.pPower + this.defensePower)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(skeleton.getPPower() <= 0) {
			System.out.println("경험치 40을 획득했습니다.");
			this.exp += 40;
		}
		this.pPower = (this.pPower + this.defensePower) - skeleton.getAttackPower();
		System.out.println("스켈레톤과의 교전 완료!");
	}
	
	public int getMagicianPPower() {
		return this.pPower;
	}
}

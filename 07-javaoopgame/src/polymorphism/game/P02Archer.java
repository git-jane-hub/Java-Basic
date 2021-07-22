package polymorphism.game;

public class P02Archer {
	private int pPower;         // 체력
	private int attackPower;    // 공격력
	private int defensePower;   // 방어력
	private int mana;           // 마나
	private int level;          // 레벨
	private int exp;            // 경험치
	
	public P02Archer() {
		this.pPower = 100;
		this.attackPower = 4;
		this.defensePower = 1;
		this.mana = 50;
		this.level = 1;
		this.exp = 0;
	}
	public void showStatus() {
		System.out.println("---궁수 상태---");
		System.out.println("궁수 체  력: " + this.pPower);
		System.out.println("궁수 마  나: " + this.mana);
		System.out.println("궁수 레  벨: " + this.level);
		System.out.println("궁수 공격력: " + this.attackPower);
		System.out.println("궁수 방어력: " + this.defensePower);
		System.out.println("궁수 경험치: " + this.exp);
	}
	
	public void hunt(P01Monster mon) {
		System.out.println(mon.getName() + " 몬스터 사냥을 시작합니다.");
		if(mon.getPPower() <= 0) {
			System.out.println("이미 죽은 " + mon.getName() + " 몬스터를 공격할 수 없습니다.");
			return;
		}
		mon.doBattle(this.attackPower);
		if(mon.getAttackPower() > (this.pPower + this.defensePower)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(mon.getPPower() <= 0) {
			if(mon.getName() == "오크") {
				System.out.println("경험치 20을 획득했습니다.");
				this.exp += 20;
			}else if(mon.getName() == "트롤") {
				System.out.println("경험치 25을 획득했습니다.");
				this.exp += 25;
			}else if(mon.getName() == "드래곤") {
				System.out.println("경험치 50을 획득했습니다.");
				this.exp += 50;
			}else if(mon.getName() == "스켈레톤"){
				System.out.println("경험치 40을 획득했습니다.");
				this.exp += 40;
			}
			System.out.println(mon.getName() + " 몬스터와의 교전 완료!");
			return;
		}
		this.pPower = (this.pPower + this.defensePower) - mon.getAttackPower();
		System.out.println(mon.getName() + " 몬스터와의 교전 완료!");
	}
	
	public void multiShot(P01Monster mon) {
		System.out.println(mon.getName() + " 몬스터에게 multi shot을 준비합니다.");
		if(mon.getPPower() <= 0) {
			System.out.println("이미 죽은 " + mon.getName() + " 몬스터를 공격할 수 없습니다.");
			return;
		}
		mon.doBattle(this.attackPower);
		mon.doBattle(this.attackPower);
		this.mana = this.mana - 5;
		if(mon.getAttackPower() > (this.pPower + this.defensePower)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(mon.getPPower() <= 0) {
			if(mon.getName().equals("오크")) {
				System.out.println("경험치 35을 획득했습니다.");
				this.exp += 35;
			}else if(mon.getName() == "트롤") {
				System.out.println("경험치 40을 획득했습니다.");
				this.exp += 40;
			}else if(mon.getName() == "드래곤") {
				System.out.println("경험치 50을 획득했습니다.");
				this.exp += 50;
			}else if(mon.getName() == "스켈레톤"){
				System.out.println("경험치 45을 획득했습니다.");
				this.exp += 45;
			}
			System.out.println(mon.getName() + " 몬스터와의 교전 완료!");
			return;
		}
		this.pPower = (this.pPower + this.defensePower) - mon.getAttackPower();
		System.out.println(mon.getName() + " 몬스터와의 교전 완료!");
	}
	
	public int getArcherPPower() {
		return this.pPower;
	}
}

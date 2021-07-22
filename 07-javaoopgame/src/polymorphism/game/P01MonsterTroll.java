package polymorphism.game;

public class P01MonsterTroll extends P01Monster {
	public P01MonsterTroll() {
		super("트롤", 35, 5, 4);
		
	}
	public void doBattle(int userAttack) {
		setPPower(getPPower() + getDefensePower() - userAttack);
		if(getPPower() <= 0) {
			System.out.println("이 " + super.getName() + " 몬스터는 이미 죽었습니다.");
		}
	}
}

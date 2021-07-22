package polymorphism.game;

public class P01MonsterSkeleton extends P01Monster{
	public P01MonsterSkeleton() {
		super("스켈레톤", 30, 6, 4);
		
	}
	public void doBattle(int userAttack) {
		setPPower(getPPower() + getDefensePower() - userAttack);
		if(getPPower() <= 0) {
			System.out.println("이 " + super.getName() + " 몬스터는 이미 죽었습니다.");
		}
	}
}

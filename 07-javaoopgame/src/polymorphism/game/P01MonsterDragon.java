package polymorphism.game;

public class P01MonsterDragon extends P01Monster{
	public P01MonsterDragon() {
		super("드래곤", 50, 4, 5);
		
	}
	public void doBattle(int userAttack) {
		setPPower(getPPower() + getDefensePower() - userAttack);
		if(getPPower() <= 0) {
			System.out.println("이 " + super.getName() + " 몬스터는 이미 죽었습니다.");
		}
	}
}

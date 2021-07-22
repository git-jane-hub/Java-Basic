package polymorphism.game;

public class P01MonsterOrc extends P01Monster{
	public P01MonsterOrc() {
		/* 연결한 부모 클래스 생성자에 입력을 받는 것으로 작성하고
		 * 각 monster마다 다른 값을 넣어주려면, super()로 부모의 변수를 받아 값을 초기화
		 */
		super("오크", 20, 3, 1);
	}
	
	public void doBattle(int userAttack) {
		setPPower(getPPower() + getDefensePower() - userAttack);
		if(getPPower() <= 0) {
			System.out.println("이 " + super.getName() + " 몬스터는 이미 죽었습니다.");
		}
	}
}

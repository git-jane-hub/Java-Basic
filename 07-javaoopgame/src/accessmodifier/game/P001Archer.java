package accessmodifier.game;
// 궁수
public class P001Archer extends P001Commoner{

	public void hunt() {
		System.out.println("궁수가 사냥을 시작합니다.");
		setPPower(-2);
		setExp(10);
	}
	public void multiShot() {
		System.out.println("궁수가 멀티샷을 씁니다.");
		setManaNum(-2);
		setExp(15);
	}
	public void skillA() {
		System.out.println("궁수가 skillA를 씁니다.");
		// 0 이하로 내려가면 0으로 고정
		setPPower(-10);
		if(getPPower() <= 0) {
			setPPower(-(getPPower()));
		}
		setLevel(1);
	}
	
	public void cure() {
		setPPower(10);
		setManaNum(-2);
	}
}

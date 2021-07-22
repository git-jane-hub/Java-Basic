package accessmodifier.game;
// 마법사
public class P001Magician extends P001Commoner{
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		setPPower(-2);
		setExp(-10);
	}

	public void multiShot() {
		System.out.println("마법사가 멀티샷을 씁니다.");
		setManaNum(-2);
		setExp(15);
	}
}

package inheritance.game;

public class P001Archer extends P001Commoner{
	public int damB;
	
	public void getInfo() {
		System.out.println("레벨: " + level);
		System.out.println("체력: " + power);
		System.out.println("아이디: " + id);
		System.out.println("마나수치: " + manaNum);
		System.out.println("데미지B: " + damB);
	}
}

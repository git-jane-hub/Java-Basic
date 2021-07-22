package polymorphism.game;

public class P03Main {
	public static void main(String[] args) {
		P02Magician m1 = new P02Magician();
		P02Warrior w1 = new P02Warrior();
		P02Archer a1 = new P02Archer();
		P01Monster mon1 = new P01MonsterOrc();
		m1.hunt(mon1);
		m1.fireball(mon1);
		m1.fireball(mon1);
		w1.hunt(mon1);
		w1.doubleAttack(mon1);
		a1.multiShot(mon1);
		a1.multiShot(mon1);
		m1.showStatus();
		w1.showStatus();
		a1.showStatus();
		
		
	}
}

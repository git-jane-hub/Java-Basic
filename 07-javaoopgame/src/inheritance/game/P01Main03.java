package inheritance.game;

public class P01Main03 {
	public static void main(String[] args) {
		// 신직업군 2개를 생성
		P001Magician m1 = new P001Magician();
		m1.level = 5;
		m1.power = 45;
		m1.id = "magician1";
		m1.manaNum = 8;
		m1.damA = 18;	
			
		m1.getInfo();
		System.out.println("----------");
		P001Archer a1 = new P001Archer();
		a1.level = 7;
		a1.power = 31;
		a1.id = "archer1";
		a1.manaNum = 18;
		a1.damB = 21;	
			
		a1.getInfo();
	}
}

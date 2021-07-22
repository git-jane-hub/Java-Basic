package inheritance.game;

public class P01Main01 {
	public static void main(String[] args) {
		// 초보자 계정을 하나 생성
		P001Commoner c1 = new P001Commoner();
		c1.level = 1;
		c1.power = 10;
		c1.id = "newbie1";
		c1.manaNum = 1;

		c1.getInfo();
	}
}

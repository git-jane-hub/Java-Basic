package inheritance.game;

public class P01Main02 {
	public static void main(String[] args) {
		/* Warrior 를 생성해서 각종 스탯을 입력해준 다음 getInfo() 호출
		 * 
		 * getInfo() 호출 시 Commoner의 getInfo()는 무시되며
		 * Warrior의 getInfo()가 우선적으로 호출됨
		 */
		P001Warrior w2 = new P001Warrior();
		w2.level = 3;
		w2.power = 30;
		w2.id = "warrior1";
		w2.manaNum = 5;
		w2.damP = 15;
		
		w2.getInfo();
	}
}

package inheritance.game;
// Commoner 상속을 받기
public class P001Warrior extends P001Commoner{
	/* Commoner 상속으로 인해 체력, 마나, 아이디 수치는 이미 변수로 작성됨
	 * 전사 클래스는 평민과 달리 물리공격력 수치를 부여받게 하기
	 */
	public int damP;
	/* getInfo() 함수를 이름 그대로 같게 재정의
	 * Warrior 의 물리데미지 수치까지 같이 콘솔에 출력
	 */
	public void getInfo() {
		super.getInfo();
//		System.out.println("레벨: " + level);
//		System.out.println("체력: " + power);
//		System.out.println("아이디: " + id);
//		System.out.println("마나수치: " + manaNum);
		System.out.println("물리데미지: " + damP);
	}
}

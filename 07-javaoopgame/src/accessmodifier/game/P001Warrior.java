package accessmodifier.game;
// 전사
public class P001Warrior extends P001Commoner{
	
//	 public void getInfo() {
//	 	getInfo();
//	 	/* Commoner에 getInfo()를 작성하지 않고,
//	 	 * Warrior에서 getInfo()를 호출해서 출력하려면 아래처럼 작성해야됨
//	 	 * 
//	 	 * System.out.println("체력: " + getPPower());
//	 	 */
//	  }
     
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setPPower(-2);
		setExp(10);
	}
	/*
	 * public void hunt() {
	 * 		System.out.println("전사가 사냥을 시작합니다.");
	 * 		setPPower(getPPower()-2);
	 * 		setExp(getExp()+10);
	 * 
	 *  - 이렇게 작성하려면, P001Commoner 클래스의 getter와 setter가 아래처럼 작성되어야 함
	 *  
	 * public void getPPower();
	 * 		return this.pPower;
	 * public void setPPower(int pPower);
	 * 		this.pPower = pPower; // 사용자에게 입력받은 값을 그대로 this.pPower에 덮어씌움
	 *      (장점: setter내부에 다른 연산이 없고 입력된 값을 대입만 해주기 때문에,
	 *            hunt내부에서 getpPower() 메서드를 호출하고 해당 값에 곱하기나 나눗셈 연산도 가능
	 *            + if문이나 for문 작성하기가 더 쉬움)
	 */
	
	public void doubleAttack() {
		System.out.println("전사가 더블어택을 씁니다.");
		setManaNum(-2);
		setExp(15);
	}
}

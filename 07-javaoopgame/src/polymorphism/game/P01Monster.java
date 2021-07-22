package polymorphism.game;

public abstract class P01Monster {
	private String name;      // 이름 추가
	private int pPower;       // 체력
	private int attackPower;  // 공격력
	private int defensePower; // 방어력
	
	public P01Monster(String name, int pPower, int attackPower, int defensePower) {
		this.name = name;
		this.pPower = pPower;
		this.attackPower = attackPower;
		this.defensePower = defensePower;
	}
	
	/* abstract 작성 후, 오버라이딩을 위해 작성했던 내부 내용을 삭제해서 불완전하게 만듦
	 * - P01Monster 객체 생성을 막기 위해서
	 * 중괄호{}를 작성하지 않음 - 중괄호가 작성되지 않으면 컴퓨터가 불완전한 내용이라고 인식함
	 */
	public abstract void doBattle(int userAttack);
	
	public String getName() {
		return this.name;
	}
	public int getPPower() {
		return this.pPower;
	}
	public void setPPower(int pPower) {
		this.pPower = pPower;
	}
	public int getAttackPower() {
		return this.attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getDefensePower() {
		return this.defensePower;
	}
	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}
}

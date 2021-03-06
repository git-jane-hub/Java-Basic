package accessmodifier;
// 접근 제한자
public class P001Warrior02 {
	// 사용자가 main에서 임의로 수치를 고치는 것을 막기위해 public 대신 private으로 수정
	// hp, atk, level, exp, id 속성 추가
	private int hp;
	private int atk;
	private int level;
	private int exp;
	private String id;
	
	/* 메서드는 아무리 사용해도 개발자의 의도대로만 사용되도록 제한하기 수월하기 때문에 일반적으로 public으로 설정함
	 */
	public P001Warrior02(String id) {
		// 디폴트 값을 설정할 수 있음
		// 체력, 공격력은 생성시 20, 3으로
		this.hp = 20;
		this.atk = 3;
		// 레벨, 경험치는 생성시 1, 0으로
		this.level = 1;
		this.exp = 0;
		// id는 사용자가 입력한대로
		this.id = id;
	}
	public void getInfo() {
		System.out.println("아이디: " + id);
		System.out.println("레벨: " + level);
		System.out.println("체력: " + hp);
		System.out.println("공격력: " + atk);
		System.out.println("경험치: " + exp);
	}
	/* private으로 설정하면 사용자가 게임을 진행해도 수치가 변하지 않기 때문에 public으로 작성
	 * hunt()는 인스턴스변수를 private으로 접근을 제어해도, 같은 클래스 내부이기 때문에 접근이 가능함
	 */
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력은 " + hp + "가 되었고");
		System.out.println("누적 경험치는 " + exp + "가 되었습니다.");
	}
}

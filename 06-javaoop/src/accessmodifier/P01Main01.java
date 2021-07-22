package accessmodifier;

public class P01Main01 {
	public static void main(String[] args) {
		/* 전사를 하나 만들고 사냥을 3번 진행
		 * 사냥 3번 후에 전체 상태를 출력
		 */
		P001Warrior02 w1 = new P001Warrior02("qwer");
		w1.hunt();	
		w1.hunt();	
		w1.hunt();	
//		System.out.println("아이디: " + w1.id);
//		System.out.println("레벨: " + w1.level);
//		System.out.println("체력: " + w1.hp);
//		System.out.println("공격력: " + w1.atk);
//		System.out.println("경험치: " + w1.exp);
		w1.getInfo();
//		w1.hp = 10000000;
		/* 접근 제한자가 없으면, 위처럼 사용자가 마음대로 수치를 변경할 수 있음
		 * 그래서 P001Warrior02 변수 선언에서 public을 private으로 변경
		 * 그러면 해당 클래스에서 w1.id 등에 에러가 발생함 / w1.hunt에서는 에러가 발생하지 않음
		 * private으로 작성된 변수에서는 에러가 발생 / w1.hunt는 private으로 작성되지 않음
		 */
		
		P001Warrior02 w2 = new P001Warrior02("asdf");
		w2.hunt();
		w2.getInfo();
		
	}
}

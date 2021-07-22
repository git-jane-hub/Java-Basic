package abstract01;

public class P02Main {
	public static void main(String[] args) {
		// P01Parent 타입은 직접 생성 불가 - 불완전한 메서드가 있기 때문
//		P01Parent p1 = new P01Parent();
		
		/* 단 P01Parent를 상속받아 getA 메서드로 구체화시킨
		 * P01Child 타입으로는 객체 생성 및 사용이 가능
		 */
		P01Child c = new P01Child();
		c.getA();
		
		// 추가로 오버라이딩 없이 상속받은 일반 메서드도 호출 가능
		c.getInfo();
	}
}

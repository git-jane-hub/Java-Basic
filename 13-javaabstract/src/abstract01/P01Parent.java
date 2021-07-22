package abstract01;
/* 추상 클래스
 * abstract 선언이 붙은 클래스는 new를 이용한 직접적인 '객체 생성이 불가능'
 */
public abstract class P01Parent { // 추상메서드가 있는 클래스는 반드시 추상 클래스여야 함
	public int a;
	
	public P01Parent() {
		this.a = 5;
	}
	
	/* 추상 메서드 - 아래와 같이 실행문 없이 작성(불완전한 메서드)
	 * abstract를 작성해주었기 때문에, 내부에 실행문을 작성하지 않아도 에러 발생하지 않음
	 */
	public abstract void getA();
	
	// 추상 메서드 내부의 일반 클래스는 그냥 작성
	public void getInfo() {
		System.out.println("일반 메서드");
	}
}

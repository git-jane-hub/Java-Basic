package casting;

public class P01Kangaroo extends P01Animal{

	public P01Kangaroo(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("캥거루가 먹이를 먹습니다.");
	}
	
	// 오버라이딩 되지 않은 메서드
	public void jump() {
		System.out.println("캥거루가 점프합니다.");
	}
}

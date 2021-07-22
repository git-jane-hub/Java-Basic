package casting;

public class R01Koala extends R01Animal {
	public R01Koala(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("코알라가 먹이를 먹습니다.");
	}
	
	public void sleep() {
		System.out.println("코알라가 잠을 잡니다.");
	}
}

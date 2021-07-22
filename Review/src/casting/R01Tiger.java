package casting;

public class R01Tiger extends R01Animal{
	public R01Tiger(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("호랑이가 먹이를 먹습니다.");
	}
	
	public void run() {
		System.out.println("호랑이가 달립니다.");
	}
}

package casting;

public class P01Tiger extends P01Animal{

	public P01Tiger(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("호랑이가 먹이를 먹습니다.");
	}
	
	public void growl() {
		System.out.println("호랑이가 으르렁 거립니다.");
	}
}

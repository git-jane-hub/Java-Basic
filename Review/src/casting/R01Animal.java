package casting;

public class R01Animal {
	private String name;
	private int age;
	
	public R01Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
}

package polymorphism;

public class P01Army extends P01Person{
	private String rank;
	
	public P01Army(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}
	
	public void showArmy() {
//		System.out.println("이름: " + super.getPersonName());
//		System.out.println("나이: " + super.getPersonAge());
		super.showPerson();
		System.out.println("계급: " + this.rank);
	}
	
	// 오버라이딩
	public void showPerson() {
		super.showPerson();
		System.out.println("계급: " + this.rank);
	}
}
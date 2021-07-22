package polymorphism;

public class P01Salaryman extends P01Person{
	private int pay;
	
	public P01Salaryman(String name, int age, int pay) {
		super(name, age);
		this.pay = pay;
	}
	
	public void showSalaryman() {
		super.showPerson();
		System.out.println("연봉: " + this.pay + "만원");
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("연봉: " + this.pay + "만원");
	}
}

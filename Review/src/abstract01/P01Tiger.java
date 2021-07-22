package abstract01;

public class P01Tiger extends P01Animal{

	@Override
	public void type() {
		System.out.println("호랑이");
	}
	
	@Override
	public void eat() {
		System.out.println(getFood() + "는 고기");
	}
	
}

package abstract01;

public abstract class P01Animal {
	private String food;
	private int size;
	
	public P01Animal() {
		this.food = "먹이";
		this.size = 0;
	}
	
	public abstract void type();
	
	public abstract void eat();
	
	public String getFood() {
		return food;
	}
}

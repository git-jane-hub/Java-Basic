package abstract01;

public class P01Main {
	public static void main(String[] args) {
//		P01Animal a1 = new P01Animal();
		// P01Animal에는 abstract로 작성되었기 때문에 객체 생성이 불가능
		P01Animal a1 = new P01Tiger();
		a1.type();
		a1.eat();
	}
}

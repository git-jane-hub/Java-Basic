package abstract01;

public class P01Child extends P01Parent{
	// P01Parent의 불완전한 메서드를 implements
	public void getA() {
		System.out.println(a + "가 저장되어 있었던 값");
	}
}

package casting;

public class P03MainInstanceof {
	public static void main(String[] args) {
		P01Animal t1 = new P01Tiger("호랑3", 3);
		
		// 현재 P01Animal 타입인 t1의 근본자료형이 P01Tiger 인지 검사 - true
		System.out.println(t1 instanceof P01Tiger);
		
		// 현재 P01Animal 타입인 t1의 근본자료형이 P01Kangaroo 인지 검사 - false
		System.out.println(t1 instanceof P01Kangaroo);
		
		// 현재 P01Animal 타입인 t1의 근본자료형이 P01Animal 인지 검사 - true(이해 안됨)
		System.out.println(t1 instanceof P01Animal);
	}
}

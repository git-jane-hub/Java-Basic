package casting;

public class P02Main {
	public static void main(String[] args) {

		P01Animal t1 = new P01Tiger("호랑", 5);
		/* 자식타입을 베이스로 만든 부모타입 변수는
		 * 자식타입으로 강제로 바꿀 수 있음
		 */
		P01Tiger tiger = (P01Tiger)t1;
		t1.eat();
		System.out.println("------");
		// 강제 타입 변환을 사용해서 오버라이딩 되지 않은 메서드도 사용 가능
		tiger.eat();
		tiger.growl();
		System.out.println("------");
		
		P01Animal k1 = new P01Kangaroo("캥걸", 4);
		P01Kangaroo kangaroo = (P01Kangaroo)k1;
		k1.eat();
		kangaroo.jump();
		System.out.println("------");

		// Animal 타입은 어떤 자료형이든 받을 수 있음
		P01Animal a1 = new P01Animal("동물", 3);
		a1.eat();
		
//		P01Tiger tiger2 = (P01Tiger)a1;
//		tiger2.growl();     // 에러 발생 - 강제 타입 변환을 사용할 수 없음
	}
}

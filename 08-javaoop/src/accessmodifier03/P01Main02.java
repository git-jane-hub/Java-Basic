package accessmodifier03;

public class P01Main02 {
	public static void main(String[] args) {
		// 다른 패키지에서 상속받은 P001Child02를 확인
		P001Child02 child2 = new P001Child02();
		
		// 1. public
		System.out.println(child2.a);
		
		// 1-2. child2 내부의 e값 변경 및 접근
		child2.e = 100;
		System.out.println(child2.e);
		
		/* 2. protected
		 * protected는 같은 패키지, 혹은 다른 패키지라면 상속관계일 때 접근 가능
		 * 같은 패키지 내부인데 에러가 발생하는 이유는, main에서 접근했기 때문
		 */
//		System.out.println(child2.b);
		child2.getB();
		
		// 3. default - 패키지가 같으면 접근 가능
//		System.out.println(child2.d);
		
		child2.setB(3);
		child2.getB();
		System.out.println(child2.getBInt());
		child2.getB();
		child2.setB(5);
		System.out.println(child2.getBInt());
//		System.out.println(child2.getB());
	}
}

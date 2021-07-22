package accessmodifier02;

public class P01Main {
	public static void main(String[] args) {
		// Parent를 상속받은 Child 내부의 자료 조회
		P001Child child = new P001Child();
		// 1. public 자료
		System.out.println(child.a);
		
		/* 2. protected 자료 - 상속관계에 있기 때문에 접근 가능
		 * 현재 Main.java와 같은 패키지 내부에 Parent, Child가 존재하므로 protected 접근 가능
		 */
		System.out.println(child.b);
		
		/* 3. private 자료 - 같은 클래스 내부가 아니기 때문에 접근 불가능(The field P001Parent.c is not visible)
		 * Child까지는 접근이 가능하지만, c에 접근이 불가능
		 */
//		System.out.println(child.c);
		
		// 4. default 자료 - 같은 패키지기 때문에 접근 가능
		System.out.println(child.d);
		
		/* 스택의 main에서 힙에 있는 객체에 접근하는 것은 불가능(The field P001Parent.c is not visible)
		 * '3'이라는 숫자를 출력하고 싶으면,
		 * Parent 내부에서 메서드 출력문을 만들고, 해당 메서드를 호출해야함
		 */
		P001Parent child2 = new P001Parent();
//		System.out.println(child2.c);
	}
}

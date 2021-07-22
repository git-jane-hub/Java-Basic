package accessmodifier03;

import accessmodifier02.P001Child;

public class P01Main01 {
	public static void main(String[] args) {
		// 패키지가 다른 (accessmodifier02의)child를 생성
		P001Child child = new P001Child();
		
		// 접근제한자
		// 1. public - 접근 가능
		System.out.println(child.a);
		// 2. protected - 다른 패키지에 속한 main에서는 접근이 불가능
//		System.out.println(child.b);
		// 3. private
//		System.out.println(child.c);
		// 4.default
//		System.out.println(child.d);
		
		/*
		P001Child02 child2 = new P001Child02();
		System.out.println(child2.a);
		System.out.println(child2.b);
		System.out.println(child2.c);
		System.out.println(child2.d);
		*/
	}
}

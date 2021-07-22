package structure;

public class P01Structure01 {
	public static void main(String[] args) {
		/* Scanner와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은 아래와 같이
		 * new 자료형();
		 * 문법으로 생성
		 */
		
		// P001Person에 선언한 변수가 a
		P001Person a = new P001Person(); 
		/* a라는 구조체에 이름, 나이, 폰번호를 입력
		 * 원래는 변수 하나에 하나의 값만 저장할 수 있지만, a라는 구조체에는 여러개의 값을 저장할 수 있음
		 */
		a.name = "최재인";
		a.age = 28;
		a.pNum = "010-1234-5678";
		a.address = "seoul";
		
		// 입력된 자료를 하나하나 출력
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.pNum);
		System.out.println(a.address);
		
		// 다른 사람을 한 명 더 특정하기(b)
		P001Person b = new P001Person();
		b.name = "김철수";
		b.age = 25;
		// 입력된 자료를 하나하나 출력
		b.pNum = "010-9876-5432";
		b.address = "suwon";
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.pNum);
		System.out.println(b.address);
	}
}

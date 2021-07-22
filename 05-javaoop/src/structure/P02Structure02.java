package structure;

public class P02Structure02 {
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	
	/* Structure01과 다르게 하나의 method를 더 만들어, method 내부에 출력을 할 수 있게 실행문을 만들고
	 * main method에서 getInfo method만 호출하면, getInfo method의 내부의 실행문을 출력
	 * - 1. 실행문도 호출하는 method에서 한번만 작성, 2. 기능을 추가해도 추가된 기능을 method 내부에 한번만 작성
	 * 
	 * method가 늘어나면서 가독성이 좋지 않음
	 * 해결방법: 아래처럼
	 * 1. P00Person 클래스에서 사용할 변수를 선언하고,
	 * 2. P02Structure02 클래스에서 관련된 내용의 실행문을 작성했는데,
	 * 1-2번의 내용을 하나로 묶어서 P00Person에 클래스에 변수선언과 실행할 문장을 함께 작성
	 */
	static void getInfo(P001Person p) { // 소괄호 안에 있는 내용이 요청하는 내용
		System.out.println("사람 이름: " + p.name);
		System.out.println("사람 나이: " + p.age);
		System.out.println("사람 번호: " + p.pNum);
		System.out.println("사람 주소: " + p.address);
	}
	
	static void getCatInfo(P002Cat c) {
		System.out.println("고양이 이름: " + c.name);
		System.out.println("고양이 나이: " + c.age);
		System.out.println("고양이 품종: " + c.kind);
		
	}
	
	public static void main(String[] args) {
		P001Person personA = new P001Person();
		personA.name = "가나다";
		personA.age = 20;
		personA.pNum = "010-1234-5678";
		personA.address = "seoul";
				
		P001Person personB = new P001Person();
		personB.name = "마바사";
		personB.age = 30;
		personB.pNum = "010-9876-5432";
		personB.address = "suwon";
		
		// 구조체 안에 있는 내용을 하나씩 출력하지 않고, method를 통해 한꺼번에 호출할 수 있음
		getInfo(personA); // getInfo method로 이동
		                  // - a를 p에 대입(일시적으로 p에 a의 주소값과 동일한 값을 대입 - 여러 참조변수는 하나의 객체를 가리킬 수 있음)
		getInfo(personB);
		
		P002Cat catA = new P002Cat();
		catA.name = "cat1";
		catA.age = 1;
		catA.kind = "black";
		
		P002Cat catB = new P002Cat();
		catB.name = "cat2";
		catB.age = 2;
		catB.kind = "yellow";
		
		getCatInfo(catA);
		getCatInfo(catB);
	}
}

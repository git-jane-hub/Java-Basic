package polymorphism;

public class P01Main {
	public static void main(String[] args) {
		/* 부모 타입인 Person 만으로도 양쪽 자료형을 모두 처리 가능
		 * 처리는 가능하지만(데이터를 받을 수는 있지만), 
		 * 해당 변수의 타입은 Person이기 때문에
		 * 자식 타입인 Student, Army는 통제 할 수는 없음 -> 오버라이딩과 오버로딩으로 보정
		 */
		P01Person a1 = new P01Army("김군인", 21, "대장");
		P01Person s1 = new P01Student("박학생", 12, 4);
//		P01Student a1 = new P01Student("김군인", 1, "대장");
		
		// 메서드는 Person을 베이스 객체는 Person에 정의된 메서드만 호출 가능
		a1.showPerson();
//		a1.showArmy();     // 에러 발생
		/* 오버라이딩을 하면 참조변수의 타입이 부모라고 하더라도
		 * 자식에 있는 내용이 호출됨 - 다형성의 핵심
		 */
		s1.showPerson();
//		s1.showStudent();  // 에러 발생
		
		P01Person sm1 = new P01Salaryman("최사원", 30, 4000);
		sm1.showPerson();
		
	}
}
